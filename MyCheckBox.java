import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;

public class MyCheckBox {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());

        JCheckBox checkBox = new javax.swing.JCheckBox("Check me!");
        checkBox.setFocusable(false);

        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getSource() == checkBox){
                    System.out.println(checkBox.isSelected());
                }
            }
        });

        frame.add(checkBox);

    }
}
