package Lab06.Ex4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ITC");
        frame.setSize(420, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Find roots of quadratic equation ax^2 + bx + c = 0");
        label1.setFont(new Font("Arial", Font.BOLD, 13));
        label1.setBounds(20, 20, 400, 50);

        JLabel aLabel = new JLabel("a =");
        aLabel.setFont(new Font("Arial", Font.BOLD, 13));
        aLabel.setBounds(20, 50, 100, 50);

        JTextField aTextField = new JTextField();
        aTextField.setBounds(20, 85, 205, 30);

        JLabel bLabel = new JLabel("b =");
        bLabel.setFont(new Font("Arial", Font.BOLD, 13));
        bLabel.setBounds(20, 100, 100, 50);

        JTextField bTextField = new JTextField();
        bTextField.setBounds(20, 135, 205, 30);

        JLabel cLabel = new JLabel("c =");
        cLabel.setFont(new Font("Arial", Font.BOLD, 13));
        cLabel.setBounds(20, 150, 100, 50);

        JTextField cTextField = new JTextField();
        cTextField.setBounds(20, 185, 205, 30);

        JButton button = new JButton("Find");
        button.setBounds(20, 230, 100, 30);
        button.setFocusable(false);

        JButton resetBtn = new JButton("Reset");
        resetBtn.setBounds(125, 230, 100, 30);
        resetBtn.setFocusable(false);

        JLabel resultLabel = new JLabel();
        resultLabel.setFont(new Font("Arial", Font.BOLD, 13));
        resultLabel.setBounds(20, 270, 400, 60);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    double a = Double.parseDouble(aTextField.getText());
                    double b = Double.parseDouble(bTextField.getText());
                    double c = Double.parseDouble(cTextField.getText());

                    if(a == 0){
                        resultLabel.setText("This is not a quadratic equation (a must not be 0).");
                        return;
                    }

                    double delta = (b*b) - 4 * a * c;

                    if (delta > 0){
                        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                        resultLabel.setText(String.format("<html>Two real roots:\nx1 = %.2f\nx2 = %.2f</html>", root1, root2));
                    } else if (delta == 0) {
                        double root = -b / (2 * a);
                        resultLabel.setText(String.format("One real root:\nx = %.2f", root));
                    } else {
                        resultLabel.setText("No real roots.");
                    }

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid number for a, b, and c.");
                }
            }
        });

        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                aTextField.setText("");
                bTextField.setText("");
                cTextField.setText("");
            }
        });

        frame.add(label1);
        frame.add(aLabel);
        frame.add(aTextField);
        frame.add(bLabel);
        frame.add(bTextField);
        frame.add(cLabel);
        frame.add(cTextField);
        frame.add(button);
        frame.add(resetBtn);
        frame.add(resultLabel);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
