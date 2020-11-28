// accept a binary expression from user, evaluate it & display the results. Use cmd line args
// handle the foll. exceptions
// 1. If the no of args are invalid, throw "InvalidNoOfArgsException"
// 2. If the operator is invalid, throw "InvalidOperatorException"
// 3. If the result is -ve, throw "NegativeResultException"
// 4. Handle other std exceptions, if any
// Here if (let us say) that the 1st 2 exceptions are to managed using a single class (as there
// behaviour is same), then we use parameterized constructor
// For exception no 3, we will write a different class & here we will use default constructor
class GeneralException extends Exception
{
	// parameterized constructor
	GeneralException(String msg)
	{
		super(msg);  // msg is a variable
	}
}

class NegativeResultException extends Exception
{
	// default constructor
	NegativeResultException()
	{
		super("NegativeResultException");  // msg is a constant
	}
}

class Prog67
{
	public static void main(String args[ ])
	{
		try
		{
			if (args.length != 3)
				throw new GeneralException("InvalidNoOfArgsException");

			int no1 = Integer.parseInt(args[0]);
			int no2 = Integer.parseInt(args[2]);

			char op = args[1].charAt(0);

			if (op!='+' && op!='-' && op!='/' && op!='%' && op!='$')
				throw new GeneralException("InvalidOperatorException");

			int result;

			// analyse the operator & determine the result
			switch (op)
			{
				case '+':
					result = no1 + no2;
					break;

				case '-':
					result = no1 - no2;
					break;

				case '/':
					result = no1 / no2;
					break;

				case '%':
					result = no1 % no2;
					break;

				default:  // $
					result = no1 * no2;
			}
			if (result < 0)
				throw new NegativeResultException();

			System.out.print("Result of evaluation of expression is " + result);
		}
		catch (GeneralException e)
		{
			System.out.print(e.getMessage());
		}
		catch (NegativeResultException e)
		{
			System.out.print(e.getMessage());
		}
		catch (NumberFormatException e)
		{
			System.out.print("1st & 3rd parameters have to be int values");
		}
		// to manage other std exceptions, if any, then use the super class
		//Exception to handle them bcoz according to dynamic method dispatch,
		// a super class reference var can refer to a sub class object
		catch (Exception e)
		{
			System.out.print(e.getMessage());
		}
		// Note - This super exception handler should be @ the end of the list.
		// Attempting to catch super class exception before sub class exception
		// will result in compile time error
	}
}