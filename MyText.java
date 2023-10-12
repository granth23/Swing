import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyText {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());

        JTextField text = new JTextField("username", 20);

        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == button){
                    System.out.println("Welcome " + text.getText());
                    text.setText("");
                }
            }
        });

        frame.add(text);
        frame.add(button);
        frame.pack();
    }
}
