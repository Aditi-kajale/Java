// design a frame with TWO text boxes to accept 2 int nos & display their result
// Unlike applets which execute in a browser, frames are used to run standalone GUI
// applications in Java. So they need not be embedded in  HTML page & executed by
// a browser. Also frames contain main()
import java.awt.*;   // Frame class, TextField, Label
import java.awt.event.*;  // ActionEvent class, ActionListener interface

class Prog99 extends Frame implements ActionListener, WindowListener
{
	// declare objects globally
	Label l1, l2;
	TextField txtno1, txtno2;
	String msg = "";

	public static void main(String args[ ])
	{
		// create a nameless frame object
		new Prog99();  // OR  Prog99 objf = new Prog99();

		// l1 = new Label("No1 :- ");  // error, static methods cannot access
				// instance members of the class
	}

	// constructor - is a non static method
	Prog99()
	{
		// set the properties of the frame here
		setTitle("An eg of a Frame");  // not compulsory
		setBounds(250,125,500,500);  // left, top, width, height
		setLayout(null);  // manual layout
		setFont(new Font("Arial",Font.BOLD,25));
		
		// create the components
		l1 = new Label("No1 :- ");
		l2 = new Label("No2 :- ");
		txtno1 = new TextField();
		txtno2 = new TextField();

		// set the position of components
		l1.setBounds(50,50,100,30);
		l2.setBounds(50,120,100,30);
		txtno1.setBounds(170,50,100,30);
		txtno2.setBounds(170,120,100,30);

		// add the components to frame
		add(l1);
		add(l2);
		add(txtno1);
		add(txtno2);

		// register the text fields for events
		txtno1.addActionListener(this);
		txtno2.addActionListener(this);
		// register the frame for Window type events
		addWindowListener(this);

		setVisible(true);  // to display the frame
	}
		
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int no1 = Integer.parseInt(txtno1.getText());
			int no2 = Integer.parseInt(txtno2.getText());
				
			msg = "Sum of given 2 nos is " + (no1+no2);
		}
		catch (NumberFormatException e)
		{
			msg = "Pls. enter whole nos only";
		}
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,50,220);
	}

	// override the methods of WindowListener
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}

	// compulsory to provide blank implementation of rest of the methods of
	// WindowListener
	public void windowDeactivated(WindowEvent we) { }
	public void windowActivated(WindowEvent we) { }
	public void windowDeiconified(WindowEvent we) { }
	public void windowIconified(WindowEvent we) { }
	public void windowOpened(WindowEvent we) { }
	public void windowClosed(WindowEvent we) { }



}