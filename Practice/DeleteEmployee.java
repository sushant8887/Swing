package Practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteEmployee extends JFrame {
JLabel label1;
JTextField field1;
JButton button;

public DeleteEmployee() {
setLayout(new FlowLayout());
label1 = new JLabel("Employee ID");
field1 = new JTextField(10);
button = new JButton("Delete Employee");
button.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		System.out.println("Deleted");
		
	}
});
add(label1);
add(field1);
add(button);
setSize(400,400);
setVisible(true);




}
public static void main(String[] args) {
	new DeleteEmployee();
}
}
