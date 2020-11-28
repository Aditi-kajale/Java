// accept the year from user as command line argument & determine whether it is a Leap
// year or not
class Prog21
{
	public static void main(String[ ] x)  // args is an identifier & can be any name
	{
		// compile error - Inconvertible types
		// found-String, reqd-int
		// int year = (int) x[0];   // x[0] is a String on which mathemetical calculations
				// cannot be carried out & hence the conversion
				// typecast is used for converting 1 pdt to another
				// pdt - primitive datatype i.e. basic types eg int, char,
				// float, boolean, etc. Typecast is not applicable to
				// convert Object (String) to pdt (int)
		int year = Integer.parseInt(x[0]); // OK. To facilitate conversion of Object to
		// pdt i.e. String to int, java provides us a special set of classes called as
		// Wrapper classes, which contain special method for such conversions.
		// So this conversion is done by calling the parseInt() of Integer class
	
		if ((year%4==0 && year%100!=0) || year%400==0)
			System.out.print("Given year is a Leap Year");
		else
			System.out.print("Given year is not a Leap Year");
	}
}
