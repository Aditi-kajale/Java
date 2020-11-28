// an eg of String literal
class Prog9
{
	public static void main(String args[])
	{
		String s1 = "databyte computers";
		String s2 = "databyte\n\tcomputers";  // support for escape sequence
		// treat char after \ as command & if it is command, treat it as a char
		// String s3 = ""databyte computers""; // error, missing ; after "
		String s3 = "\"databyte computers\"";
		String path = "d:\\test\\new.txt";

		System.out.println("s1 contains " + s1);
		System.out.println("s2 contains " + s2); 
		System.out.println("s3 contains " + s3); 
		System.out.print("path contains " + path);
	}
}