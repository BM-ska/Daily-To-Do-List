import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Layout extends JFrame implements ActionListener{
	
	
	public Layout()
	{
		//window
		setSize(1000,600);
		setTitle("DTDL");
		setLayout(null);
		
		//buttons
		JButton button_add = new JButton("+");
		button_add.setBounds(920, 500, 50, 50);
		add(button_add);
		button_add.addActionListener(this);
		
		//list
		To_do list = new To_do ();
		add(list);
		
		//board
		
		//date
		
	}
	public void actionPerformed(ActionEvent e)
	{
		b_add x = new b_add();
		x.setLocationRelativeTo(null);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		x.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Layout win = new Layout();
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		win.setVisible(true);
 		
 	
 		
		
		
	}
	
	
	
}
