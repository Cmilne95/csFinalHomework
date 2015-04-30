import javax.swing.*;
import java.awt.event.*;

public class WarGameGUI
{
   /**
      creates game in window
   */
   public WarGameGUI()
   {   
      //declare variables
      private JPanel panel;
      
      //declare finals
      final int HIGHT = 400;
      final int WIDTH = 300;
      
      //create window
      JFrame window = new JFrame();
      
      //set title
      window.setTitle("War");
      
      //set size
      window.setSize(WIDTH, HIGHT);
      
      //set close button
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //add panel
      buildPanel();
      add(panel);
      
      //display
      window.setVisible(true);
   }
   
   public void buildPanel()
   {
      //create button
      simButton = new JButton("Simulate");
      
      //add listener
      simButton.addActionListener(new simButtonListener());
      
      //add button to panel
      panel.add(simButton);
   }
}   

private class SimButtonListener impliments ActionListener
{
   public void actionPreformed (ActionEvent e)
   {
      Game game = new Game();
      
      game.simGame();
   }
}

public static void main(String[] args)
{
   new  WarGameGUI();
}