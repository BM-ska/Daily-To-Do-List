import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menubar extends JMenuBar{

	JMenu File;
	JMenu Element;
	JMenu Help;
	
	JMenuItem Save;
	JMenuItem Add;
	JMenuItem Close;
	
	
	public Menubar()
	{
		 File = new JMenu("File");
		 Element = new JMenu("Element");
		 Help = new JMenu("Help");
		
		 Save = new JMenuItem("Save");  
//		 Save.addActionListener(this);    
		 Add = new JMenuItem("Add");
	//	 Add.addActionListener(this);    
		 Close = new JMenuItem("Close");
	//	 Close.addActionListener(this);    
         
         File.add(Save); 
         File.add(Close);
         Element.add(Add);
         
		 add(File);
		 add(Element);
		 add(Help);
	}
	public void actionPerformed(ActionEvent e) 
	{    
		if(e.getSource() == Save)
		{
			
		}
		if(e.getSource() == Add)
		{
			b_add x = new b_add();
			x.new_b_add.setLocationRelativeTo(null);
			x.new_b_add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		x.new_b_add.setVisible(true);
		}
		if(e.getSource() == Close)
		{
			
		}
		
		
	}     
	
}
