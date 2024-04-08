package Projects.MP3B_ERS;

import java.util.LinkedList;

/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP3B: ERS
**/

public class Game {
    private LinkedList<Player> m_players;
    private LinkedList<Card> m_pile;
    private Dealer m_dealer;
    private String[] m_patterns;

    public Game() {

    }

    public Game(int numOfPlayers) {
        for(int i = 0; i < numOfPlayers; i++) {
            // loop through and add a player for every numOfPlayers (i + 1)
        }
    }

    public void setPlayers(LinkedList<Player> players) { m_players = players; }
    public void setPile(LinkedList<Card> pile) { m_pile = pile; }
    public void setDealer(Dealer dealer) { m_dealer = dealer; }
    public void setPatterns(String[] patterns) { m_patterns = patterns; }

    public LinkedList<Player> getPlayers() { return m_players; }
    public LinkedList<Card> getPile() { return m_pile; }
    public Dealer getDealer() { return m_dealer; }
    public String[] getPatterns() { return m_patterns; }

    public int play() {
        // carries out the rules of the game until there is one Player remaining. At the end, it should return the integer of the winning Player.
    }

    public Player nextPlayer() {
        // returns the Player object of the next player in the circle after the current player (helpful to use this during face-card face-offs)
    }

    public static boolean topBottom(LinkedList<Card> pile) {

    }

    public static boolean doubles(LinkedList<Card> pile) {

    }

    public static boolean sandwich(LinkedList<Card> pile) {

    }
}
