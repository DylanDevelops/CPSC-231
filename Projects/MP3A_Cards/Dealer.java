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

public class Dealer {
    private Deck m_deck;

    public Dealer() {
        m_deck = new Deck();
    }

    public String toString() {
        return m_deck.toString();
    }

    public LinkedList<Card> deals(int n) {
        Random randy = new Random();
        LinkedList<Card> dealtCards = new LinkedList<Card>();
        for(int i = 0; i < n; i++) {
            if(m_deck.getCards().isEmpty()) {
                break;
            }
            int randomIndex = randy.nextInt(m_deck.getCards().size());
            Card card = m_deck.getCards().remove(randomIndex);
            dealtCards.add(card);
        }
        return dealtCards;
    }

    public int size() {
        return m_deck.getCards().size();
    }
}
