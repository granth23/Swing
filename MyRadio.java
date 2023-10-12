import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class MyRadio {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());

        JRadioButton radio1 = new JRadioButton("Radio 1");
        JRadioButton radio2 = new JRadioButton("Radio 2");
        JRadioButton radio3 = new JRadioButton("Radio 3");

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == radio2){
                    System.out.println("Radio 2 selected");
                }
                else if(e.getSource() == radio3){
                    System.out.println("Radio 3 selected");
                }
                else if(e.getSource() == radio1){
                    System.out.println("Radio 1 selected");
                }
            }
        };

        radio1.addActionListener(listener);
        radio2.addActionListener(listener);
        radio3.addActionListener(listener);

        frame.add(radio1);
        frame.add(radio2);
        frame.add(radio3);

    }

}