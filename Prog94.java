// design an applet with 2 buttons which if clicked, will change the background colour of
// applet
import java.applet.*;
import java.awt.*;   // Button class
import java.awt.event.*;   // ActionEvent class, ActionListener interface

/* <applet code="Prog94.class" width="500" height="500">
</applet> */

public class Prog94 extends Applet
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

		// create a listener object to receive notifications of button clicked
		BtnHandler list_obj = new BtnHandler();
		// register the buttons with this object
		btnred.addActionListener(list_obj);
		btnblue.addActionListener(list_obj);
	}

	// imp - declare the class of listener object as an inner class, bcoz inner class
	// can access the members of outer class - scopes
	// It needs to access btnred and btnblue of outer class i.e. Prog94
	class BtnHandler implements ActionListener
	{
		// compulsory to override abstract method of interface ActionListener
		public void actionPerformed(ActionEvent ae)
		{
			// ae object knows the source of event
			if (ae.getSource() == btnred)
				setBackground(Color.RED);
			else
				setBackground(Color.BLUE);
		}
	}  // end of inner class
} // end of outer class




