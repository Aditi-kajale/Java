// design an applet with 2 buttons which if clicked, will change the background colour of
// applet
// Similar to previous program but the container class will manage the event
import java.applet.*;
import java.awt.*;   // Button class
import java.awt.event.*;   // ActionEvent class, ActionListener interface

/* <applet code="Prog95.class" width="500" height="500">
</applet> */

// if container class object is a listener obj, then to qualify as a listener obj, this class
// should implement ActionListener interface
public class Prog95 extends Applet implements ActionListener
{
	Button btnred, btnblue;  // Naming convention is some chars for type of component
				// & some chars for purpose of component
	public void init()
	{
		// create objects of Button
		btnred = new Button("Red"); // caption of button
		btnblue = new Button("Blue");

		// add the buttons to the applet interface
		add(btnred);  // add() from Applet class is called & this class also
				// inherits it from the Container class
		add(btnblue);

		// register the buttons with "this" object (implicit object or object of
		// current class)
		btnred.addActionListener(this);
		btnblue.addActionListener(this);
	}

	// compulsory to override abstract method of interface ActionListener
	public void actionPerformed(ActionEvent ae)
	{
		// ae object knows the source of event
		if (ae.getSource() == btnred)
			setBackground(Color.RED);
		else
			setBackground(Color.BLUE);
	}
} // end of outer class




