package eventhandling;

import java.awt.event.*;
import javax.swing.*;

public class ActionListenerExample implements ActionListener {
    final JTextField t;
    JButton b;
    JFrame f;

    ActionListenerExample() {
        f = new JFrame("First");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t = new JTextField("Write Here");
        t.setBounds(50, 50, 150, 20);
        b = new JButton("Click Me");
        b.setBounds(50, 150, 250, 50);
        b.addActionListener(this);
        f.add(b);
        f.add(t);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.setText("Hello Boy");
    }

    public static void main(String args[]) {
        ActionListenerExample ob1 = new ActionListenerExample();
    }
}
