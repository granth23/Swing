package Extras;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyOption {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello There", "Option Pane", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello There", "Option Pane", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello There", "Option Pane", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello There", "Option Pane", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello There", "Option Pane", JOptionPane.ERROR_MESSAGE);

        int cont = JOptionPane.showConfirmDialog(null, "Hello There", "Option Pane", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(cont);

        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);

        String[] responses = {"Yes", "No", "Maybe"};
        ImageIcon icon = new ImageIcon("icon.png");

        int opt = JOptionPane.showOptionDialog(
            null,
            "Choose One",
            "Option Pane",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,
            responses,
            0
        );
        System.out.println(opt);

    }
}
