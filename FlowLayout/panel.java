import javax.swing.*;

public class panel {
    public static void main(String[] args) {
        JFrame f = new JFrame("First Page");
        JTextField t = new JTextField("Hello");
        JButton b = new JButton("Click Me");
        JPanel p = new JPanel();
        p.add(t);
        p.add(b);
        f.add(p);
        b.setBounds(200, 100, 50, 50);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}