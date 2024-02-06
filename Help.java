
package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help  extends JFrame{
	JLabel jLabel;
	
	public Help() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		jLabel = new JLabel("Help center");
		
		
		add(jLabel);
		setSize(400,400);
		setVisible(true);
	}

}
