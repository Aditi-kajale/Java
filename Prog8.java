// eg- 2 of boolean literal
class Prog8
{
	public static void main(String args[])
	{
		// to print "Hello" 5 times
		boolean flag = true;   // to control the loop
		int count = 0;

		while (flag)
		{
			System.out.println("Hello");
			count++;
			if (count == 5)
				flag = false; // break; // will do in this case	
		}
	}
}