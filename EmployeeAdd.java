package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeeAdd  extends JFrame{

	JLabel jLabel1,jLabel2,jLabel3,jLabel4;
	JTextField field1,field2,field3, field4;
	JButton button1, button2;
	
	public EmployeeAdd() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		jLabel1 = new JLabel("Name");
		jLabel2= new JLabel("Id");
		jLabel3 = new JLabel("Salary");
		jLabel4 = new JLabel("Address");
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		field3 = new JTextField(10);
		field4 = new JTextField(10);
		button1 = new JButton("Save");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("data Save");
			}
		});
		button2 = new JButton("back");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Reset");
				new Home1();
				dispose();
			}
		});
		
		jLabel1.setBounds(50,50,60,30);
		field1.setBounds(120,50,90,30);
		jLabel2.setBounds(50,100,60,30);
		field2.setBounds(120,100,90,30);
		jLabel3.setBounds(50,150,60,30);
		field3.setBounds(120,150,90,30);
		jLabel4.setBounds(50,200,60,30);
		field4.setBounds(120,200,90,30);
		button1.setBounds(60,250,100,30);
		button2.setBounds(180,250,100,30);
		
		
		add(jLabel1);
		add(field1);
		add(jLabel2);
		add(field2);
		add(jLabel3);
		add(field3);
		add(jLabel4);
		add(field4);
		add(button1);
		add(button2);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EmployeeAdd();
	}
}
