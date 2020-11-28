// an eg of precedence (priority) of operator 
class Prog3
{
	public static void main(String args[ ])
	{
		int a = 10;

		System.out.println("a + 2 = " + a  + 2);  // a + 2 = 102
		// 1st step - "a+2 = " + a ==> "a+2 = 10"
		// 2nd step - "a+2 = 10" + 2 ==> "a+2 = 102"
		System.out.println("a + 2 = " + (a  + 2));  // brackets get 1st priority a+2=12
		System.out.println("a x 5 = " + a * 5); // a x 5 = 50, BEDMAS
		// System.out.print("a - 4 = " + a - 4); // compile error
		// 1. "a - 4 = " + a --> "a - 4 = 10"
		// 2. "a - 4 = 10" - 4 --> error, bad operand types for binary operator "-"
		// 1st type - String, 2nd type - int
		System.out.print("a - 4 = " + (a - 4));  // a - 4 = 6
		// With Strings, one can use only + operator & other operators are invalid
	}
}