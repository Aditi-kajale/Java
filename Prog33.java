// an eg of "this" keyword
class Point
{
	private int x, y;
	private String colour;

	public Point(int x,int y,String c)
	{
		this.x = x;
		this.y = y;
		this.colour = c; // here "this" is not compulsory bcoz the names colour
				// & c are different
	}

	public void display()
	{
		// as display() has no args, there is no conflict of names
		// so "this" is really not reqd
		System.out.println("Coords of point are " + this.x + " and " + this.y);
		System.out.print("Colour of point is " + colour);
	}
}

class Prog33
{
	public static void main(String args[ ])
	{
		Point p = new Point(100,200,"red");
		p.display();
	}
}		




