// eg 2 on type promotion in expressions
class Prog14
{
	public static void main(String args[ ])
	{
		int r = 10;

		// error, possible loss of precision
		// found-double, reqd-float
		// float ac = 3.14 * r * r;
		// float cc = 2 * 3.14 * r;

		// float ac = 3.14F * r * r;  // OK
		double ac = 3.14 * r * r;  // OK
		float cc = (float) (2 * 3.14 * r);  // OK

		System.out.println("Area of circle is " + ac);
		System.out.println("Circumference of circle is " + cc);
	}
}