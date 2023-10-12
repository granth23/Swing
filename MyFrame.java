import javax.swing.*;

public class MyFrame extends JFrame{

    MyFrame(){

        this.setTitle("My First GUI"); // Set the window title
        this.setSize(420, 420); // Set the window size to 420x420 pixels
        this.setVisible(true); // Make the window visible

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        this.setResizable(true); // Prevent the user from resizing the window

        this.setLayout(null);

    }
}