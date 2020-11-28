// an eg of checkboxes
import java.applet.*;
import java.awt.*;  // Checkbox class
import java.awt.event.*; // ItemEvent class, ItemListener interface

/* <applet code="Prog97.class" width="500" height="600">
</applet> */

public class Prog97 extends Applet implements ItemListener
{
	Label l;   // Labels are passive controls & have no events associated with them
	Checkbox chkhome, chkpc,chkmob;

	public void init()
	{
		setFont(new Font("Arial",Font.BOLD,25));
		setLayout(null);  // manual layout

		// create the components
		l = new Label("I own");
		chkhome = new Checkbox("Home",true);  // 2nd option is state of check
			// box & by default it is set to false i.e. unchecked
		chkpc = new Checkbox("Personal Computer");  // unchecked
		chkmob = new Checkbox("Mobile",true);

		// disable chkhome
		chkhome.setEnabled(false);
		// decide the position for each control
		l.setBounds(50,50,80,30);  // left, top, width, height
		chkhome.setBounds(50,100,80,30);
		chkpc.setBounds(50,150,250,30);
		chkmob.setBounds(50,200,100,30);

		add(l);
		add(chkhome);
		add(chkpc);
		add(chkmob);
		
		// register the checkboxes for events
		chkpc.addItemListener(this);
		chkmob.addItemListener(this);
	}

	// override the foll. method
	public void itemStateChanged(ItemEvent ie)
	{
		// we are not interested in knowing which checkbox was 
		//  manipulated bcoz whichever checkbox is manipulated,
		// we need to refresh the entire applet window
		repaint();  // call the paint() internally
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawString("Status",50,350);
		g.setColor(Color.BLUE);
		g.drawString("Home - true",50,400);
		g.drawString("PC - " + chkpc.getState(),50,450);
		g.drawString("Mobile - " + chkmob.getState(),50,500);
	}
}