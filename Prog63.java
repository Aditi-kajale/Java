// accept some whole nos from user as command line arguments & display them. At the end,
// display the total no of Valid & Invalid arguments
class Prog63
{
	public static void main(String args[ ])
	{
		int cntr = 0;  // to count the no of valid args
			// args.length - cntr will give the no of invalid args

		for (int i=0;i<args.length;i++)
		{
		     try
		     {
			int no = Integer.parseInt(args[i]);
			System.out.println("Valid Arg ==> " + no);  // args[i] will do
			cntr++;
		     }
		     catch (NumberFormatException e)
		     {
			System.out.println("Invalid Arg ==> " + args[i]);
		     }
		}
		System.out.println("No of valid args are " + cntr);
		System.out.println("No of invalid args are " + (args.length-cntr));
	}
}
		
