// to add TWO 2D arrays of int values & display the added matrix
class Prog18
{
	public static void main(String[ ] args) 
	{
		int [ ] [ ] a = {{1,2},{3,4}}, b = {{5,6},{7,8}}, t;
		t = new int[2][2];

		int i, j;

		// to add the corresponding elements
		for (i=0;i<2;i++)
		{
			for (j=0;j<2;j++)
				t[i][j] = a[i][j] + b[i][j];
		}

		System.out.println("Added matrix is");
		for (i=0;i<2;i++)
		{
			for (j=0;j<2;j++)
				System.out.print(t[i][j] + "\t");
		
			System.out.println();  // next row els. on new line
		}
	}
}