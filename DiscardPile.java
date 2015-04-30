import java.util.*;

public class DiscardPile extends Deck
{
   /**
      creates an empty DiscardPile
   */
   public DiscardPile()
   {
      super();
   }
   
   /**
      adds a card new card
      @param newCard is a new card to be added to the array list
   */
   public void addNew(Card newCard)
   {
      deck.add(newCard);
   }
   
   /**
      returns the number of cards in the discard pile
      @return count is the number of cards in the pile
   */
   public int getCount()
   {
      int count = deck.size();
      return count;
   }
   
   /**
      gets the array list object
      @return deck is the array list
   */
}  
