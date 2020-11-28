// an eg of default constructor
class DConstructor
{
	public void DConstructor()  // if we specify a return type to a constructor, then
			// it is no longer treated as a constructor but a normal
			// method
	{
		System.out.println("A new object is created");
	}
}

class Prog31
{
	public static void main(String args[ ])
	{
		DConstructor d1 = new DConstructor(); // calls constructor which is
					// missing in class defn
		
		d1.DConstructor();  // no error, but will call the "user defined method"
				// DConstructor
	}
}
