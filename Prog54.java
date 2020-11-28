// an eg of final method
class A
{
	final void test()
	{
		System.out.println("A's implementation of test()");
	}
}

class B extends A
{
	// error, cannot override final method
	void test()
	{
		System.out.println("B's implementation of test()");
	}
}
