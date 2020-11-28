// an eg of 1D self initialised array of int values
class Prog17
{
	public static void main(String[ ] args)  // OK
	{
		int nos[ ] = {10,20,30,40,50};

		System.out.println("Elements of nos[ ] are");
		for (int i=0;i<nos.length;i++)
			System.out.print(nos[i] + "\t");
	}
}
