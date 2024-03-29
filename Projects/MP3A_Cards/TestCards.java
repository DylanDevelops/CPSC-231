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
 * The class meant for testing all the other classes.
 */
public class TestCards {
    /**
     * The main method that runs when the program starts.
     */
    public static void main(String[] args) {
        // Test Card Class
        Card card = new Card(1, 0);
        System.out.println("Card: " + card);

        // Test Deck Class
        Deck deck = new Deck();
        System.out.println("Number of cards in deck: " + deck.getCards().size());
    
        // Test Dealer Class
        Dealer dealer = new Dealer();
        System.out.println("Dealer's deck size: " + dealer.size());

        // Tests Dealing Cards
        LinkedList<Card> dealtCards = dealer.deals(5);
        System.out.println("Dealt Cards: " + dealtCards);
        System.out.println("Dealer's Deck Size After Dealing: " + dealer.size());
    }
}
