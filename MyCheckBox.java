import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class MyCheckBox {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());

        JCheckBox checkBox = new javax.swing.JCheckBox("Check me!");
        checkBox.setFocusable(false);

        JButton button = new JButton("Click me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == button){
                    System.out.println(checkBox.isSelected());
                    checkBox.setSelected(false);
                }
            }
        });

        frame.add(checkBox);
        frame.add(button);
    }
}
