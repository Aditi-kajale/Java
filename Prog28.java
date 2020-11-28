// design a class "Circle" with suitable attributes & methods to calculate area & circumference 
// of a circle. Create 2 objects of class Circle & display their details
// non executable class
class Circle
{
	// the attributes should be such that we should be able to distinguish between
	// any 2 objects of that class
	int r, x, y;

	// methods to calculate area & circumference
	double area()
	{
		return 3.14 * r * r;
	}

	double circ()
	{
		return 2 * 3.14 * r;
	}
}

class Prog28
{
	public static void main(String args[ ])
	{
		// create objects of class Circle
		Circle c1 = new Circle();
		Circle c2;
		c2 = new Circle();

		// to refer to the members, use . syntax
		c1.r = 10;
		c1.x = 100;
		c1.y = 200;

		double ac = c1.area();
		double cc = c1.circ();

		System.out.println("Coords of center of c1 are " + c1.x + " and " + c1.y);
		System.out.println("Area of c1 is " + ac + " and circumference is " + cc);

		System.out.print("Coords of center of c2 are " + c2.x + " and " + c2.y);
		// 0, 0    If the int attributes of object are not initialised, they are auto
		// initialised to 0. If they are String attributes, they are initialised to null
	}
}
		










