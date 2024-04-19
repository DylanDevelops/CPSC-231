/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP3B: ERS
**/

import java.util.LinkedList;

public class Player {
    private int m_playerNum;
    private LinkedList<Card> m_hand;
    private String m_pattern;

    /**
     * An overloaded constructor that
     * creates a new instance of the
     * player class.
     * 
     * @param playerNum 
     * @param hand 
     * @param pattern 
     */
    public Player(int playerNum, LinkedList<Card> hand, String pattern) {
        this.m_playerNum = playerNum;
        this.m_hand = hand;
        this.m_pattern = pattern;
    }

    // Accessors for member variables
    public void setPlayerNum(int playerNum) { m_playerNum = playerNum; }
    public void setHand(LinkedList<Card> hand) { m_hand = hand; }
    public void setPattern(String pattern) { m_pattern = pattern; }

    // Mutators for member variables
    public int getPlayerNum() { return m_playerNum; }
    public LinkedList<Card> getHand() { return m_hand; }
    public String getPattern() { return m_pattern; }

    /**
     * A toString method that is used anytime the 
     * Object needs to be referenced as a String.
     * 
     * @return The String 
     */
    public String toString() {
        return "Player #" + m_playerNum + "\nPattern: " + m_pattern + "\nHand: " + m_hand.toString();
    }

    /**
     * Plays the players first card
     * 
     * @return A card that is the card played by the player.
     */
    public Card playCard() {
        if(!m_hand.isEmpty()) {
            return m_hand.removeFirst();
        } else {
            return null;
        }
    }

    /**
     * Determines if the player can "slap" the pile based on the current pattern.
     * 
     * @param pile the pile of cards to check for a valid slap
     * @return true if the player can slap the pile, false otherwise
     */
    public boolean slaps(LinkedList<Card> pile) {
        switch (m_pattern) {
            case "doubles":
                return Game.doubles(pile);

            case "top bottom":
                return Game.topBottom(pile);
        
            case "sandwich":
                return Game.sandwich(pile);

            default:
                return false;
        }
    }
}
