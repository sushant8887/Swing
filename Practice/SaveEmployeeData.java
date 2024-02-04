package Practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SaveEmployeeData extends JFrame{
	JLabel label1,label2, label3, label4;
	JTextField field1, field2, field3, field4;
	JButton button;
	public SaveEmployeeData() {
		setLayout(new FlowLayout());
		label1 = new JLabel("Name");
		field1 = new JTextField(10);
		label2 = new JLabel("Id");
		field2 = new JTextField(10);
		label3 = new JLabel("Salary");
		field3 = new JTextField(10);
		label4 = new JLabel("Address");
		field4 = new JTextField(10);
		button =  new JButton("Save");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				System.out.println("Employees Data Save Successfully");
				
			}
		});
		add(label1);
		add(field1);
		add(label2);
		add(field2);
		add(label3);
		add(field3);
		add(label4);
		add(field4);
		add(button);
		setSize(400,400);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new SaveEmployeeData();
	}
	
}
