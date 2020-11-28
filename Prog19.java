// an eg of jagged array
class Prog19
{
	public static void main(String args[ ])
	{
		int nos[ ] [ ] = new int[3][ ];
		nos[0] = new int[2];  // lhs, base is 0 and rhs, base is 1
		nos[1] = new int[4];
		nos[2] = new int[1];

		int i, j, k = 10;  // k to generate & auto fill numbers 10,20,30,..... in nos[][]

		for (i=0;i<3;i++)
		{
			for (j=0;j<nos[i].length;j++)
			{
				nos[i][j] = k;
				k += 10;
			}
		}

		System.out.println("Contents of nos[][] are");
		for (i=0;i<3;i++)
		{
			for (j=0;j<nos[i].length;j++)
				System.out.print(nos[i][j] + "\t");

			System.out.println();
		}
	}
}
