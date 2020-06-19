import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class To_do extends JPanel{
	
	int y = 50;
	static ArrayList <To_do_element> list_el = new ArrayList <To_do_element> ();
	static ArrayList <JLabel> list_el_name = new ArrayList <JLabel> ();
	
	public To_do()
	{	
		this.setBounds(10, 10, 150, 450);
		this.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		this.setLayout(null);
		
	}
	
	void add_task (To_do_element task)
	{
		list_el.add(task);
		
		JLabel task_label = new JLabel(task.name);
		task_label.setBounds(20, y , 100, 20);
		y += 20;
		//stworz boarda dla board(task); i akcje po nacisnieciu task label
		
		list_el_name.add(task_label);
		add(list_el_name.get(list_el_name.size()-1));
		
		
		
	}
	
	
}
