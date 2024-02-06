package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Thought  extends JFrame{
	JLabel jLabel;
	
	public Thought() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		jLabel = new JLabel("Thought of the day");
		
		
		add(jLabel);
		setSize(400,400);
		setVisible(true);
	}

}
