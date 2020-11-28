// an eg of an applet to wish the user depending upon the time of the day
import java.applet.*;
import java.awt.*;
import java.util.Date;

/* <applet code="Prog93.class" width="500" height="500">
</applet> */
public class Prog93 extends Applet
{
	public void init()
	{
		// If 1 font is reqd for all text in applet window
		setFont(new Font("Arial",Font.BOLD,25));  // it is same as
		// this.setFont(new Font("Arial",Font.BOLD,25));

	}

	public void paint(Graphics g)
	{
		// create a Date object
		Date d = new Date();
		int hrs = d.getHours();  // this method returns the hrs in 24 hour format
				// from system Clock
		String wish = "Good ";
		if (hrs < 12)
			wish += "Morning";
		else if (hrs < 17)
			wish += "Afternoon";
		else
			wish += "Evening";

		g.drawString(wish,100,200);
	}
}		 		







		