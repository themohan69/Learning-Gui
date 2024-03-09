import java.util.*;
import java.awt.*;
import javax.swing.*;
public class BorderLayout1{
    public static void main(String [] args){
        JFrame newFrame = new JFrame("First Frame");
        newFrame.setSize(500, 500);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField t = new JTextField("Write What You Can!");
        JButton b0 = new JButton("North");
        JButton b1 = new JButton("South");
        JButton b2 = new JButton("East");
        JButton b3 = new JButton("West");
        JButton b4 = new JButton("Center");
        Container c = newFrame.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(b0, BorderLayout.NORTH);
        c.add(b1, BorderLayout.SOUTH);
        c.add(b2, BorderLayout.EAST);
        c.add(b3, BorderLayout.WEST);
        c.add(b4, BorderLayout.CENTER);        
        newFrame.setVisible(true);
    }
}