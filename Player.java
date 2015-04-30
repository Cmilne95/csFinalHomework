
public class Player 
{
	//declare variables
	private Pile pile;
	private DiscardPile dPile;
   
   /**
      creates a new player with an empty pile and discard pile
   */
   public Player()
   {
      pile = new Pile();
      dPile = new DiscardPile();
   }
   
   /**
      adds card to pile
      @param newCard is the new card to add to pile
   */ 
   public void addCard(Card newCard)
   {
      pile.push(newCard);
   }
   
    /**
      gets dPile
      @return pile is the pile for the player
   */
   public DiscardPile getDPile()
   {
      return dPile;
   }

   
   /**
      gets pile
      @return pile is the pile for the player
   */
   public Pile getPile()
   {
      return pile;
   }
   
   /**
      adds to dpile
      @param newcard is a new card
   */
   public void addDPile(Card newCard)
   {
      dPile.addNew(newCard);
   }
   
   /**
      sets pile
      @param newPile is the new pile
   */
   public void setPile(Pile newPile)
   {
      pile = newPile;
   }
}
