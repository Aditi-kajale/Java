// accept the age of an insurer from user as command line argument between 5-50 yrs
// & display it. Throw the foll. exceptions
// 1. If the age < 5, throw "AgeTooSmallException"
// 2. If the age > 50, throw "AgeTooLargeException"
// 3. Handle other std exceptions, if any.
// Logic - In this case, if age < 5 or age > 50, we do not want to insure the person. As the
// behaviour of both exceptions is same, we can handle/manage them using a single class.
// To achieve this, use the parameterized constructor
class AgeException extends Exception
{
	// parameterized constructor
	AgeException(String msg)
	{
		super(msg);  // this msg can be retrieved later using getMessage()
	}
}

class Prog66
{
	public static void main(String args[ ])
	{
		try
		{
			int age = Integer.parseInt(args[0]);
			if (age < 5)
				throw new AgeException("AgeTooSmallException");

			if (age > 50)
				throw new AgeException("AgeTooLargeException");

			System.out.print("Age is OK and processing continues.......");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Pls. enter your age");
		}
		catch (NumberFormatException e)
		{
			System.out.print("Pls. enter the age in figs");
		}
		catch (AgeException e)
		{
			System.out.print(e.getMessage());
		}	
	}
}			




