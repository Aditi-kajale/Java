// Method Overloading - If a method in sub class has the same name but different type
// signature from a method in it's super class, then the method in sub class is said to overload
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
	// method overloading
	void meth(String msg)
	{
		System.out.println(msg);
	}
}

class Prog46
{
	public static void main(String args[ ])
	{
		B objb = new B();
		objb.meth();  // No error, as meth() i.e.parameterless is not existing in class
			// B, it will refer to it's super class which already has this method
		objb.meth("B's implementation of meth()");
	}
}
