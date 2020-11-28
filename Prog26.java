// write a recursive method to calculate the factorial value of any given int no. 
// define this method in a different class (i.e. other than the class which contains main())
// but in same .java file
// executable class
class Prog26
{
	public static void main(String args[ ])
	{
		int no = Integer.parseInt(args[0]);
		int fv = Fact.calcFv(no);
		System.out.print("Factorial value of " + no + " is " + fv);
	}
}

// non executable class i.e. it doesn't contain main()
class Fact
{
	static int calcFv(int x)
	{
		// validation
		if (x <= 0)
		{
			System.out.print("Cannot find the FV of -ve no");
			System.exit(0);  // terminate the appn
		}
		if (x == 1)
			return 1;

		return x * calcFv(x-1);
	}
}
