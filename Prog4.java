// an eg of pre/post increment/decrement operators
class Prog4
{
	public static void main(String args[])
	{
		int a = 10;
		int b = a++;  // 1st preference is for assignment operator where in value of a
			// is assigned to b & then a increments
		System.out.println("a = " + a + " and b = "+ b); // b 10, a 11
		a *= 7;  // a = a * 7;
		System.out.print("a = " + a); // a 77
	}
}
