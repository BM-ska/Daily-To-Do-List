import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.JFormattedTextField.AbstractFormatter;

public class b_add implements ActionListener{
	JFrame new_b_add;
	
	JTextField text_name;
	JTextField text_interval;
	JComboBox type;
	JButton button_add;
	
	To_do to_do;

	
	public b_add(To_do to_do)
	{
		this.to_do = to_do;
		
		new_b_add = new JFrame();
		
		//window
		new_b_add.setSize(240,335);
		new_b_add.setTitle("add element");
		new_b_add.setLayout(null);
		
		//panele
		JPanel p_name = new JPanel();
		JPanel p_date = new JPanel();
		JPanel p_interval = new JPanel();
		JPanel p_type = new JPanel();
		
		//name
		p_name.setBounds(10, 10, 200, 50);
		p_name.setBorder(BorderFactory.createTitledBorder("Name:"));
		p_name.setLayout(null);
		
		text_name = new JTextField("");
		text_name.setBounds(10, 14, 185, 30);                                                          
		p_name.add(text_name);
		
		//date
		p_date.setBounds(10, 65, 200, 50);
		p_date.setBorder(BorderFactory.createTitledBorder("Date:"));
		p_date.setLayout(null);
		

	
		//interval
		p_interval.setBounds(10, 120, 200, 50);
		p_interval.setBorder(BorderFactory.createTitledBorder("Interval:"));
		p_interval.setLayout(null);
		
		text_interval = new JTextField("");
		text_interval.setBounds(18, 135, 185, 30);                                                          
		new_b_add.add(text_interval);
//!!		
		
		//type
		p_type.setBounds(10, 175, 200, 50);
		p_type.setBorder(BorderFactory.createTitledBorder("Type:"));
		p_type.setLayout(null);
		
		type = new JComboBox();
		type.addItem("event");
		type.setBounds(18, 190, 185, 30);
		type.addActionListener(this);
//!!!		
		new_b_add.add(type);
		
		//add
		button_add = new JButton("add");
		button_add.setBounds(10, 230, 200, 50);
		button_add.addActionListener(this);
		
		
		new_b_add.add(p_name);
		new_b_add.add(p_date);
		new_b_add.add(p_interval);
		new_b_add.add(p_type);
		new_b_add.add(button_add);
	}
	
	void wypisz() //do testowania
	{
		for(int i = 0; i < to_do.task_list.size(); i++)
		{
			System.out.println(to_do.task_list.get(i).name +" "+ to_do.task_list.get(i).date +" "+ to_do.task_list.get(i).interval + " "+to_do.task_list.get(i).type);
		}
			
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object z = e.getSource();
		String a = "";
		String b = "";
		int c = 0;
		int d = 0;
		 
		
		if(z == button_add)
		{
			a = text_name.getText();
			c = Integer.parseInt(text_interval.getText());
			
			String x = type.getSelectedItem().toString();
			if(x == "event")
				d = 1;
			
			To_do_element new_element = new To_do_element(a, b, c, d);
			
			
			to_do.add_task(new_element);
			
		//	wypisz(); //do testowania
			new_b_add.dispose();
		//	System.out.println(to_do.task_list.size()); // test
		}
		
		
		
		
	}
	
}
