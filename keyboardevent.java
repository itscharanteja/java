import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class keyboardevent extends JFrame implements KeyListener {

    JTextField textField;
    JLabel label;

    public keyboardevent() {
        super("Key Event Example");

        textField = new JTextField();
        textField.addKeyListener(this);
        add(textField, BorderLayout.NORTH);

        label = new JLabel();
        add(label, BorderLayout.SOUTH);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyCode());
    }

    public static void main(String[] args) {
        new keyboardevent();
    }
}
