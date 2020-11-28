// accept a letter from user as command line argument & change it's case
class Prog24
{
	public static void main(String args[ ])
	{
		char ch = args[0].charAt(0);  // to get 0th char from 1st String of command
					// line argument

		// in validations, rejection part should be first
		if (!Character.isLetter(ch))  // boolean
			System.out.print("Pls. enter a letter only");
		else
		{			
			// logic for conversion
			if (Character.isLowerCase(ch))  // true
				// ch -= 32;   // OK
				ch = Character.toUpperCase(ch);
			else
				// ch += 32;  // OK
				ch = Character.toLowerCase(ch);

			System.out.print("Converted letter is " + ch);
		}
	}
}
/*
Method syntax

1. boolean isLetter(char)
2. char toUpperCase(char)
*/
