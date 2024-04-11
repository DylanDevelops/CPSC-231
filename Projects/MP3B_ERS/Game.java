package Projects.MP3B_ERS;

/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP3B: ERS
**/

import java.util.LinkedList;
import java.util.Random;

public class Game {
    private LinkedList<Player> m_players;
    private LinkedList<Card> m_pile;
    private Dealer m_dealer;
    private static final String[] PATTERNS = {"doubles", "top bottom", "sandwich"};

    public Game() {
        initializeGame(2);
    }

    public Game(int numOfPlayers) {
        initializeGame(numOfPlayers);
    }

    public void setPlayers(LinkedList<Player> players) { this.m_players = players; }
    public void setPile(LinkedList<Card> pile) { this.m_pile = pile; }
    public void setDealer(Dealer dealer) { this.m_dealer = dealer; }
    public void setPatterns(String[] patterns) { this.m_patterns = patterns; }

    public LinkedList<Player> getPlayers() { return m_players; }
    public LinkedList<Card> getPile() { return m_pile; }
    public Dealer getDealer() { return m_dealer; }
    public String[] getPatterns() { return m_patterns; }

    public void initializeGame(int numOfPlayers) {
        m_players = new LinkedList<Player>();
        m_pile = new LinkedList<Card>();
        m_dealer = new Dealer();

        Random rand = new Random();
        for(int i = 0; i < numOfPlayers; i++) {
            m_players.add(new Player(i + 1, m_dealer.deals(Deck.ALL_CARDS / numOfPlayers), PATTERNS[rand.nextInt(PATTERNS.length)]));
            System.out.println("Hand of Player #" + m_players.get(i).getPlayerNum() + ": " + m_players.get(i).getHand());
        }
    }

    public int play() {
        Player currentPlayer = m_players.get(0);
        // carries out the rules of the game until there is one Player remaining. At the end, it should return the integer of the winning Player.
        while(m_players.size() > 1) {
            if(currentPlayer.getHand().isEmpty()) {
                System.out.println("Player #" + currentPlayer.getPlayerNum() + " has run out of cards. They lose!");
                m_players.remove(currentPlayer);
            }

            Card playedCard = currentPlayer.playCard();

            if(playedCard == null) {
                System.out.println("Player #" + currentPlayer.getPlayerNum() + " is out of cards. They lose!");
                m_players.remove(currentPlayer);
                continue;
            }

            m_pile.add(playedCard);

            if(playedCard.isFaceCard()) {
                handleFaceCard(currentPlayer, playedCard);
            } else if(currentPlayer.slaps(m_pile)) {
                System.out.println("Player #" + currentPlayer.getPlayerNum() + " slaps the pile!");
                currentPlayer.getHand().addAll(m_pile);
                m_pile.clear();
            }

            // Play goes to the next player
            currentPlayer = nextPlayer(currentPlayer);
        }

        return m_players.get(0).getPlayerNum();
    }

    private Player nextPlayer(Player currentPlayer) {
        // returns the Player object of the next player in the circle after the current player (helpful to use this during face-card face-offs)
        return m_players.get((m_players.indexOf(currentPlayer) + 1) % m_players.size());
    }

    private boolean handleFaceCard(Player player, Card topCard) {
        boolean faceCardPlayed = false;
        int chances = 0;
        switch (topCard.getValue()) {
            case Card.JACK:
                chances = 1;
                break;
            case Card.QUEEN:
                chances = 2;
                break;
            case Card.KING:
                chances = 3;
                break;
            case Card.ACE:
            case 1:
                chances = 4;
                break;
            default:
                chances = 0;
                break;
        }

        for(int i = 0; i < chances; i++) {
            player = nextPlayer(player);
            topCard = player.playCard();

            if(topCard == null) {
                System.out.println("Player #" + player.getPlayerNum() + " is out ofd cards. They lose!");
                m_players.remove(player);
                break;
            } else {
                m_pile.add(topCard);
            }

            if(topCard.isFaceCard()) {
                faceCardPlayed = true;
                break;
            }
        }

        if(!faceCardPlayed) {
            player.getHand().addAll(m_pile);
            m_pile.clear();
        }

        return faceCardPlayed;
    }

    public static boolean doubles(LinkedList<Card> pile) {
        if(pile.size() < 2) return false;
        return pile.get(pile.size() - 1).getValue() == pile.get(pile.size() - 2).getValue();
    }

    public static boolean topBottom(LinkedList<Card> pile) {
        if(pile.size() < 3) return false;
        return pile.get(pile.size() - 1).getValue() == pile.get(pile.size() - 3).getValue();
    }

    public static boolean sandwich(LinkedList<Card> pile) {
        if(pile.size() < 2) return false;
        return pile.get(0).getValue() == pile.get(pile.size() - 1).getValue();
    }
}
