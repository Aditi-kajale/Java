// To prove that in a class hierarchy i.e. inheritance, the default constructor of super class is 
// automatically invoked by the default constructor of sub class
class A
{
	A ()
	{
		System.out.println("Invocation of default constructor of class A");
	}
}

class B extends A
{
	B ()
	{
		// super(); // auto inserted by compiler
		System.out.println("Invocation of default constructor of class B");
	}
}

class C extends B
{
	C ()
	{
		// super(); // auto inserted by compiler
		System.out.println("Invocation of default constructor of class C");
		// super(); // error, call to super() must be the 1st statement in
			// sub class constructor. Otherwise the super class 
			// constructors will be called multiple times & violates the
			// principle of constructor.
	}
}

class Prog51
{
	public static void main(String args[ ])
	{
		C objc = new C();
	}
}
		