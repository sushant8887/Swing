package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class login1 extends JFrame {
	
	JLabel label1, label2;
	JTextField field1, field2;
	JButton button1, button2;
        
	public login1() {
		setLayout(null);
		label1 = new JLabel("Username");
		label2 = new JLabel("Password");
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		button1 = new JButton("Login");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (field1.getText().equals("admin") && field2.getText().equals("admin"))  {
					System.out.println("Login sucessful");
					new Home1();
					dispose();
				} else {
                    System.out.println("Invalid username and password");
				}
				
			}
		});
		button2 = new JButton("Reset");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				field1.setText("");
				field2.setText("");
				System.out.println("Reset");
			}
		});
		
		label1.setBounds(50,50,60,30);
		field1.setBounds(120,50,100,30);
		label2.setBounds(50,100,60,30);
		field2.setBounds(120,100,100,30);
		button1.setBounds(50,150,90,30);
		button2.setBounds(150,150,90,30);
		
		add(label1);
		add(field1);
		add(label2);
		add(field2);
		add(button1);
		add(button2);
		setSize(400,400);
		setVisible(true);
		
		
		
		
	}
	
	public static void main(String[] args) {
		new  login1();
	}
}
