import javax.swing.*;
import java.awt.*; //Toolkit, Dimension
import java.awt.event.ActionEvent; // ActionEvent
import java.awt.event.ActionListener; //ActionListener

public class Calculator extends JFrame {
    public Calculator() {
        this.setTitle("JAVA Swing Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(40, 40, 440, 440);
        this.setVisible(true);
        this.centerWindow(this);
        JLabel label = new JLabel("Output");
        label.setBounds(30, 340, 180, 30);

        // Add the label to the main frame
        this.add(label);

        // Create a textarea 1
        JTextArea ta = new JTextArea();
        ta.setBounds(30, 90, 180, 30);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        this.add(ta);

        // Create a textarea 2
        JTextArea ta1 = new JTextArea();
        ta1.setBounds(30, 40, 180, 30);
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
        this.add(ta1);

        // Create and configure a JButton
        JButton button2 = new JButton("Subtract");
        button2.setBounds(30, 140, 180, 30);
        this.add(button2);

        // Create and configure a JButton for Addition
        JButton button1 = new JButton("Add");
        button1.setBounds(30, 190, 180, 30);

        // Add the label to the main frame
        this.add(button1);

        // Create and configure a JButton for product and multiply
        JButton button3 = new JButton("Multiply");
        button3.setBounds(30, 240, 180, 30);
        this.add(button3);
        JButton button4 = new JButton("Divide");
        button4.setBounds(30, 290, 180, 30);
        this.add(button4);

        // Add
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int n1 = Integer.parseInt(ta.getText());
                int n2 = Integer.parseInt(ta1.getText());

                int sum = n1 + n2;
                label.setText("Answer = " + Integer.toString(sum));
            }
        });
        this.setVisible(true);

        // Subtract
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int n1 = Integer.parseInt(ta.getText());
                int n2 = Integer.parseInt(ta1.getText());

                int diff = n2 - n1;
                label.setText("Answer = " + Integer.toString(diff));
            }
        });
        this.setVisible(true);

        // Multiply
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int n1 = Integer.parseInt(ta.getText());
                int n2 = Integer.parseInt(ta1.getText());

                int prod = n1 * n2;
                label.setText("Answer = " + Integer.toString(prod));
            }
        });
        this.setVisible(true);

        // Divide
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int n1 = Integer.parseInt(ta.getText());
                int n2 = Integer.parseInt(ta1.getText());

                double divide = (double) n2 / n1;
                label.setText("Answer = " + Double.toString(divide));
            }
        });
    }

    // Centers the frame on the screen
    private void centerWindow(Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        w.setLocation((d.width - w.getWidth()) / 2, (d.height - w.getHeight()) / 2);
    }
}