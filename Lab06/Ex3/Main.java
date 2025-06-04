package Lab06.Ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static final int FONT_SIZE = 13;
    public static void main(String[] args) {

        try {
            for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create Frame
        JFrame frame = new JFrame("Character counter");
        frame.setSize(360, 330);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set Logo to frame
        ImageIcon logo = new ImageIcon("Image\\itc.png");
        ImageIcon bg = new ImageIcon("Image\\bg.jpg");
        frame.setIconImage(logo.getImage());
        
        // Set Background into frame
        JLabel background = new JLabel(bg);
        background.setBounds(0, 0, 360, 330);
        frame.setContentPane(background);

        JLabel description = new JLabel("Count number of Vowel, Consonant and Space");
        description.setBounds(25, 20, 300, 50);
        description.setForeground(Color.WHITE);
        description.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));

        JLabel text = new JLabel("Text: ");
        text.setBounds(25, 50, 100, 50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));

        JTextField textField = new JTextField();
        textField.setBounds(25, 100, 220, 30);
        textField.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));

        JButton button = new JButton("Find");
        button.setBounds(25, 150, 100, 30);
        button.setFocusable(false);
        button.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));

        JLabel vowelResultLabel = new JLabel();
        vowelResultLabel.setBounds(25, 175, 300, 50);
        vowelResultLabel.setForeground(Color.WHITE);
        vowelResultLabel.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));

        JLabel consonantResultLabel = new JLabel();
        consonantResultLabel.setBounds(25, 200, 300, 50);
        consonantResultLabel.setForeground(Color.WHITE);
        consonantResultLabel.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));

        JLabel spaceResultLabel = new JLabel();
        spaceResultLabel.setForeground(Color.WHITE);
        spaceResultLabel.setBounds(25, 225, 300, 50);
        spaceResultLabel.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));

        frame.add(description);
        frame.add(text);
        frame.add(textField);
        frame.add(button);
        frame.add(vowelResultLabel);
        frame.add(consonantResultLabel);
        frame.add(spaceResultLabel);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String text = textField.getText();
                int vowels = 0, consonants = 0, space = 0;
                text = text.toLowerCase();

                for(int i = 0; i < text.length(); i++){
                    char ch = text.charAt(i);

                    if(Character.isLetter(ch)){
                        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                            vowels++;
                        } else {
                            consonants++;
                        }
                    } else if(ch == ' ') {
                        space++;
                    }
                }

                vowelResultLabel.setText("Count of vowel is: " + vowels);
                consonantResultLabel.setText("Count of consonant is: " + consonants);
                spaceResultLabel.setText("Count of space is: " + space);

                // Start Fade-in Animation
                Timer fadeTimer = new Timer(30, null);
                fadeTimer.addActionListener(new ActionListener() {
                    int alpha = 0;

                    public void actionPerformed(ActionEvent evt) {
                        alpha += 15;
                        if (alpha > 255) {
                            alpha = 255;
                            fadeTimer.stop();
                        }
                        Color fadeColor = new Color(255, 255, 255, alpha);
                        vowelResultLabel.setForeground(fadeColor);
                        consonantResultLabel.setForeground(fadeColor);
                        spaceResultLabel.setForeground(fadeColor);
                    }
                });
                fadeTimer.start();
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }   
}

// Reference LookAndFeel:
// https://www.google.com/url?sa=t&source=web&rct=j&opi=89978449&url=https://docs.oracle.com/javase/8/docs/api/javax/swing/UIManager.html&ved=2ahUKEwiuu8aR4syNAxVdSGwGHWc1PKIQFnoECAkQAQ&usg=AOvVaw0BNQQCLjuwYkkrvRCzIxtU