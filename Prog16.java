// eg-2 on scope of a variable
class Prog16
{
	public static void main(String args[ ])
	{
		// to print "Hello" 5 times
		// int cntr;  // outer scope & var "cntr" is accessible anywhere in main()
			// & can be used in both "for" loops

		// when we declare "int cntr=0" in the "for" loop, we are limiting the scope
		// of "cntr" to the loop only & this var will not be accessible outside the
		// scope of "for" loop
		for (int cntr=0;cntr<5;cntr++)
			System.out.println("Hello");

		// to print "Hi" times 10 times
		// Error, var "cntr" not defined
		// for (cntr=0;cntr<10;cntr++)
		//	System.out.println("Hi");

	}
}
