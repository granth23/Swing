import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.Color;

public class MyLayers {
    public static void main(String[] args) {

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layers = new JLayeredPane();
        layers.setBounds(0, 0, 500, 500);

        layers.add(label1);
        layers.add(label2);
        layers.add(label3);

        MyFrame frame = new MyFrame();

        frame.add(layers);
    }
}
