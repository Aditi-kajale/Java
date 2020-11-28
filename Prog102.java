// design a frame in which the background colour of frame changes to some
// random colour on click of mouse button.
// Use anonymous inner class
import java.awt.*;
import java.awt.event.*;

class Prog102 extends Frame
{
	public static void main(String args[ ])
	{
		new Prog102();
	}

	Prog102()
	{
		setBounds(250,125,500,500);

		addMouseListener(new MouseAdapter()
		// start a new anonymous inner class which inherits
		// MouseAdapter
		{
			public void mouseClicked(MouseEvent me)
			{
				int r = (int) (Math.random() * 255);
				// Math.random() generates nos of type
				// double between 0-1 only
				int g = (int) (Math.random() * 255);
				int b = (int) (Math.random() * 255);
				setBackground(new Color(r,g,b));
			}
		} // end of anonymous inner class
		);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});

		setVisible(true);
	}
}

	

