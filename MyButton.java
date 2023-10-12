import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyButton {

    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame(); // Create a frame

        JButton myButton = new JButton("Submit"); // Create a button
        myButton.setBounds(100, 100, 250, 100); // Set button position and size

        System.out.println(myButton.getText()); // Print to console

        myButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
                myButton.setText("Click me");
            }
        });

        myFrame.add(myButton); // Add button to frame

    }

}