

/**
 	Chris Milne
 	CS 110
 	An object that contains an item and references another Node 
 */

public class Node 
{
	//declare variables
	private Card item;
	private Node next;
	
	/**
	 	create new node with given data
	 	will reference null
	 	@param newItem is data to be added to the node
	 */
	public Node(Card newItem)
	{
		item = newItem;
		next = null;
	}
	
	/**
	 	create a node with specified data
	 	have node reference nextNode parameter
	 	@param newItem is data to be added to node
	 	@param nextNode is the node that the new node will reference
	 */
	public Node(Card newItem, Node nextNode)
	{
		item = newItem;
		next = nextNode;
	}
	
	//getters
	/**
	 	returns Object in item 
	 	@return item is the Object in the item field
	 */
	public Card getItem()
	{
		return item;
	}
	
	/**
	 	returns the Node referenced by next
	 	@return next is the Node that this node references
	 */
	public Node getNext()
	{
		return next;
	}
	
	//setters
	/**
	 	sets item to a new Object
	 	@param newItem is a new Object for the item field
	 */
	public void setItem(Card newItem)
	{
		item = newItem;
	}
	
	/**
	 	sets next to a new Node
	 	@param nextNode is the new Node that this Node will reference
	 */
	public void setNext(Node nextNode)
	{
		next = nextNode;
	}
}
