import java.util.*;
import java.io.*;

public class Game
{  
   //declare variables
   private Player player1;
   private Player player2;
   private int win = 0;
   
   /**
      constructs a game with two players each player starts with a stack of cards
         that come from a shuffled deck of cards
   */
   public Game()throws FileNotFoundException
   {
      player1 = new Player();
      player2 = new Player();
      
      Deck deck = new Deck("cardNames.txt");

      Stack shuffled = new Stack();
      shuffled = deck.shuffle(deck.getDeck().size());
      for (int i = 0; i < 26; i++)
      {
         player1.addCard(shuffled.pop());
         player2.addCard(shuffled.pop());
      } 
   }
   /**
      shuffles discard pile and adds it to the pile
      @param player is the player whos pile is being shuffled
   */
   public void shuffleDPile(Player player)
   {
      Stack shuffled = player.getDPile().shuffle(player.getDPile().getDeck().size());
      
      for (int i = 0; i < shuffled.getTotal(); i++)
      { 
         player.addCard(shuffled.pop());
      }
   }
      
   /**
      plays a round
   */
   public int playRound()
   {
            Card card1 = player1.getPile().getTop();
            Card card2 = player2.getPile().getTop();
            System.out.print(card1.getRank() + " | " + card2.getRank());
               
            if (card1.getRank() > card2.getRank())
            {
               System.out.println(" player 1");
               player1.addDPile(card1);
               player1.addDPile(card2);
            }
            
            else if (card2.getRank() > card1.getRank())
            {
               System.out.println(" player 2");
               player2.addDPile(card1);
               player2.addDPile(card2);
            }
            
            else 
            {
               Card card3 = player1.getPile().getTop();
               Card card4 = player1.getPile().getTop();
               Card card5 = player2.getPile().getTop();
               Card card6 = player2.getPile().getTop();
               System.out.print("/n_ , " + card4.getRank() + " | _ " + card6.getRank());
               
               if (card4.getRank() > card6.getRank())
               {
                  System.out.println(" player 1");
                  player1.addDPile(card1);
                  player1.addDPile(card2);
                  player1.addDPile(card3);
                  player1.addDPile(card4);
                  player1.addDPile(card5);
                  player1.addDPile(card6);
               }
               
               else if (card6.getRank() > card4.getRank())
               {
                  System.out.println(" player 2");
                  player2.addDPile(card1);
                  player2.addDPile(card2);
                  player2.addDPile(card3);
                  player2.addDPile(card4);
                  player2.addDPile(card5);
                  player2.addDPile(card6);
               }
               
               else
               {
                  player1.addDPile(card1);
                  player2.addDPile(card2);
                  player1.addDPile(card3);
                  player1.addDPile(card4);
                  player2.addDPile(card5);
                  player2.addDPile(card6);
               }
            }
         
            if (player1.getPile().getStack().getTotal() == 0 && player1.getDPile().getCount() == 0)
            {
               win = 2;
            }
            
            else if(player2.getPile().getStack().getTotal() == 0 && player2.getDPile().getCount() == 0)
            {
               win = 1;
            }
            
            else 
            {
               win = 0;
            }
            
            System.out.println(win); 
         
      //check for empty piles
      if (player1.getPile().getStack().getTotal() == 0)
      {
         shuffleDPile(player1);
      }
      
      if (player2.getPile().getStack().getTotal() == 0)
      {
         shuffleDPile(player2);
      }
      System.out.println("test");
      return win;
   }
   
   /**
      plays entire game
      @return win is the winner
   */
   public int simGame()
   {
      while (win == 0)
      {
         win = playRound();
         System.out.println(player1.getPile().getStack().getTotal());
         System.out.println(player2.getPile().getStack().getTotal());
      }
      
      System.out.println(win);
      return win;
   }
}
