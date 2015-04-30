
public class Stack 
{
	private Node top;
   private int total;

	public Stack() 
	{
	  top = null;
     total = 0;
	} 
	 
	/** 
	 	Determines whether the stack is empty.
	    @return true if the stack is empty, otherwise returns false.
	*/
	public boolean isEmpty() 
	{
	  return top == null;
	}  
	  
	/** 
	 	Adds an item to the top of a stack.
	    @param newItem is the item to be added.
	*/
	public void push(Card newItem) throws StackException
	{
		top = new Node(newItem, top);
      total += 1;
	} 
	
	/** 
	 	Removes the top of a stack.
	    @return the item that was added most recently is removed 
	    	from the stack and returned.
	    @throws StackException if the stack is empty.
	*/
	public Card pop() throws StackException 
	{
	  if (!isEmpty()) 
	  {
		  Node temp = top;
	     top = top.getNext();
	     total = total - 1;
        return temp.getItem();
	  }
	  
     else 
	  {
	      throw new StackException("StackException on " +
	                               "pop: stack empty");
	  }  
	}  
	
	/** 
	 	remove all items from stack
	*/
	  
	public void popAll() 
	{
		top = null;
      total = 0;
	}
	  
	/** 
	 	Retrieves the top of a stack.
	    @return the item that was added most recently   
	    @throws StackException if the stack is empty.
	*/
	public Card peek() throws StackException 
	{
	    if (!isEmpty()) 
	    {
	      return top.getItem();
	    }
	    
	    else 
	    {
	      throw new StackException("StackException on " +
	                               "peek: stack empty");
	    }  
	}  
   
   /**
      returns total
      @return total is the number of cards in the stack
   */
   public int getTotal()
   {
      return total;
   }
}
