import java.awt.event.*;
import javax.swing.*;

public class mouseevent extends JFrame implements MouseListener {
    JLabel label;

    public mouseevent() {
        label = new JLabel("No Mouse Event");
        add(label);

        addMouseListener(this);

        setSize(500, 500);
        setTitle("Mouse Event Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new mouseevent();
    }
}
