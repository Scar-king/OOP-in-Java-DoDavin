package Ex5;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Management");
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        ImageIcon image = new ImageIcon("Ex5/itc.png");
        frame.setIconImage(image.getImage());

        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        titlePanel.setPreferredSize(new Dimension(800, 50));
        titlePanel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel("Student Management");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        formPanel.setPreferredSize(new Dimension(800, 60));
        formPanel.setBackground(Color.WHITE);

        JTextField tfFirstName = new JTextField(10);
        JTextField tfLastName = new JTextField(10);
        JTextField tfAge = new JTextField(5);
        JTextField tfMajor = new JTextField(10);

        JButton addButton = new JButton("Add new");
        addButton.setBackground(new Color(33, 150, 243)); 
        addButton.setFocusable(false);
        addButton.setForeground(Color.WHITE);

        formPanel.add(new JLabel("First name"));
        formPanel.add(tfFirstName);

        formPanel.add(new JLabel("Last name"));
        formPanel.add(tfLastName);

        formPanel.add(new JLabel("Age"));
        formPanel.add(tfAge);

        formPanel.add(new JLabel("Major"));
        formPanel.add(tfMajor);

        formPanel.add(addButton);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("First name");
        model.addColumn("Last name");
        model.addColumn("Age");
        model.addColumn("Major");

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        model.addRow(new Object[]{"AA", "Tola", "21", "IT"});
        model.addRow(new Object[]{"AA", "Makara", "19", "IT"});

        addButton.addActionListener(e -> {
            String firstName = tfFirstName.getText().trim();
            String lastName = tfLastName.getText().trim();
            String age = tfAge.getText().trim();
            String major = tfMajor.getText().trim();

            if (!firstName.isEmpty() && !lastName.isEmpty() && !age.isEmpty() && !major.isEmpty()) {
                model.addRow(new Object[]{firstName, lastName, age, major});
                tfFirstName.setText("");
                tfLastName.setText("");
                tfAge.setText("");
                tfMajor.setText("");
                JOptionPane.showMessageDialog(frame, "Added Student Successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.add(titlePanel);
        topPanel.add(formPanel);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
