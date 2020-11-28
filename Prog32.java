// an eg of parameterized constructor
class Point
{
	private int x, y;
	private String colour;

	// parameterized constructor
	public Point(int a,int b,String c)
	{
		x = a;
		y = b;
		colour = c;
	}

	public void display()
	{
		System.out.println("Coords of point are " + x + " and " + y);
		System.out.print("Colour of point is " + colour);
	}
}

class Prog32
{
	public static void main(String args[ ])
	{
		// error, no such method Point() OR Point() cannot be applied to
		// Point(int,int,String) 
		// Point p = new Point();
		Point p = new Point(100,200,"red");
		p.display();
	}
}		




