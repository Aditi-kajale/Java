// an eg of a menu driven program
import java.awt.*;
import java.awt.event.*;

class Prog103 extends Frame implements ActionListener, ItemListener
{
	MenuBar mbar;
	Menu mfile, mformat;
	MenuItem mexit;
	CheckboxMenuItem mbold, mitalics;
	Font f = new Font("Arial",Font.BOLD,25);
	Label lblinfo;

	public static void main(String args[ ])
	{
		new Prog103();
	}

	Prog103()
	{
		setBounds(250,125,500,500);
		setLayout(new FlowLayout());  // auto layout. Layouts are nothing but
				// a set of classes. Auto layout is represented
				// by a class FlowLayout
		mbar = new MenuBar();
		mfile = new Menu("File");   // caption
		mformat = new Menu("Format");
		mexit = new MenuItem("Exit");
		mbold = new CheckboxMenuItem("Bold",true);  // selected
		mitalics = new CheckboxMenuItem("Italics");  // unselected
		lblinfo = new Label("Databyte Computers");
		lblinfo.setFont(f);

		// add the components to the frame
		add(lblinfo);
		setMenuBar(mbar);  // do not use add() for menu bar
		mbar.add(mfile);
		mbar.add(mformat);

		mfile.add(mexit);
		mformat.add(mbold);
		mformat.add(mitalics);

		// register the menu items
		mexit.addActionListener(this);
		mbold.addItemListener(this);
		mitalics.addItemListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		// 4 possibilities are to be managed
		// a. bold & italics - true, b. bold & italics - false, 
		// c. bold-true, italics-false  d. bold-false, italics - true
		if (mbold.getState())  // bold is true
		{
			if (mitalics.getState()) // italics is true
				f = new Font("Arial",Font.BOLD|Font.ITALIC,25);
			else
				f = new Font("Arial",Font.BOLD,25);
		}
		else  // bold is false
		{
			if (mitalics.getState())
				f = new Font("Arial",Font.ITALIC,25);
			else
				f = new Font("Arial",Font.PLAIN,25);
		}
		lblinfo.setFont(f);  // imp - apply the newly created font obj to Label
	}
}



		
		
		

		











	
	
