import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class switchScreen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ITC");
        frame.setSize(500, 500);

        JPanel screen1, screen2;

        screen1 = new JPanel();
        screen1.setSize(500, 500);
        screen1.setLayout(null);
        screen1.setBackground(Color.GREEN);
        
        screen2 = new JPanel();
        screen2.setSize(500, 500);
        screen2.setLayout(null);
        screen2.setBackground(Color.BLUE);

        JButton b1, b2;

        b1 = new JButton("Go to B");
        b1.setBounds(80, 300, 300, 50);
        b1.setFocusable(false);

        b1.addActionListener(e->{
            screen1.setVisible(false);
            screen2.setVisible(true);
        });

        b2 = new JButton("Go to A");
        b2.setBounds(80, 300, 300, 50);
        b2.setFocusable(false);

        b2.addActionListener(e->{
            screen2.setVisible(false);
            screen1.setVisible(true);
        });

        screen1.add(b1);
        screen2.add(b2);

        frame.add(screen1);
        frame.add(screen2);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
