// an eg of a simple applet to display a welcome message
import java.applet.*;   // Applet class
import java.awt.*;  // awt - abstract window toolkit - Font, Color, Graphics classes

// all applets must be declared public classes so that external progs like browsers can
// access them
public class Prog92 extends Applet
{
	// declare all vars/objects reqd globally, so that they can be shared between
	// all std methods of Applet class
	String msg;
	Font f;

	public void init()
	{
		msg = "Welcome to Databyte";
		f = new Font("Arial",Font.BOLD,25);
		setForeground(Color.RED);  // text colour
		setBackground(Color.YELLOW);  // applet's background
	}

	public void paint(Graphics g)
	{
		g.setFont(f);
		g.drawString(msg,50,100);  // String, left & top margins
	}
}





