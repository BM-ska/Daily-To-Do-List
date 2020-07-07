import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Layout extends JFrame implements ActionListener{
	
	To_do list;
	
	public Layout()
	{
		list = new To_do ();
		
		//window
		setSize(1005,600);
		setTitle("DTDL");
		setLayout(null);
		setResizable(false);
		
		//menubar
		Menubar menu = Menubar.create_instance(list);
		setJMenuBar(menu);  
		
		//buttons
		JButton button_add = new JButton("+");
		button_add.setBounds(920, 10, 60, 40);
		add(button_add);
		button_add.addActionListener(this);
		
		//other
		add(list.list1);
		add(list.list2);
		add(list.list3);
		add(list.list4);
		add(list.list5);
		
		list.add_task (new To_do_element("nazwa", "1", 1, 3) ); //test
		list.add_task (new To_do_element("nazwa2", "2", 5, 4) ); //test
		list.add_task (new To_do_element("nazwa3", "1", 3 , 3) ); //test
		list.add_task (new To_do_element("nazwa", "1", 1, 3) ); //test
		list.add_task (new To_do_element("nazwa2", "2", 5, 4) ); //test
		list.add_task (new To_do_element("nazwa3", "1", 3 , 3) ); //test
		

		
		//date
		
	}
	public void actionPerformed(ActionEvent e)
	{
		b_add x = new b_add(list, "", "");
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
