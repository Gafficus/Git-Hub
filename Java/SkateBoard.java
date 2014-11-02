/*---------------------
Created by: NAthan Gaffney
29-October-2014
JAVA PROGRAMMING - CST-183-FA110-14FA-COURSE
This class will create an order for skateboard parts.
Errors Handled: 
Dependencies: None
Methods:
buildContentPane
buildPanButtons
clearTexts
calcTotals
----------------------*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SkateBoard extends JFrame
{
   //Window Size
   final int WINDOW_WIDTH = 720;
   final int WINDOW_HEIGHT = 600;
   //Container
   private Container contentPane;
   private Container titlePane;
   //Lists
   private JList lstDecks;
   private JList lstTruckAssemblies;
   private JList lstWheels;
   private JList lstMisc;
   //Buttons
   private JButton btnExit;
   private JButton btnCalcOrder;
   //Labels
   private JLabel lblShopName;
   //private JLabel lbl
   
   public SkateBoard()
   {
      //Basic WIndow Creation
      setTitle("Computron...");
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Create the content pane
      buildContentPane();
      add(contentPane,BorderLayout.CENTER);
      
      //Company Name
      lblShopName = new JLabel("Rocket Power Conglomerate Shop INC.");
      add(lblShopName,BorderLayout.NORTH);
   }
   private void buildTitlePane()
   {
      
   }
   private void buildContentPane()
   {
      contentPane = new JPanel();
      contentPane.setLayout(new BorderLayout());
      setLayout(new BorderLayout());
   }
   public static void main(String[] args)
  	{
   	SkateBoard gui = new SkateBoard();
      gui.setVisible(true);
   }

}