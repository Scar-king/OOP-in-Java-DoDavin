import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class insertStudent {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("ITC");
        frame.setSize(600, 500);

        JLabel l1, l2, l3;

        l1 = new JLabel("Insert a student");
        l1.setBounds(10, 20, 200, 50);
        l1.setFont(new Font("Arial", Font.BOLD, 26));

        l2 = new  JLabel("First name");
        l2.setBounds(10, 80, 200, 50);
        l2.setFont(new Font("Arial", Font.PLAIN, 16));

        JTextField first_text, last_text;

        first_text = new JTextField();
        first_text.setBounds(10, 120, 150, 50);
        first_text.setFont(new Font("Arial", Font.PLAIN, 16));

        l3 = new  JLabel("Last name");
        l3.setBounds(220, 80, 200, 50);
        l3.setFont(new Font("Arial", Font.PLAIN, 16));

        last_text = new JTextField();
        last_text.setBounds(220, 120, 150, 50);
        last_text.setFont(new Font("Arial", Font.PLAIN, 16));

        JButton b1 = new JButton("Add");
        b1.setBounds(450, 120, 100, 50);
        b1.setFont(new Font("Arial", Font.PLAIN, 16));
        b1.setBackground(new Color(3, 169, 244));
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);

        String column[] = {"First Name", "Last Name"};

        DefaultTableModel model = new DefaultTableModel(column, 0);
        JTable table = new JTable(model);
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(10, 200, 550, 200);

        b1.addActionListener(e->{
            String first = first_text.getText().trim();
            String last = last_text.getText().trim();
            last_text.getText().trim();
            if(!first.isEmpty() || !last.isEmpty()){
                model.addRow(new String[]{first, last});
                first_text.setText("");
                last_text.setText("");
            } else {
                JOptionPane.showMessageDialog(pane, "Please input something!");
            }
        });
     
        // Add
        frame.add(l1);
        frame.add(l2);
        frame.add(first_text);
        frame.add(l3);
        frame.add(last_text);
        frame.add(b1);
        frame.add(pane);

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
