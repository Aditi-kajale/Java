// accept a few names from user as command line args & sort and display them
class Prog77
{
	public static void main(String args[ ])
	{
		int i, j;

		System.out.println("Before sorting, names are ");
		for (i=0;i<args.length;i++)
			System.out.print(args[i] + "\t");

		// sorting procedure
		for (i=1;i<args.length;i++)
		{
			// comparison loop
			for (j=0;j<args.length-i;j++)
			{
			    if (args[j].compareToIgnoreCase(args[j+1]) < 0)   // diff > 0, swap bcoz
						// we require names in ASC
						// order
			    {
				// swap the name
				String temp = args[j];
				args[j] = args[j+1];
				args[j+1] = temp;
			    }
			}
		}

		System.out.println("\nAfter sorting, names are ");
		for (i=0;i<args.length;i++)
			System.out.print(args[i] + "\t");
	}
}











