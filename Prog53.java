// an eg of final var
class Prog53
{
	public static void main(String args[ ])
	{
		final double PI = 3.14;  // normally by convention, constants are written
				// in caps

		PI = 3.1428;  // error, cannot assign a value to a final var
	}
}

		