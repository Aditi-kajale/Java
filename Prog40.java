// Even constructors are methods & can be overloaded
// Define a class "Room" for an infrastructure company with suitable attributes & methods to
// calculate area & perimeter of any given room
class Room
{
	private int length, breadth;

	// constructor for rectangular room
	public Room(int l,int b)
	{
		length = l;
		breadth = b;
	}

	// constructor for squarish room
	public Room(int s)
	{
		length = breadth = s;
	}

	// common methods to calculate area & perimeter of rect & square
	public int getArea()
	{
		return length * breadth;
	}

	public int getPeri()
	{
		return 2 * (length + breadth);
	}
}

class Prog40
{
	public static void main(String args[ ])
	{
		Room hall = new Room(15,10);
		Room balcony = new Room(9);
		System.out.println("Area & Perimeter of hall is " + hall.getArea() + " and " + hall.getPeri());
		System.out.println("Area & Perimeter of balcony is " + balcony.getArea() + " and " + balcony.getPeri());
	}
}




