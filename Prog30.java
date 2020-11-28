// an eg of default constructor
class DConstructor
{
	public void DConstructor()
	{
		System.out.println("A new object is created");
	}
}

class Prog30
{
	public static void main(String args[ ])
	{
		DConstructor d1 = new DConstructor(); // declaration, memory allocation
					// & calling the DConstructor()
		DConstructor d2;  // declaration, constructor not called
		d2 = new DConstructor(); // constructor is called again bcoz a new 
					// object is created

		// d1.DConstructor();  // error, constructor cannot be invoked manually
	}
}
