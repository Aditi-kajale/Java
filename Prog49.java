// an eg to understand how dynamic method dispatch functions
class A
{
	void show()
	{
		System.out.println("A's implementation of show()");
	}
}

class B extends A
{
	// method overriding
	void show()
	{
		System.out.println("B's implementation of show()");
	}
}

class C extends B
{
	// subsequent overriding
	void show()
	{
		System.out.println("C's implementation of show()");
	}
}

class Prog49
{
	public static void main(String args[ ])
	{
		// super class reference
		A super_ref;   // declaration
		super_ref = new A(); // super_ref var now refers to object of type A
		super_ref.show();  // A's show()

		super_ref = new B();  // OK a super class ref var can refer to a sub class
				// object. B is sub class of A
		super_ref.show();  // B's show()

		super_ref = new C();  // OK
		super_ref.show();   // C's show()
	}
}




		










	