// In method overloading, if a matching type is not found, then the type is auto. promoted to
// it's nearest ones & the method with that argument type gets executed
// Order is   byte-->short-->int-->long-->float-->double
class Overload
{
	void test(float f)
	{
		System.out.println("Invocation of test() with 1 float parameter");
	}

	void test(byte b)
	{
		System.out.println("Invocation of test() with 1 byte parameter");
	}

	void test(long l)
	{
		System.out.println("Invocation of test() with 1 long parameter");
	}
}

class Prog39
{
	public static void main(String args[ ])
	{
		Overload obj = new Overload();
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		float f = 10;
		double d = 10;
		// even though the program passes value 10 @ runtime, it is the parameter
		// type which determines which method is to be called
		obj.test(b); // test(byte)
		obj.test(s); // test(long)
		obj.test(i); // test(long)
		obj.test(l); // test(long)
		obj.test(f); // test(float)
		// obj.test(d); // error, test(double) not found
		obj.test((float)d);  // OK typecast is allowed, test(float)
	}
}














