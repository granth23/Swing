import javax.swing.*;
import java.awt.*;

public class MyComboBox extends JFrame {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());

        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        JLabel label = new JLabel("Please select an option");

        comboBox.addActionListener(e -> {
            String selectedOption = (String) comboBox.getSelectedItem();
            label.setText("You selected: " + selectedOption);
        });

        frame.add(comboBox);
        frame.add(label);
    }
}
