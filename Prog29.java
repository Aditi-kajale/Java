// design a class "Rectangle" with suitable attributes & methods to calculate area & perimeter
class Rectangle
{
	private int length, breadth;

	// In java, there are only 2 types of methods
	// 1. setter methods - These methods are void, have / take arguments & are 
	// normally used to initialise the fields of an object
	public void setDim(int l,int b)
	{
		length = l;
		breadth = b;
	}

	// 2. getter methods - These methods are non void (i.e. they have a return type),
	// with no arguments as they operate on field values
	public int getArea()
	{
		return length * breadth;
	}

	public int getPeri()
	{
		return 2 * (length + breadth);
	}
}

class Prog29
{
	public static void main(String args[ ])
	{
		Rectangle r = new Rectangle();
		// error, length has pvt access in class Rectangle
		// r.length = 20;
		r.setDim(20,10);
		r.setDim(8,3);
		r.setDim(10,6);
		System.out.println("Area of rect r is " + r.getArea());
		System.out.print("Perimeter of rect r is " + r.getPeri());
	}
}





