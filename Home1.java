package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home1  extends JFrame{
	
	JMenuBar  bar;
	JMenu menu1,menu2,menu3,menu4;
	JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9;
	
	
	public Home1() {
		
		setLayout( new FlowLayout());
		bar = new JMenuBar();
		menu1 = new JMenu("Employee");
		menu2 = new JMenu("Employee Details");
		menu3 = new JMenu("Account");
		menu4 = new JMenu("Utilities");
		item1 = new JMenuItem("Add");
		item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new EmployeeAdd();
				dispose();
				
			}
		});
		item2 = new JMenuItem("Update");
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Update();
				dispose();
				
			}
		});
		item3 = new JMenuItem("Delete");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new EmployeeDelete();
				dispose();
				
			}
		});
		item4 = new JMenuItem("Show Employees");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ShowEmployees();
				dispose();
				
			}
		});
		item5 = new JMenuItem("Serch Employee");
		item5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SerchEmployee();
				dispose();
				
			}
		});
		item6 = new JMenuItem("Show Employee Salary");
		item6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new EmployeeSalary();
				dispose();
				
			}
		});
		item7 = new JMenuItem("Help");
		item7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Help();
				dispose();
				
				
			}
		});
		item8 = new JMenuItem("Thought of day");
		item8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thought();
				dispose();
				
			}
		});
		item9 = new JMenuItem("Exit");
		item9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		bar.add(menu4);
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		menu3.add(item6);
		menu4.add(item7);
		menu4.add(item8);
		menu4.add(item9);
		add(bar);
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Home1();
	}

}
