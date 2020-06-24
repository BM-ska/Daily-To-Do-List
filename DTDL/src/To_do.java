import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class To_do {
	
	JPanel list1;
	JPanel list2;
	
	
	
	List <To_do_element> task_list;
	ArrayList <b_task> button_list;
	ArrayList <Board> board_list;
	
	public To_do()
	{	
		task_list = new ArrayList <To_do_element>(10);
		button_list = new ArrayList <b_task>();
		board_list = new ArrayList <Board>();
		
		list1 = new JPanel();
		list1.setBounds(10, 10, 150, 450);
		list1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		list1.setLayout(null);
		
		list2 = new JPanel();
		list2.setBounds(170, 10, 740, 450);
		list2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		list2.setLayout(null);
		
	}
	
	void add_task (To_do_element task)
	{
		//button
		button_list.add(new b_task(task));
		
		
		list1.add(button_list.get(button_list.size()-1).b);
		
		//board
		board_list.add(new Board (task));
		
		for(int i = 0; i<100; i++)
		{
			list2.add(board_list.get(board_list.size()-1).tab[i]);
		}
		
		
		//task
		task_list.add(task);		
		
		
	}
	
	
}
