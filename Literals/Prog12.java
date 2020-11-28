// an eg of explicit conversion
class Prog12
{
	public static void main(String args[ ])
	{
		byte b1 = 100;   // OK
		int i = 100;  // OK
		// byte b2 = i;  // compile error, possible loss of precision
			// found-int, reqd-byte
		byte b2 = (byte) i;  // OK

		// byte b3 = 130; // compile error, same as above
		byte b3 = (byte) 130;  // OK but will corrupt the value
				// exceeded by 3 on RHS to accomodate on LHS
				// -129 + 3 = -126

		byte b4 = (byte) 300;  // OK --- do ---
		byte b5 = (byte) 400;  // -- do --, if no > 256, then the result is no % 256
				// but ensure that the result is <= 127

		System.out.println("b1 contains " + b1); // 100 
		System.out.println("b2 contains " + b2); // 100
		System.out.println("b3 contains " + b3); // -126
		System.out.println("b4 contains " + b4); // 44
		System.out.println("b5 contains " + b5); // -112
	}
}
	