// an eg of double literal
class Prog11
{
	public static void main(String args[ ])
	{
		float f1 = 9;
		//float f2 = 9.0;  // compile error, possible loss of precision
			// found - double, reqd - float
		// float f2 = (float) 9.0;  // OK, typecasting
		float f2 = 9.0F; // treat double literal as a float literal & then assign it to f2
		double d = 123.123456789012;  // OK

		System.out.println("f1 contains " + f1);  // 9.0
		System.out.println("f2 contains " + f2);  // 9.0
		System.out.println("d contains " + d);  // same as the one we assigned
	}
}