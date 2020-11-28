// eg 1 on type promotion in expressions
class Prog13
{
	public static void main(String args[ ])
	{
		byte a = 5, b = 2, c;

		// c = a + b;  // error, possible loss of precision
			// found-int, reqd-byte
		c = (byte) (a + b);  // OK

		System.out.println("c contains " + c);

		char ch = 'a';
		// ch++;  // OK
		// ch = ch + 1; // error, possible loss of precision
			// found-int, reqd-char

		ch = (char) (ch + 1);  // type casting from int to char

		System.out.print("ch contains " + ch);  // b		
	}
}