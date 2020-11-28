// To prove that Strings created using StringBuffer class are mutable (modifiable)
class Prog83
{
	public static void main(String args[ ])
	{
		// incompatible types
		// found-String, reqd-StringBuffer
		// StringBuffer s1 = "Hello";
		StringBuffer s1 = new StringBuffer("Hello");  // OK use constructor
		StringBuffer s2 = s1;

		System.out.println("Before modification");
		System.out.println("s1 contains " + s1 + " and s2 contains " + s2);
		// Hello, Hello
		System.out.println("Are references of s1 and s2 same ? " + (s1==s2));
		// true

		s1.append("Sir");   // with StringBuffer objects += operator is not
				// supported & instead of concat() use append()

		System.out.println("After modification");
		System.out.println("s1 contains " + s1 + " and s2 contains " + s2);
		// HelloSir, HelloSir
		System.out.println("Are references of s1 and s2 same ? " + (s1==s2));
		// true
	}
}