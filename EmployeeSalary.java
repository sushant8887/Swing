

package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeSalary extends JFrame {
 JLabel jLabel;
 JTable table;
 public EmployeeSalary() {
  // TODO Auto-generated constructor stub
setLayout(new FlowLayout());
    jLabel = new JLabel("Employee Salary");
    Object [][] data= {{1,"vivak",12000},{2,"sanket",150000},{3,"Rohan",20000},{4,"raghav",25000}};
String []coloumnnaame= {"id","name","Salary"};

jLabel.setBounds(50,50,60,30);
  DefaultTableModel model=new DefaultTableModel(data,coloumnnaame);
  add(jLabel);
  table =new JTable(model);
    add(new JScrollPane(table));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   
 setSize(400,400);
 setVisible(true);
 
 
 }
 public static void main(String[] args) {
	new EmployeeSalary();
}
 
}