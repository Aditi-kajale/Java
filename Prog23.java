// accept a character from user as command line argument & determine it's category i.e.
// whether it is a capital or small letter, digit or a symbol
class Prog23
{
	public static void main(String args[ ])
	{
		// compile error - No such method "parseChar()" in class "Character"
		// char ch = Character.parseChar(args[0]);
		// Logic - why this method is not there in class Character?
		// parseInt() converts "1980" (String)  ==> 1980 (int) bcoz capacity of int
		// is 10 digits
		// parseChar() cannot convert a String to char bcoz String is a sequence
		// of chars & cannot be converted to a single char i.e.
		// parseChar() converts "databyte" (String) ==> 'databyte' (char) X (not ok)
		// At the most, we can say, that a method can return a char from a String
		char ch = args[0].charAt(0);  // charAt(int pos) is a method in String class
		
		// "d" --> 'd' // charAt(0)

		if (Character.isUpperCase(ch))  // is....() are of boolean type
			System.out.print("Capital Letter");
		else if (Character.isLowerCase(ch))
			System.out.print("Small Letter");
		else if (Character.isDigit(ch))
			System.out.print("Digit");
		else
			System.out.print("Symbol");
	}
}