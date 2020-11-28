// to prove that even the parameterized constructors of sub class invoke the default constructor
// of super class, provided the sub class constructors do not invoke the parameterized
// constructor of super class
class A
{
	// default constructor
	A ()
	{
		System.out.println("Invocation of default constructor of class A");
	}
}

class B extends A
{
	// parameterized constructor
	B (int x)
	{
		// super();   // inserted by compiler auto
		System.out.println("Invocation of parameterized constructor of class B");
	}
}

class C extends B
{
	// parameterized constructor
	C (int x)
	{
		super(x);  // imp - now super() is not called by compiler i.e. default
			// constructor of class B
		System.out.println("Invocation of parameterized constructor of class C");
	}
}


class Prog52
{
	public static void main(String args[ ])
	{
		C objc = new C(10);
	}
}





		