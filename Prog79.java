// an eg of substring() to extract a portion of a String
class Prog79
{
	public static void main(String args[ ])
	{
		String name = "databyte computer trg. center, Karve rd, pune-4";

		String s1 = name.substring(9);  // starting position
		String s2 = name.substring(9,17); // start, end position + 1
				// substring() is overloaded for 1 or 2 parameters

		System.out.println("s1 contains " + s1);
		System.out.println("s2 contains " + s2);
	}
}
