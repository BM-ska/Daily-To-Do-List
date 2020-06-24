import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Board extends To_do{
	
	JButton[] tab;
	int repeat;
	int done;
	static int x_list2 = 10;
	static int y_list2 = 10;
	
	public Board(To_do_element el)
	{
		tab = new JButton[100];
		repeat = 0;
		done = 0;
		
		for(int i = 0; i<100; i++)
		{
			tab[i] = new JButton();
			tab[i].setLayout(null);
			
			if(i % el.interval == 0) // napraw - od daty
				tab[i].setBackground(Color.YELLOW);
			
			tab[i].setBounds(x_list2, y_list2 , 30, 30);
			

			x_list2 += 35;
		}
		y_list2 += 35;
		x_list2 = 10;
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
	

}
