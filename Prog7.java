// eg-1 of boolean literal
class Prog7
{
	public static void main(String args[])
	{
		// boolean b = 1;  // error, incompatible types
			// found - int, reqd - boolean
		boolean b = false;

		if (b)   // if (b == true)
			System.out.println("This statement will be executed");

		if (!b)    // if (b == false)
			System.out.println("This statement will not be executed");

		// error - Bad operands for binary operator >
		// 1st type - String, 2nd type - int
		// Arithmetical operators have precedence over Relational Operator
		// System.out.println("Is 10 > 5 ? " + 10 > 5);
		System.out.println("Is 10 > 5 ? " + (10 > 5));  // true
	}
}