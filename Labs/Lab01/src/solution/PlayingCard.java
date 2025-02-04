package solution;

/**
 * PlayingCard.java
 */

/**
 * This class as given represents a playing card with Suits but no Rank. Your
 * job is to implement Ranks by creating the code described at the TODO markers.
 * 
 * @author Mitch Parry
 * @version May 6, 2013
 */
public class PlayingCard
{
    // Fields
    // TODO: Declare a SuitsAndRanks.Suit variable named suit;
    private SuitsAndRanks.Suit suit;

    // TODO: Declare a SuitsAndRanks.Rank variable named rank;
    private SuitsAndRanks.Rank rank;

    /**
     * Constructor - each card assigned a rank and suit when created by the Deck
     * class.
     * 
     * @param rank rank
     * @param suit suit
     */
    // TODO: Create constructor with first parameter 'rank' and second
    // parameter 'suit'
    public PlayingCard(SuitsAndRanks.Rank rank, SuitsAndRanks.Suit suit)
    {
        // TODO: Assign suit passed via constructor to field suit
    	setSuit(suit);
        // TODO: Assign rank passed via constructor to field rank
    	setRank(rank);
    }

    /**
     * Getter method that returns this card's Suit.
     * 
     * @return Suit of this card
     */
    // TODO: Write a getter method that returns this card's Suit
    public SuitsAndRanks.Suit getSuit()
    {
        return this.suit;
    }

    /**
     * Getter method that returns this card's Rank.
     * 
     * @return Rank of this card
     */
    // TODO: Write a getter method that returns this card's Rank
    public SuitsAndRanks.Rank getRank()
    {
    	return this.rank;
    }

    /**
     * Sets the suit of the card.
     * 
     * @param suit
     *            The new suit for this card
     */
    // TODO: Write a setter method for this card's Suit.
    public void setSuit(SuitsAndRanks.Suit suit)
    {
    	this.suit = suit;
    }

    /**
     * Sets the rank of this card.
     * 
     * @param rank
     *            The new rank for this card
     */
    // TODO: Write a setter method for this card's Rank.
    public void setRank(SuitsAndRanks.Rank rank)
    {
    	this.rank = rank;
    }

    /*
     * TODO: Override the toString method to return a string in the following
     * format: "Rank Suit".
     */
    /**
     * Returns a String representation of a PlayingCard.
     * 
     * @return The string.
     */
    @Override
    public String toString()
    {
        return getRank() + " " + getSuit();
    }
}
