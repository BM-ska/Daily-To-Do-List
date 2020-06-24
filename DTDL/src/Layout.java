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
		
		//menubar
		Menubar menu = new Menubar();
		setJMenuBar(menu);  
		
		//buttons
		JButton button_add = new JButton("+");
		button_add.setBounds(910, 470, 50, 50);
		add(button_add);
		button_add.addActionListener(this);
		
		//other
		To_do list = new To_do ();
		add(list.list1);
		add(list.list2);
		
		
		list.add_task (new To_do_element("nazwa", "1", 2, 3) ); //test
		list.add_task (new To_do_element("nazwa2", "2", 3, 4) ); //test
		list.add_task (new To_do_element("nazwa3", "1", 1 , 3) ); //test
		

		
		//date
		
	}
	public void actionPerformed(ActionEvent e)
	{
		b_add x = new b_add();
		x.new_b_add.setLocationRelativeTo(null);
		x.new_b_add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		x.new_b_add.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Layout win = new Layout();
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		win.setVisible(true);
 		
 		
 		
 		
		
	}
	
	
	
}
