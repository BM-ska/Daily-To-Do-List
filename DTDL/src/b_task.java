import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class b_task implements ActionListener
{
	JButton b;
	static int y_list1 = 10;
	To_do to_do;
	To_do_element el;
	
	public b_task (To_do_element el, To_do to_do)
	{
		this.to_do = to_do;
		this.el = el;
		b = new JButton(el.name);
		b.setBounds(10, y_list1, 130, 30);
		b.addActionListener(this);
		
		y_list1 += 35;
	}
	public void actionPerformed(ActionEvent e) //dokoncz
	{
		b_add x = new b_add(to_do, el.name ,  Integer.toString(el.interval));
		x.new_b_add.setLocationRelativeTo(null);
		x.new_b_add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		x.new_b_add.setVisible(true);
	}
}
