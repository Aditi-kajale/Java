// an eg of sub class
class B extends A   // this is A.class & not A.java
{
	// i, j & showij() are available & accessible
	int k;

	void showk()
	{
		System.out.println("Value in k is " + k);
	}

	void sumijk()
	{
		System.out.println("Sum of i, j & k is " + (i+j+k));
	}
}

// executable class
class Prog42
{
	public static void main(String args[ ])
	{
		B objb = new B();
		objb.i = 10;
		objb.j = 20;
		objb.k = 30;
		objb.showij();
		objb.showk();
		objb.sumijk();
	}
}


