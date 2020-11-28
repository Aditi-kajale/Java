// an eg of multiple catch blocks
class Prog64
{
	public static void main(String args[ ])
	{
		int numer = 12, denom[ ] = {2,0,6,0,3};

		// try to divide numer with each denom from array
		for (int i=0;i<10;i++)
		{
			try
			{
				int result = numer / denom[i];
				System.out.println(numer + "/" + denom[i] + " = " + result);
			}
			catch (ArithmeticException e)
			{
				System.out.println("Division by ZERO not possible");
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Index out of array range");
				break;  // to break out of "for" loop		
			}
		}
		System.out.println("Out of loop Statement.....");
	}
}