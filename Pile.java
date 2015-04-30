
public class Pile 
{
   //declare variables
   private Stack pile;
   
   /**
      creates new empty pile
   */
   public Pile()
   {
      pile = new Stack();
   }
   
   /**
      removes and returns the top card
      @return current is the current card
   */
   public Card getTop()
   {
         Card current;
         current = pile.pop();
         return current;
   }
   
   /** 
      pushes a new card to the stack
      @param newCard is the new card being pushed
   */
   public void push(Card newCard)
   {
      pile.push(newCard);
   }
   
   /**
      gets the stack
      @return pile the stack
   */
   public Stack getStack()
   {
      return pile;
   }
 }
