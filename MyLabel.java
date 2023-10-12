import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.FlowLayout;

public class MyLabel{

    public static void main(String[] args){

        MyFrame myFrame = new MyFrame();
        myFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        Border border = BorderFactory.createLineBorder(Color.GREEN, 3); // Create a border for the label

        JLabel label = new JLabel(); // Create a label

        label.setText("Hello World!"); // Set the text of the label
        label.setBorder(border); // Set border
        label.setSize(256, 300);

        JLabel label2 = new JLabel(); // Create a label

        label2.setText("Hello World!"); // Set the text of the label
        label2.setBorder(border); // Set border
        label2.setSize(256, 300);

        myFrame.add(label2);
        myFrame.add(label); // Add label to frame

    }

}
