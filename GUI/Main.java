
import java.awt.Color;
import java.awt.Font;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Main {

public static void main(String[] args) {

    ImageIcon image = new ImageIcon("jolibee.png");
    
    JLabel label = new JLabel(); //To create instances of label 

    
    label.setIcon(image);
    label.setText("HELLO! THIS IS JULIBI"); //my text
    label.setHorizontalTextPosition(JLabel.CENTER); //LEFT, RIGHT, CENTER
    label.setVerticalTextPosition(JLabel.BOTTOM); //TOP, CENTER, BOTTOM
    label.setForeground(Color.white); //Color of my text
    label.setFont(new Font("Calibri", Font.BOLD, 19)); //Style, Font, and Size of my text
    label.setIconTextGap(10);//to set the gap
    label.setVerticalAlignment(JLabel.CENTER); //Set the Vertical alignment of the label and icon
    label.setHorizontalAlignment(JLabel.CENTER);//Set the Horizontal alignment of the label and icon
    label.setBounds(0, 0, 0, 0);
    label.setBounds(750, 25, 500, 400);


   

    
    



    


    

    JFrame frame = new JFrame(); //To create instances of frames
    frame.setVisible(true); //To make the GUI appear on window
    frame.setSize(500, 500); //To set the size || x, y values
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close 
    frame.add(label);//to add my label
    frame.setTitle("Jolichupas counter"); //to add my title
    //frame.setResizable(false); //prevents the user to change the window
    frame.getContentPane().setBackground(new Color(240, 76, 76)); //change color of my GUI
    
    ImageIcon image2 = new ImageIcon("jabilee.jpg");
    frame.setIconImage(image2.getImage());
    
    



   

    
}
    
}