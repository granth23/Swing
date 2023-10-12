import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JList;

public class MyList {
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());

        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5", "Option 6"};
        JList<String> list = new JList<>(options);

        JButton button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == button){
                    System.out.println(list.getSelectedValue());
                }
            }
        });

        frame.add(list);
        frame.add(button);

    }
}
