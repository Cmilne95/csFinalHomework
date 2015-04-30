import java.io.*;

public class WarGameCW
{
   public static void main(String[] args)throws FileNotFoundException
   {
      //create game
      Game game = new Game();
      
      //sim game
      int win = game.simGame();
      
      //show winner
      if (win == 1)
      {
         System.out.println("Player 1 won!");
      }
      
      else if (win == 2)
      {
         System.out.println("Player 2 won!");
      }
   }
}