/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP3B: ERS
**/

// Import statement needed for my program to work.
import java.util.LinkedList;
import java.util.Random;

/**
 * The `Game` class represents a card game.
 * It manages the players, the pile of cards, and the dealer.
 * The game follows specific patterns and rules until there is one player remaining.
 * The class provides methods to initialize the game, play the game, and handle face cards.
 */
public class Game {
    // Member variables used for gameplay
    private LinkedList<Player> m_players;
    private LinkedList<Card> m_pile;
    private Dealer m_dealer;

    // A static array of Patterns that will be randomly chosen
    // from and assigned to each player.
    private static final String[] PATTERNS = {"doubles", "top bottom", "sandwich"};

    /**
     * A default constructor creating a 4 player game.
     */
    public Game() {
        initializeGame(4);
    }

    /**
     * An overloaded constructor creating a game with
     * the specified number of players.
     * 
     * @param numOfPlayers
     */
    public Game(int numOfPlayers) {
        initializeGame(numOfPlayers);
    }

    // Setters for each member variable
    public void setPlayers(LinkedList<Player> players) { this.m_players = players; }
    public void setPile(LinkedList<Card> pile) { this.m_pile = pile; }
    public void setDealer(Dealer dealer) { this.m_dealer = dealer; }

    // Getters for
    public LinkedList<Player> getPlayers() { return m_players; }
    public LinkedList<Card> getPile() { return m_pile; }
    public Dealer getDealer() { return m_dealer; }

    /**
     * Initializes the game with the specified number of players.
     * 
     * @param numOfPlayers The number of players in the game.
     */
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

    /**
     * Carries out the rules of the game until there is one Player remaining.
     * At the end, it returns the integer of the winning Player.
     *
     * @return The integer representing the winning Player.
     */
    public int play() {
        Player currentPlayer = m_players.get(0);
        // carries out the rules of the game until there is one Player remaining. At the end, it should return the integer of the winning Player.
        while(m_players.size() > 1) {
            Card playedCard = currentPlayer.playCard();

            if(playedCard == null) {
                System.out.println("Player #" + currentPlayer.getPlayerNum() + " is out of cards. They lose!");
                m_players.remove(currentPlayer);
                if(m_players.size() > 0) {
                    currentPlayer = m_players.get(0);
                }
                continue;
            }

            System.out.println("\nPlayer #" + currentPlayer.getPlayerNum() + " plays a turn. Their card is the " + playedCard + ".");

            m_pile.add(playedCard);

            if(playedCard.isFaceCard()) {
                handleFaceCard(currentPlayer, playedCard);
            } else if(currentPlayer.slaps(m_pile)) {
                System.out.println("Player #" + currentPlayer.getPlayerNum() + " slapped the pile! Their pattern was " + currentPlayer.getPattern().toUpperCase() + "!");
                currentPlayer.getHand().addAll(m_pile);
                m_pile.clear();
            }

            // Play goes to the next player
            currentPlayer = nextPlayer(currentPlayer);
        }

        return m_players.get(0).getPlayerNum();
    }

    /**
     * Switches the current player to the next one.
     * 
     * @param currentPlayer The current player who is playing.
     * @return The player next to the player who is still in the game.
     */
    private Player nextPlayer(Player currentPlayer) {
        // returns the Player object of the next player in the circle after the current player (helpful to use this during face-card face-offs)
        return m_players.get((m_players.indexOf(currentPlayer) + 1) % m_players.size());
    }

    /**
     * Handles the logic for playing a face card in the game.
     * 
     * @param player The player who played the face card.
     * @param topCard The current top card on the pile.
     * @return true if a face card was successfully played, false otherwise.
     */
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

        if(chances > 0) {
            System.out.println("Player #" + player.getPlayerNum() + " put down a face card. The next player has (" + chances + ") chances to play a face card.");
        }

        player = nextPlayer(player);
        for(int i = 0; i < chances; i++) {
            topCard = player.playCard();

            if(topCard == null) {
                System.out.println("Player #" + player.getPlayerNum() + " is out of cards. They lose!");
                m_players.remove(player);
                break;
            } else {
                System.out.println("(" + (chances - i) + ") chances Left: " + "Player #" + player.getPlayerNum() + " plays a card. Their card is a " + topCard + ".");
                m_pile.add(topCard);
            }

            if(topCard.isFaceCard()) {
                faceCardPlayed = true;
                System.out.println("Player #" + player.getPlayerNum() + " successfully beat the face card!");
                break;
            }
        }

        if(!faceCardPlayed) {
            player.getHand().addAll(m_pile);
            m_pile.clear();

            System.out.println("Player #" + player.getPlayerNum() + " failed to play a face card.");
        }

        return faceCardPlayed;
    }

    /**
     * Checks if the top two cards in the given pile have the same value.
     * 
     * @param pile the pile of cards to check
     * @return true if the top two cards have the same value, false otherwise
     */
    public static boolean doubles(LinkedList<Card> pile) {
        if(pile.size() < 2) return false;
        return pile.get(pile.size() - 1).getValue() == pile.get(pile.size() - 2).getValue();
    }

    /**
     * Checks if the top card and the card two positions below it in the given pile have the same value.
     * 
     * @param pile the LinkedList of cards representing the pile
     * @return true if the top card and the card two positions below it have the same value, false otherwise
     */
    public static boolean topBottom(LinkedList<Card> pile) {
        if(pile.size() < 3) return false;
        return pile.get(pile.size() - 1).getValue() == pile.get(pile.size() - 3).getValue();
    }

    /**
     * Checks if the first and last cards in the given pile have the same value.
     * 
     * @param pile the LinkedList of cards to check
     * @return true if the first and last cards have the same value, false otherwise
     */
    public static boolean sandwich(LinkedList<Card> pile) {
        if(pile.size() < 2) return false;
        return pile.get(0).getValue() == pile.get(pile.size() - 1).getValue();
    }
}
