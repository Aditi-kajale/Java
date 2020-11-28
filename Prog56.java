// eg - 1 to understand the behaviour of abstract class
abstract class A
{
	// general method / no abstract method
	void callMe()
	{
		System.out.println("A's implementation of callMe()");
	}

	// abstract method
	abstract void callMeToo();  // compulsory to terminate the method using ;
}

class B extends A
{
	// compulsory to override the abstract method of super class
	void callMeToo()
	{
		System.out.println("B's implementation of callMeToo()");
	}
}

class Prog56
{
	public static void main(String args[ ])
	{
		// error, class A is abstract, cannot instantiate
		// A obja = new A();
		B objb = new B();
		objb.callMe();  // A's implementation
		objb.callMeToo();  // B's implementation
	}
}




