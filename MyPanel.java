import javax.swing.JPanel;
import java.awt.Color;

public class MyPanel {

    public static void main(String[] args){

        MyFrame myFrame = new MyFrame();

        int height = myFrame.getHeight();
        int width = myFrame.getWidth();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, width/2, height/2);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(width/2, 0, width/2, height/2);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, height/2, width, height/2);

        myFrame.add(redPanel);
        myFrame.add(bluePanel);
        myFrame.add(greenPanel);

    }

}
