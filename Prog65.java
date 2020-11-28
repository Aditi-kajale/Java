// an eg of nested try blocks
class Prog65
{
	public static void main(String args[ ])
	{
		int numer = 12, denom[ ] = {2,0,6,0,3};

		// outer try
		try
		{
		      for (int i=0;i<10;i++)
		      {
			// inner try
			try
			{
				int result = numer / denom[i];
				System.out.println(numer + "/" + denom[i] + " = " + result);
			}
			catch (ArithmeticException e)
			{
				System.out.println("Division by ZERO not possible");
			}

		        } // end of for loop
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index Out of Array Range");	
		}	
	}
}