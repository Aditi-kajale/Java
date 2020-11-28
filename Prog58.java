// an eg of interfaces
interface Area
{
	// int r;    // error, instance members not allowed
	double PI = 3.14;  // auto becomes
	// public final static double PI = 3.14;

	double getArea();  // auto becomes
	// public abstract double getArea();
}

interface Circ
{
	double getCirc();
}

class Circle implements Area, Circ
{
	int r;

	public Circle(int r)
	{
		this.r = r;
	}

	// compulsory to override the abstract methods of implementing
	// the above interfaces. Use public access specifier, otherwise we get error
	public double getArea()
	{
		return PI * r * r;
	}

	public double getCirc()
	{
		return 2 * PI * r;
	}
}

class Prog58
{
	public static void main(String args[])
	{
		Circle c = new Circle(10);
		System.out.println("Area of circle c is " + c.getArea());
		System.out.println("Circumference of circle c is " + c.getCirc());
	}
}




	







