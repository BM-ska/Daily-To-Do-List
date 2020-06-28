import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class To_do {
	
	JPanel list1, list2, list3, list4, list5;
	
	int x_list2 = 10;
	int y_list2 = 10;
	
	List <To_do_element> task_list;
	List <b_task> button_list;
	List <Board> board_list;
	
	public To_do()
	{	
		task_list = new ArrayList <To_do_element>(10);
		button_list = new ArrayList <b_task>();
		board_list = new ArrayList <Board>();
		
		list1 = new JPanel();
		list1.setBounds(10, 60, 150, 450);
		list1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		list1.setLayout(null);
		
		list2 = new JPanel();
		list2.setBounds(170, 60, 740, 450);
		list2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		list2.setLayout(null);
		
		list3 = new JPanel();
		list3.setBounds(920, 60, 60, 450);
		list3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		list3.setLayout(null);
		
		//date
		list4 = new JPanel();
		list4.setBounds(10, 10, 150, 40);
		list4.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		list4.setLayout(null);
		
		list5 = new JPanel();
		list5.setBounds(170, 10, 740, 40);
		list5.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		list5.setLayout(null);
		
	//	JScrollBar scroll = new JScrollBar(JScrollBar.VERTICAL, 10, 440, 10, 100);
		//list3.add(scroll);
				
	}
	
	void add_task (To_do_element task)
	{		
		//button
		var btask = new b_task(task);
		button_list.add(btask);		
		list1.add(btask.b);
		
		//board
		JButton percent = new JButton ("0%");
		
		var board = new Board (task, this, percent);
		board_list.add(board);
		
		for(int i = 0; i<100; i++)
		{
			list2.add(board.tab[i]);
		}
		
		list3.add(percent);
		
		//task
		task_list.add(task);
		
		
		
		
		list1.repaint();
		list2.repaint();
		list3.repaint();
	}
	
	
}
