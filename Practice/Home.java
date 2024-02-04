package Practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame{
	JLabel label;
	JButton button1, button2;
	
	public Home() {
	setLayout(new FlowLayout());
	label = new JLabel("User Management");
	button1 = new JButton("Save Emp");
	button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new SaveEmployeeData();
			
		}
	});
	
	button2 = new JButton("Delete Emp");
	button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new DeleteEmployee();
			
		}
	});
	
	add(label);
	add(button1);
	add(button2);
	setSize(500, 400);
	setVisible(true);
	
	}
	public static void main(String[] args) {
		new Home();
	}
	
}