// design a frame in which the background colour of frame changes from Red-Green
// -Blue on click of Left-Center-Right Button of Mouse
// Use Adapter class
import java.awt.*;
import java.awt.event.*;

class Prog101 extends Frame
{
	
	public static void main(String args[ ])
	{
		new Prog101();
	}

	Prog101()
	{
		setBounds(250,125,500,500);

		addMouseListener(new MyMouseAdapter());
		addWindowListener(new MyWindowAdapter());

		setVisible(true);
	}

	// event handling classes have to be inner classes
	class MyMouseAdapter extends MouseAdapter
	{
		// override only the reqd method
		public void mouseClicked(MouseEvent me)
		{
			// to know which is clicked
			if (me.getButton() == 1)  // Left button clicked
				setBackground(Color.RED);
			else if (me.getButton() == 2)  // Center
				setBackground(Color.GREEN);
			else
				setBackground(Color.BLUE);
		}
	}

	class MyWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}
	


