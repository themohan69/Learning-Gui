import java.util.*;
import java.awt.*;
import javax.swing.*;
public class FlowLayout1{
    public static void main(String [] args){
        JFrame newFrame = new JFrame("First Frame");
        newFrame.setSize(500, 500);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField t = new JTextField("Write What You Can!");
        JButton b0 = new JButton("Click Me!");
        JButton b1 = new JButton("Click Me!");
        JButton b2 = new JButton("Click Me!");
        JButton b3 = new JButton("Click Me!");
        // JPanel p = new JPanel();
        newFrame.setLayout(new FlowLayout());
        newFrame.add(t);
        newFrame.add(b0);
        newFrame.add(b1);
        newFrame.add(b2);
        newFrame.add(b3);
        // newFrame.add(p);
        newFrame.setVisible(true);
    }
}