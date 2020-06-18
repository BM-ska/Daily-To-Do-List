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

public class b_add extends JFrame implements ActionListener{
	JTextField text_name;
	JTextField text_interval;
	JComboBox type;
	JButton button_add;

	
	public b_add()
	{
		
		//window
		setSize(240,335);
		setTitle("add element");
		setLayout(null);
		
		//panele
		JPanel p_name = new JPanel();
		JPanel p_date = new JPanel();
		JPanel p_interval = new JPanel();
		JPanel p_type = new JPanel();
		
		//name
		p_name.setBounds(10, 10, 200, 50);
	//	p_name.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		p_name.setBorder(BorderFactory.createTitledBorder("Name:"));
		p_name.setLayout(null);
		
		text_name = new JTextField("");
		text_name.setBounds(10, 14, 185, 30);                                                          
		p_name.add(text_name);
		
		//date
		p_date.setBounds(10, 65, 200, 50);
	//	p_date.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		p_date.setBorder(BorderFactory.createTitledBorder("Date:"));
		p_date.setLayout(null);
		

	
		//interval
		p_interval.setBounds(10, 120, 200, 50);
	//	p_interval.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		p_interval.setBorder(BorderFactory.createTitledBorder("Interval:"));
		p_interval.setLayout(null);
		
		text_interval = new JTextField("");
		text_interval.setBounds(18, 135, 185, 30);                                                          
		add(text_interval);
//!!		
		
		//type
		p_type.setBounds(10, 175, 200, 50);
	//	p_type.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		p_type.setBorder(BorderFactory.createTitledBorder("Type:"));
		p_type.setLayout(null);
		
		type = new JComboBox();
		type.addItem("event");
		type.setBounds(18, 190, 185, 30);
		type.addActionListener(this);
//!!!		
		add(type);
		
		//add
		button_add = new JButton("add");
		button_add.setBounds(10, 230, 200, 50);
		button_add.addActionListener(this);
		
		
		add(p_name);
		add(p_date);
		add(p_interval);
		add(p_type);
		add(button_add);
	}
	
	void wypisz()
	{
		for(int i = 0; i< To_do.list_el.size(); i++)
		{
			System.out.println(To_do.list_el.get(i).name +" ");
			System.out.println(To_do.list_el.get(i).date +" ");
			System.out.println(To_do.list_el.get(i).interval +" ");
			System.out.println(To_do.list_el.get(i).type +" ");
			
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
			
		/*	
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d); 
		*/	
			
			To_do_element new_element = new To_do_element(a, b, c, d);
			
			wypisz();
			
			//add_task(new_element);
			
			dispose();
		}
		
		
		
		
	}
	
}
