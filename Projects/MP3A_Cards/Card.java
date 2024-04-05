/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP3A: Cards
**/

/**
 * The public class for cards to reference
 */
public class Card {
    // Value and suit member variables
    private int m_value;
    private int m_suit;

    // Static Suit Identifiers
    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;

    // Static value identifiers
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    /**
     * A default constructor which makes an
     * ace of spades.
     */
    public Card() {
        this.m_value = ACE;
        this.m_suit = SPADES;
    }

    /**
     * An overloaded constructor which makes
     * a card based on the passed in
     * parameters.
     * 
     * @param value An int representing the value of the card
     * @param suit An int representing the suit of the card
     */
    public Card(int value, int suit) {
        this.m_value = value;
        this.m_suit = suit;
    }

    /**
     * An overloaded copy constructor which makes
     * a card based on another Card class.
     * 
     * @param card A card object used as a original for the copy.
     */
    public Card(Card card) {
        this.m_value = card.getValue();
        this.m_suit = card.getSuit();
    }

    /**
     * A method which is called whenever the object
     * needs to be represented as a String.
     */
    public String toString() {
        String suit = "";
        switch(m_suit) {
            case 0:
                suit = "Hearts";
                break;

            case 1: 
                suit = "Spades";
                break;

            case 2:
                suit = "Clubs";
                break;

            case 3:
                suit = "Diamonds";
                break;

            default:
                suit = "[INVALID SUIT]";
                break;
        }
        
        String value = "";
        if(m_value > 10 || m_value == 1) {
            switch(m_value) {
                case JACK:
                    value = "Jack";
                    break;

                case QUEEN:
                    value = "Queen";
                    break;

                case KING:
                    value = "King";
                    break;

                case ACE:
                case 1:
                    value = "Ace";
                    break;

                default:
                    value = "[INVALID VALUE]";
                    break;
            }
        } else {
            value = Integer.toString(m_value);
        }

        return value + " of " + suit;
    }

    /**
     * A method which is called whenever the object
     * needs to be compared to another card object.
     * 
     * @param otherCard Another card object in which to be compared to.
     * @return Either true or false depending on if the values are the same.
     */
    public boolean equals(Card otherCard) {
        if(m_value == otherCard.getValue()) return true;

        return false;
    }

    /**
     * An accessor for the value variable.
     * 
     * @return An int representing the value of the card.
     */
    public int getValue() {
        return m_value;
    }

    /**
     * An accessor for the suit variable.
     * 
     * @return An int representing the suit of the card.
     */
    public int getSuit() {
        return m_suit;
    }

    /**
     * A mutator for the value variable.
     * 
     * @param value An int representing the value of the card.
     */
    public void setValue(int value) {
        m_value = value;
    }

    /**
     * A mutator for the suit variable.
     * 
     * @param suit An int representing the suit of the card.
     */
    public void setSuit(int suit) {
        m_suit = suit;
    }
}
