package Projects.MP3A_Cards;

/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP3A: Cards
**/

// Import statements needed for my program to work.
import java.util.LinkedList;
import java.util.Random;

/**
 * The public class for decks to reference
 */
public class Deck {
    // Member variable for the list of cards
    private LinkedList<Card> m_cards = new LinkedList<Card>();

    /**
     * A default constructor which creates a
     * deck of 52 cards.
     */
    public Deck() {
        for(int suit = 0; suit < 4; suit++) {
            for(int value = 1; value < 14; value++) {
                this.m_cards.add(new Card(value, suit));
            }
        }
    }

    /**
     * An overloaded constructor which creates
     * a deck of cards that copies a provided
     * deck.
     * 
     * @param deck A deck of cards used to create a copy.
     */
    public Deck(Deck deck) {
        this.m_cards = deck.getCards();
    }

    /**
     * A method used in case the Deck class
     * needs to be displayed in string format.
     */
    public String toString() {
        return m_cards.toString();
    }

    /**
     * An accessor of the cards variable.
     * 
     * @return A LinkedList containing the cards in the deck.
     */
    public LinkedList<Card> getCards() {
        return m_cards;
    }

    /**
     * Deals a random card from the deck.
     * 
     * @return The card that was pulled from the deck.
     */
    public Card deal() {
        Random randy = new Random();
        int index = randy.nextInt(m_cards.size());
        return m_cards.remove(index);
    }
}
