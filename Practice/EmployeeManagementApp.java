package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeManagementApp extends JFrame {
    private JButton btnSave, btnDelete;

    public EmployeeManagementApp() {
        setTitle("Employee Management App");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btnSave = new JButton("Save");
        btnDelete = new JButton("Delete Employee");

        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openNewEmployeeFrame();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openDeleteEmployeeFrame();
            }
        });

        add(btnSave);
        add(btnDelete);

        setVisible(true);
    }

    private void openNewEmployeeFrame() {
        JFrame newEmployeeFrame = new JFrame("New Employee");
        newEmployeeFrame.setSize(300, 200);
        newEmployeeFrame.setLayout(new GridLayout(4, 2));
        
        JLabel lblName = new JLabel("Name:");
        JTextField txtName = new JTextField(20);
        
        JLabel lblId = new JLabel("ID:");
        JTextField txtId = new JTextField(20);
        
        JLabel lblSalary = new JLabel("Salary:");
        JTextField txtSalary = new JTextField(20);
        
        JLabel lblAddress = new JLabel("Address:");
        JTextField txtAddress = new JTextField(20);
        
        newEmployeeFrame.add(lblName);
        newEmployeeFrame.add(txtName);
        newEmployeeFrame.add(lblId);
        newEmployeeFrame.add(txtId);
        newEmployeeFrame.add(lblSalary);
        newEmployeeFrame.add(txtSalary);
        newEmployeeFrame.add(lblAddress);
        newEmployeeFrame.add(txtAddress);
        
        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement save functionality here
                String name = txtName.getText();
                String id = txtId.getText();
                String salary = txtSalary.getText();
                String address = txtAddress.getText();
                // You can perform operations with this data, like saving it to a database
                JOptionPane.showMessageDialog(newEmployeeFrame, "Employee saved:\nName: " + name + "\nID: " + id + "\nSalary: " + salary + "\nAddress: " + address);
                newEmployeeFrame.dispose(); // Close the frame after saving
            }
        });
        newEmployeeFrame.add(btnSave);

        newEmployeeFrame.setVisible(true);
    }

    private void openDeleteEmployeeFrame() {
        JFrame deleteEmployeeFrame = new JFrame("Delete Employee");
        deleteEmployeeFrame.setSize(300, 100);
        deleteEmployeeFrame.setLayout(new FlowLayout());

        JLabel lblId = new JLabel("Enter Employee ID:");
        JTextField txtId = new JTextField(20);
        
        deleteEmployeeFrame.add(lblId);
        deleteEmployeeFrame.add(txtId);
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement delete functionality here
                String id = txtId.getText();
                // You can perform operations with this ID, like deleting from a database
                JOptionPane.showMessageDialog(deleteEmployeeFrame, "Employee with ID " + id + " deleted!");
                txtId.setText(""); // Clear the input field after deletion
            }
        });
        deleteEmployeeFrame.add(btnDelete);

        deleteEmployeeFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManagementApp();
            }
        });
    }
}
