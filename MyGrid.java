import java.awt.GridLayout;

import javax.swing.JButton;

public class MyGrid {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setLayout(new GridLayout(4, 3, 10, 10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("+"));
        frame.add(new JButton("0"));
        frame.add(new JButton("-"));

    }
}
