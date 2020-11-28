// In String class, we have 2 more methods for comparing Strings
// 1. compareTo()  2. compareToIgnoreCase()
// These methods do not return true or false like the equals(), but instead they return the
// difference of ascii code of corresponding chars from 2 Strings
class Prog76
{
	public static void main(String args[ ])
	{
		String s1 = args[0];
		String s2 = args[1];

		int diff = s1.compareToIgnoreCase(s2);
		System.out.println("Diff of 2 Strings is " + diff);
	}
}
