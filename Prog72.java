// eg - 1 on constructor of String class
class Prog72
{
	public static void main(String args[ ])
	{
		char data[ ] = {'d','a','t','a','b','y','t','e'};
		String s1 = new String(data);
		String s2 = new String(data,2,3);

		System.out.println("s1 contains " + s1);  // databyte
		System.out.println("s2 contains " + s2);  // tab
	}
}