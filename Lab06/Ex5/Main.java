package Lab06.Ex5;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ITC");
        frame.setSize(420, 430);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Set Logo to Frame
        ImageIcon logo = new ImageIcon("Image\\itc.png");
        frame.setIconImage(logo.getImage());

        JLabel calculator = new JLabel("Caclulator");
        calculator.setFont(new Font("Arial", Font.BOLD, 13));
        calculator.setBounds(30, 10, 300, 20);

        JLabel aLabel = new JLabel("A =");
        aLabel.setFont(new Font("Arial", Font.BOLD, 13));
        aLabel.setBounds(30, 35, 300, 20);

        JTextField aTextField = new JTextField();
        aTextField.setFont(new Font("Arial", Font.BOLD, 13));
        aTextField.setBounds(30, 55, 200, 30);

        JLabel bLabel = new JLabel("B =");
        bLabel.setFont(new Font("Arial", Font.BOLD, 13));
        bLabel.setBounds(30, 90, 300, 20); 
        
        JTextField bTextField = new JTextField();
        bTextField.setFont(new Font("Arial", Font.BOLD, 13));
        bTextField.setBounds(30, 110, 200, 30);

        JButton addBtn = new JButton("A + B");
        addBtn.setFocusable(false);
        addBtn.setFont(new Font("Arial", Font.BOLD, 13));
        addBtn.setBounds(30, 150, 100, 30);

        JLabel addResult = new JLabel();
        addResult.setFont(new Font("Arial", Font.BOLD, 13));
        addResult.setBounds(30, 180, 300, 30);

        JButton subtractBtn = new JButton("A - B");
        subtractBtn.setFocusable(false);
        subtractBtn.setFont(new Font("Arial", Font.BOLD, 13));
        subtractBtn.setBounds(30, 210, 100, 30);

        JLabel subtractResult = new JLabel();
        subtractResult.setFont(new Font("Arial", Font.BOLD, 13));
        subtractResult.setBounds(30, 240, 300, 30);

        JButton multiplyBtn = new JButton("A x B");
        multiplyBtn.setFocusable(false);
        multiplyBtn.setFont(new Font("Arial", Font.BOLD, 13));
        multiplyBtn.setBounds(30, 270, 100, 30);

        JLabel multiplyResult = new JLabel();
        multiplyResult.setFont(new Font("Arial", Font.BOLD, 13));
        multiplyResult.setBounds(30, 300, 300, 30);

        JButton divideBtn = new JButton("A / B");
        divideBtn.setFocusable(false);
        divideBtn.setFont(new Font("Arial", Font.BOLD, 13));
        divideBtn.setBounds(30, 330, 100, 30);

        JLabel divideResult = new JLabel();
        divideResult.setFont(new Font("Arial", Font.BOLD, 13));
        divideResult.setBounds(30, 360, 300, 30);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    double a = Double.parseDouble(aTextField.getText());
                    double b = Double.parseDouble(bTextField.getText());
                    addResult.setText("= " + (a + b));
                } catch (Exception ex) {
                    ex.getMessage();
                    addResult.setText("Please Input Number first!");
                }
            }
        });

        subtractBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    double a = Double.parseDouble(aTextField.getText());
                    double b = Double.parseDouble(bTextField.getText());
                    subtractResult.setText("= " + (a - b));
                } catch (Exception ex) {
                    ex.getMessage();
                    subtractResult.setText("Please Input Number first!");
                }
            }
        });

        multiplyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    double a = Double.parseDouble(aTextField.getText());
                    double b = Double.parseDouble(bTextField.getText());
                    multiplyResult.setText("= " + (a * b));
                } catch (Exception ex) {
                    ex.getMessage();
                    multiplyResult.setText("Please Input Number first!");
                }
            }
        });

        divideBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    double a = Double.parseDouble(aTextField.getText());
                    double b = Double.parseDouble(bTextField.getText());
                    divideResult.setText("= " + (a / b));
                } catch (Exception ex) {
                    ex.getMessage();
                    divideResult.setText("Please Input Number first!");
                }
            }
        });

        frame.add(calculator);
        frame.add(aLabel);
        frame.add(aTextField);
        frame.add(bLabel);
        frame.add(bTextField);
        frame.add(addBtn);
        frame.add(addResult);
        frame.add(subtractBtn);
        frame.add(subtractResult);
        frame.add(multiplyBtn);
        frame.add(multiplyResult);
        frame.add(divideBtn);
        frame.add(divideResult);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}