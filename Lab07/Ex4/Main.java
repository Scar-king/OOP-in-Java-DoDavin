package Ex4;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ITC");
        frame.setSize(500, 700);

        JPanel screen1, screen2, screen3;

        // Screen 1 implementation

        screen1 = new JPanel();
        screen1.setBounds(0, 0, 500, 700);
        screen1.setBackground(Color.WHITE);
        screen1.setLayout(null);

        JLabel l1 = new JLabel("Setting");
        l1.setFont(new Font("Arial", Font.BOLD, 26));
        l1.setBounds(10, 1, 200, 50);

        JButton b1 = new JButton("General");
        b1.setBounds(50, 80, 400, 50);
        b1.setFont(new Font("Arail", Font.BOLD, 20));
        b1.setFocusable(false);
        b1.setBackground(new Color(0, 123, 255));
        b1.setForeground(Color.WHITE);

        JButton b2 = new JButton("Wi-Fi");
        b2.setBounds(50, 140, 400, 50);
        b2.setFont(new Font("Arail", Font.BOLD, 20));
        b2.setFocusable(false);
        b2.setBackground(new Color(0, 123, 255));
        b2.setForeground(Color.WHITE);

        JButton b3 = new JButton("Bluetooth");
        b3.setBounds(50, 200, 400, 50);
        b3.setFont(new Font("Arail", Font.BOLD, 20));
        b3.setFocusable(false);
        b3.setBackground(new Color(0, 123, 255));
        b3.setForeground(Color.WHITE);

        JButton b4 = new JButton("Mobile Data");
        b4.setBounds(50, 260, 400, 50);
        b4.setFont(new Font("Arail", Font.BOLD, 20));
        b4.setFocusable(false);
        b4.setBackground(new Color(0, 123, 255));
        b4.setForeground(Color.WHITE);

        JButton b5 = new JButton("Hostpot");
        b5.setBounds(50, 320, 400, 50);
        b5.setFont(new Font("Arail", Font.BOLD, 20));
        b5.setFocusable(false);
        b5.setBackground(new Color(0, 123, 255));
        b5.setForeground(Color.WHITE);

        JButton b6 = new JButton("Notification");
        b6.setBounds(50, 380, 400, 50);
        b6.setFont(new Font("Arail", Font.BOLD, 20));
        b6.setFocusable(false);
        b6.setBackground(new Color(0, 123, 255));
        b6.setForeground(Color.WHITE);

        JButton bq = new JButton("Quit");
        bq.setBounds(50, 440, 400, 50);
        bq.setFont(new Font("Arail", Font.BOLD, 20));
        bq.setFocusable(false);
        bq.setBackground(new Color(220, 53, 69));
        bq.setForeground(Color.WHITE);

        // Screen 2 implementation

        screen2 = new JPanel();
        screen2.setBounds(0, 0, 500, 700);
        screen2.setBackground(Color.WHITE);
        screen2.setLayout(null);

        JLabel l2 = new JLabel("Setting > General");
        l2.setFont(new Font("Arial", Font.BOLD, 26));
        l2.setBounds(10, 1, 400, 50);

        JButton bs1 = new JButton("About");
        bs1.setBounds(50, 80, 400, 50);
        bs1.setFont(new Font("Arail", Font.BOLD, 20));
        bs1.setFocusable(false);
        bs1.setBackground(new Color(0, 123, 255));
        bs1.setForeground(Color.WHITE);

        JButton bs2 = new JButton("Software Update");
        bs2.setBounds(50, 140, 400, 50);
        bs2.setFont(new Font("Arail", Font.BOLD, 20));
        bs2.setFocusable(false);
        bs2.setBackground(new Color(0, 123, 255));
        bs2.setForeground(Color.WHITE);

        JButton bs3 = new JButton("Storage");
        bs3.setBounds(50, 200, 400, 50);
        bs3.setFont(new Font("Arail", Font.BOLD, 20));
        bs3.setFocusable(false);
        bs3.setBackground(new Color(0, 123, 255));
        bs3.setForeground(Color.WHITE);

        JButton bsb = new JButton("Back");
        bsb.setBounds(50, 260, 400, 50);
        bsb.setFont(new Font("Arail", Font.BOLD, 20));
        bsb.setFocusable(false);
        bsb.setBackground(new Color(220, 53, 69));
        bsb.setForeground(Color.WHITE);

        // Screen 3 implementation

        screen3 = new JPanel();
        screen3.setBounds(0, 0, 500, 700);
        screen3.setBackground(Color.WHITE);
        screen3.setLayout(null);

        JLabel l3 = new JLabel("Setting > General > About");
        l3.setFont(new Font("Arial", Font.BOLD, 26));
        l3.setBounds(10, 1, 400, 50);

        JLabel lName, lPhone, lModel, lModelName, lVersion, lVersionNum;

        lName = new JLabel("Name");
        lName.setFont(new Font("Arial", Font.PLAIN, 15));
        lName.setBounds(50, 80, 400, 50);

        lPhone = new JLabel("iPhone");
        lPhone.setFont(new Font("Arial", Font.PLAIN, 15));
        lPhone.setBounds(350, 80, 400, 50);

        lModel = new JLabel("Model");
        lModel.setFont(new Font("Arial", Font.PLAIN, 15));
        lModel.setBounds(50, 120, 400, 50);

        lModelName = new JLabel("IXs");
        lModelName.setFont(new Font("Arial", Font.PLAIN, 15));
        lModelName.setBounds(350, 120, 400, 50);

        lVersion = new JLabel("Version");
        lVersion.setFont(new Font("Arial", Font.PLAIN, 15));
        lVersion.setBounds(50, 160, 400, 50);

        lVersionNum = new JLabel("18.5");
        lVersionNum.setFont(new Font("Arial", Font.PLAIN, 15));
        lVersionNum.setBounds(350, 160, 400, 50);

        JButton btn = new JButton("Back");
        btn.setBounds(50, 250, 350, 50);
        btn.setFont(new Font("Arail", Font.BOLD, 20));
        btn.setFocusable(false);
        btn.setBackground(new Color(220, 53, 69));
        btn.setForeground(Color.WHITE);

        bq.addActionListener(e -> {
            System.exit(0);
        });

        b1.addActionListener(e -> {
            screen1.setVisible(false);
            screen2.setVisible(true);
        });

        bsb.addActionListener(e -> {
            screen2.setVisible(false);
            screen1.setVisible(true);
        });

        bs1.addActionListener(e->{
            screen2.setVisible(false);
            screen3.setVisible(true);
        });

        btn.addActionListener(e -> {
            screen3.setVisible(false);
            screen2.setVisible(true);
        });

        // Screen 1
        screen1.add(b1);
        screen1.add(b2);
        screen1.add(b3);
        screen1.add(b4);
        screen1.add(b5);
        screen1.add(b6);
        screen1.add(bq);
        screen1.add(l1);
        frame.add(screen1);

        // Screen 2
        screen2.add(l2);
        screen2.add(bs1);
        screen2.add(bs2);
        screen2.add(bs3);
        screen2.add(bsb);
        frame.add(screen2);

        // Screen 3
        screen3.add(l3);
        screen3.add(lName);
        screen3.add(lPhone);
        screen3.add(lModel);
        screen3.add(lModelName);
        screen3.add(lVersion);
        screen3.add(lVersionNum);
        screen3.add(btn);
        frame.add(screen3);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
