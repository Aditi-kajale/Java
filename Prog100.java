// design a frame which displays the coordinates of the mouse as it hovers (moves)
// in the frame. Also display the character typed from keyboard.
import java.awt.*;
import java.awt.event.*;

class Prog100 extends Frame implements KeyListener, MouseMotionListener
{
	String msg1 = "", msg2 = "";

	public static void main(String args[ ])
	{
		new Prog100();
	}

	Prog100()
	{
		setBounds(250,125,500,500);
		setFont(new Font("Arial",Font.BOLD,25));

		// layout is not necessary bcoz we are not giving to lay any
		// component like button, scrollbar, etc. on the frame
		// register the mouse & keyboard with frame
		addMouseMotionListener(this);
		addKeyListener(this);

		setVisible(true);
	}

	// override the reqd methods of interface, for rest provide blank implementation
	public void mouseMoved(MouseEvent me)
	{
		msg1 = "Mouse moved to location " + me.getX() + ", " + me.getY();
		repaint();
	}

	public void mouseDragged(MouseEvent me) {  }

	public void keyTyped(KeyEvent ke)
	{
		msg2 = "Key typed is " + ke.getKeyChar();
		repaint();
	}

	public void keyPressed(KeyEvent ke) { }
	public void keyReleased(KeyEvent ke) { }

	public void paint(Graphics g)
	{
		g.drawString(msg1,50,100);
		g.drawString(msg2,50,200);
	}
}




		

