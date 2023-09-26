import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.Color;

public class MyLabel{

    public static void main(String[] args){

        MyFrame myFrame = new MyFrame();

        ImageIcon image = new ImageIcon("logo.jpg"); // Create an ImageIcon
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3); // Create a border for the label

        JLabel label = new JLabel(); // Create a label

        label.setText("Hello World!"); // Set the text of the label
        label.setIcon(image); // Set the icon of the label
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // Set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0x00FF00)); // Set foreground (text) color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Set font of text
        label.setIconTextGap(10); // Set gap of text to image
        label.setBackground(Color.BLACK); // Set background color
        label.setBorder(border); // Set border
        label.setSize(256, 300);

        myFrame.add(label); // Add label to frame

    }

}
