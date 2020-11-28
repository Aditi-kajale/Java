// eg-1 of method overloading
class Overload
{
	void test()
	{
		System.out.println("Invocation of parameterless test()");
	}

	void test(int i)
	{
		System.out.println("Invocation of test() with 1 int parameter");
	}

	void test(int i1,int i2)
	{
		System.out.println("Invocation of test() with 2 int parameters");
	}

	// error, test(int) already defined
	/* int test(int x)
	{
		System.out.println("Invocation of test() with 1 int parameter");
		return x;  // non void methods must contain return statement
	} */

	double test(double no)
	{
		System.out.println("Given no is " + no);
		return no * no;
	}
}

class Prog38
{
	public static void main(String args[ ])
	{
		Overload obj = new Overload();  // compulsory to create an object as the
				// method test() is instance (non-static)
		obj.test();
		obj.test(10);
		obj.test(10,20);
		// only non void methods are nested while calling
		System.out.println("Square of no 2.5 is " + obj.test(2.5));
	}
}












	