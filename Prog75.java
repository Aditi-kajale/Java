// To prove that Strings created using String class are immutable i.e. unmodifiable
class Prog75
{
	public static void main(String args[ ])
	{
		String s1 = "Hello";
		String s2 = s1;

		System.out.println("Before");
		System.out.println("s1 contains " + s1 + " and s2 contains " + s2);
		// Hello, Hello
		System.out.println("Are references of s1 and s2 same ? " + (s1==s2));
		// true

		s1 += "Sir";   // s1 = s1.concat("Sir");

		System.out.println("After");
		System.out.println("s1 contains " + s1 + " and s2 contains " + s2);
		// HelloSir, Hello
		System.out.println("Are references of s1 and s2 same ? " + (s1==s2));
		// false
	}
}
	