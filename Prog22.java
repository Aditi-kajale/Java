// accept "n" nos from user as command line arguments & display their sum
class Prog22
{
	public static void main(String args[ ])
	{
		double sum = 0;  // initialise to 0 bcoz we want running total in var sum

		for (int i=0;i<args.length;i++)
			sum += Double.parseDouble(args[i]);
		// every no passed @ command line is in String form

		System.out.print("Sum of given nos is " + sum);
	}
}