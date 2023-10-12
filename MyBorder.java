import javax.swing.JPanel;
import java.awt.*;

public class MyBorder {
    public static void main(String args[]) {
        MyFrame myFrame = new MyFrame(); // Create a frame
        myFrame.getContentPane().setBackground(Color.white);
        myFrame.setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.orange);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        myFrame.add(panel1, BorderLayout.NORTH);
        myFrame.add(panel4, BorderLayout.WEST);
        myFrame.add(panel2, BorderLayout.SOUTH);
        myFrame.add(panel3, BorderLayout.EAST);
        myFrame.add(panel5, BorderLayout.CENTER);
    }
}
