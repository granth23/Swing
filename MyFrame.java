import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame   ;

public class MyFrame extends JFrame{

    MyFrame(){

        ImageIcon image = new ImageIcon("logo.jpg"); // Create an ImageIcon

        this.setTitle("My First GUI"); // Set the window title
        this.setSize(420, 420); // Set the window size to 420x420 pixels
        this.setVisible(true); // Make the window visible

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        this.setResizable(true); // Prevent the user from resizing the window

        this.getContentPane().setBackground(new Color(0x524f81)); // Change color of background
        this.setIconImage(image.getImage()); // Change icon of frame
        this.setLayout(null);

    }

}
