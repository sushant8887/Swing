
package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ShowEmployees extends JFrame {

	JLabel jLabel;
 JTable table;
 public ShowEmployees() {
  // TODO Auto-generated constructor stub
setLayout(new FlowLayout());
   
    Object [][] data= {{1,"vivak",12000,"mumbai"},{2,"sanket",150000,"Virar"},{3,"Rohan",20000,"Dadar"},{4,"raghav",25000,"virar"}};
String []coloumnnaame= {"id","name","Salary","Address"};
jLabel = new JLabel("Employee Detail");

  
  DefaultTableModel model=new DefaultTableModel(data,coloumnnaame);
  
  add(jLabel);
  table =new JTable(model);
    add(new JScrollPane(table));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
 setSize(400,400);
 setVisible(true);
 
 
 }
 public static void main(String[] args) {
	new ShowEmployees();
}
 
}