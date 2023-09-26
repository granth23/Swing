import javax.swing.JButton;
import java.awt.FlowLayout;

public class MyFlow {
    public static void main(String args[]){
        MyFrame myFrame = new MyFrame();
        myFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        myFrame.add(new JButton("1"));
        myFrame.add(new JButton("1"));
        myFrame.add(new JButton("1"));
        myFrame.add(new JButton("1"));
        myFrame.add(new JButton("1"));

    }
}
