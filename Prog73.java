// eg - 2 on constructor of String class
class Prog73
{
	public static void main(String args[ ])
	{
		byte nos[ ] = {65,66,67,68,69,70,71,72};

		String s1 = new String(nos);
		String s2 = new String(nos,3,5);

		System.out.println("s1 contains " + s1); // A-H
		System.out.print("s2 contains " + s2); // D-H
	}
}

// In case "byte" datatype of array "nos" is replaced by "int" datatype, we get compile error,
// bcoz in method overloading, if a matching type is not found, then the type is auto
// promoted to it's nearest ones & the method gets executed. In this case we get error bcoz
// int type will not be demoted to byte type by the compiler.