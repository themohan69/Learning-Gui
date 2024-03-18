package eventhandling;
// import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouseLE extends JFrame implements MouseListener {
    JLabel l;

    mouseLE() {
        addMouseListener(this);
        l = new JLabel();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new mouseLE();
    }
}