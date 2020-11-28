// eg-1 on scope of a variable
class Prog15
// global scope
{
	public static void main(String args[ ])
	// outer scope
	{
		int out_x = 10;

		// inner scope
		{
			int in_x = 20;
			// int out_x = 30;  // compile error, var "out_x" is already defined

			System.out.println("In Inner scope, out_x = " + out_x + " and in_x = " + in_x);   // 10, 20
		}
		// System.out.println("In Outer scope, out_x = " + out_x + " and in_x = " + in_x);   // compile error, var "in_x" not defined
	}
}			