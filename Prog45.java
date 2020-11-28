// Method Overriding - In Inheritance, if a method in sub class has the same name & type
// signature as a method in it's super class, then the method in sub class is said to override
// the method in super class
class A
{
	void meth()
	{
		System.out.println("A's implementation of meth()");
	}
}

class B extends A
{
	// method overriding
	void meth()
	{
		System.out.println("B's implementation of meth()");
		super.meth();  // to call overridden meth()
		// meth();  // B's obj will call it's own method again & again and will
				// result in endless recursion
	}
}

class Prog45
{
	public static void main(String args[ ])
	{
		B objb = new B();
		objb.meth();
		// objb.super.meth();  // error, bcoz super keyword is to be used only
				// in a class to refer to it's immediate super class
	}
}
