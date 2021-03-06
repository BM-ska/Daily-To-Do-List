import java.util.ArrayList;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Board implements ActionListener{
	
	JButton[] tab;
	int repeat;
	int done;
	JButton percent;
	int if_regular;
	
	To_do to_do;
	
	public Board(To_do_element el, To_do to_do, JButton p)
	{
		this.to_do = to_do;
		tab = new JButton[100];
		repeat = 1; // potem zmien na 0
		done = 0;
		
		percent = p;
		percent.setBounds(10, to_do.y_list2, 40, 30);
		percent.setLayout(null);
		percent.setMargin(new Insets(-2,-3,0,0));
		percent.setHorizontalAlignment(SwingConstants.CENTER);
		percent.setHorizontalTextPosition(SwingConstants.CENTER);
		
		
		if (el.interval == -1) //tworzenie nieregularne
		{
			percent.setText("ok");
			percent.addActionListener(this);
			if_regular = 0;
			
			for(int i = 0; i<100; i++) 
			{
				tab[i] = new JButton();
				tab[i].setLayout(null);
				tab[i].setMargin(new Insets(-2,-3,0,0));
				tab[i].setHorizontalAlignment(SwingConstants.CENTER);
				tab[i].setHorizontalTextPosition(SwingConstants.CENTER);
				
				
				tab[i].setBounds(to_do.x_list2, to_do.y_list2, 30, 30);
				tab[i].addActionListener(this);

				to_do.x_list2 += 35;
			}
			
		}
		else
		{
			percent.setEnabled(false);
			if_regular = 1;
			
			for(int i = 0; i<100; i++) //wypelnienie tab regularnie
			{
				tab[i] = new JButton();
				tab[i].setLayout(null);
				tab[i].setMargin(new Insets(-2,-3,0,0));
				tab[i].setHorizontalAlignment(SwingConstants.CENTER);
				tab[i].setHorizontalTextPosition(SwingConstants.CENTER);
				
				if(i % el.interval == 0) // napraw - od daty
					tab[i].setText("x");
					//tab[i].setBackground(Color.YELLOW);
				
				else 
					tab[i].setEnabled(false);
				
				tab[i].setBounds(to_do.x_list2, to_do.y_list2, 30, 30);
				tab[i].addActionListener(this);

				to_do.x_list2 += 35;
			}
		}
		
		to_do.y_list2 += 35;
		to_do.x_list2 = 10;
		
	}
	public void actionPerformed(ActionEvent e)
	{
		var z = (JButton) e.getSource();
		if(if_regular == 1)
		{
			
			z.setBackground(Color.gray);
			z.setEnabled(false);
			done ++;
			
			int per = done * 100 / repeat;
			percent.setText(Integer.toString(per) + "%");
			
	
			to_do.list3.repaint();
			
		}
		
		if(if_regular == 0)
		{
			if (z.getText()=="x")
				z.setText("");
			else 
				z.setText("x");
			
		}
		
		if(z == percent)
		{
			for(int i = 0; i<100; i++)
			{
				if(tab[i].getText()!="x")
					tab[i].setEnabled(false);
			}
			
			percent.setText( "0%");
			to_do.list3.repaint();
			if_regular = 1;
			percent.setEnabled(false);
		}
		
	}
	

}
