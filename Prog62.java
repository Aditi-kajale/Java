// an eg of caught exception
class Prog62
{
	public static void main(String args[ ])
	{
		int numer = 12, denom = 0;
		try
		{
			int result = numer / denom;
			System.out.println("Result of division is " + result);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Division by ZERO not possible");
			return;  // terminate the method/abort a process
		}
		finally
		{
			System.out.println("The code in finally executes always");
		}
		System.out.println("This code is out of finally");
	}
}