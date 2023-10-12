import javax.swing.*;
import java.awt.*;

class MyScroll{
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());

        JTextArea ta1 = new JTextArea(7, 20);
        JScrollPane scrollPane = new JScrollPane(ta1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}