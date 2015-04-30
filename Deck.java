
import java.io.*;
import java.util.*;

public class Deck 
{
	//declare variables
	protected ArrayList<Card> deck;
	
	/**
      creates empty Deck
   */
   public Deck()
   {
      deck = new ArrayList<Card>();
   }
   
   /**
	 	creates a standard deck of Card objects
      @param fileName is the name of the file used for images
	 */
	public Deck(String fileName) throws FileNotFoundException
	{
      deck = new ArrayList<Card>();
      File file = new File(fileName);//holds name of images in order
      Scanner inFile = new Scanner(file);//file scanner
      
      //for each suit
		for ( int newSuit = 1; newSuit < 5; newSuit++)
		{
			//for each rank
         for (int newRank = 2; newRank < 15; newRank++)
			{
				String newPic = inFile.nextLine();//gets name of image file
            Card newCard = new Card(newSuit, newRank, newPic);//create card
            deck.add(newCard);//add card to deck
			}
		}
      
      inFile.close();
	}
   
   /**
      shuffles the deck and adds returns a stack of the suffled data
      @param length is the number of objects being shuffled
      @return shuffled is a stack of suffled cards
   */
   public Stack shuffle(int length)
   {
      Stack shuffled = new Stack();
      Random rand = new Random();
      int lim = length;
      //loops through once for every card
      for (int i = 0; i < length; i++)
      {
         int index;
         index = rand.nextInt(lim);//chooses a random index
         Card current = deck.get(index);//get the card at that index
         shuffled.push(current);//add it to the stack
         deck.remove(index);//remove from deck to avoid repeating cards
         lim = lim - 1;
      }
      
      return shuffled;
   }
   
   /**
      gets the array list object
      @return deck is the array list
   */
   public ArrayList getDeck()
   {
      return deck;
   }
}  
