import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class b_task extends To_do
{
	JButton b;
	static int y_list1 = 10;
	
	public b_task (To_do_element el)
	{
		b = new JButton(el.name);
		b.setBounds(10, y_list1, 130, 30);
		
		
		y_list1 += 35;
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
