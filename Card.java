
public class Card 
{
	//declare variables
	private int suit, rank;
	private String pic;

	/**
	 	creates a new card using given values
	 	@param newSuit is a new int value representing a specific suit
	 	@param newRank is a new int value representing the specific rank
	 	@param newPic is a string name for an image
	 */
	public Card(int newSuit, int newRank, String newPic)
	{
		suit = newSuit;
		rank = newRank;
		pic = newPic;
	}
	
	//getters
	/**
		gets the value of suit
		@param suit is the value in the suit field
	 */
	public int getSuit()
	{
		return suit;
	}
	
	/**
	 	gets value of rank
	 	@param rank is the value in the rank field
	 */
	public int getRank()
	{
		return rank;
	}
	
	/**
	 	gets the name of the image file
	 	@param pic is the name of the image file
	 */
	public String getPic()
	{
		return pic;
	}
	
	}
