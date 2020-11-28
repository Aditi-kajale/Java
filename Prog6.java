// an eg of char literal
class Prog6
{
	public static void main(String args[ ])
	{
		char ch = 'a';
		ch++;  // OK bcoz internally char is represented as a no (unicode)
		System.out.println("Now ch contains " + ch);  // b
		System.out.print("Unicode of ch is " + (int) ch);  // typecasting
	}
}


		