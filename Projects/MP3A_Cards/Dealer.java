package Projects.MP3A_Cards;

/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP3A: Cards
**/

// Import statement needed for my program to work.
import java.util.LinkedList;

/**
 * The public class for dealers to reference.
 */
public class Dealer {
    // Member variables for the deck.
    private Deck m_deck;

    /**
     * A default constructor that creates a
     * new Deck for the dealer when called.
     */
    public Dealer() {
        m_deck = new Deck();
    }

    /**
     * A method meant for whenever the dealer
     * is referenced as a String.
     */
    public String toString() {
        return m_deck.toString();
    }

    /**
     * A method that deals "n" number of cards
     * per call.
     * 
     * @param n An int representing the number of cards needing to be drawn.
     * @return A LinkedList of cards.
     */
    public LinkedList<Card> deals(int n) {
        LinkedList<Card> dealtCards = new LinkedList<Card>();
        for(int i = 0; i < n; i++) {
            if(m_deck.getCards().isEmpty()) {
                break;
            }
            Card card = m_deck.deal();
            dealtCards.add(card);
        }
        return dealtCards;
    }

    /**
     * A method for grabbing the size of a
     * deck.
     * 
     * @return An int representing the number of cards in the deck.
     */
    public int size() {
        return m_deck.getCards().size();
    }
}
