// to prove that new Strings are not created always especially if they are created using
// String literals. This saves a lot of memory of the application
class Prog74
{
	public static void main(String args[ ])
	{
		String s1 = "databyte";  // String literal - direct assignment & constructor
				// not used
		String s2 = new String("databyte");  // using constructor
		String s3 = "databyte";

		System.out.println("Are contents of s1 and s2 same? " + s1.equals(s2)); // true
		System.out.println("Are contents of s1 and s3 same? " + s1.equals(s3)); // true
		System.out.println("Are references of s1 and s2 same? " + (s1==s2)); // false
		System.out.println("Are references of s1 and s3 same? " + (s1==s3)); // true
	}
}

