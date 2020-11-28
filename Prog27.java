// define a class (non-executable) with 2 methods, 1 to calculate the sum of digits of any given int 
// no & another method, to determine whether the no is a Prime no or not. Keep both classes
// in different .java files
// executable class
class Prog27
{
	public static void main(String args[ ])
	{
		int no = Integer.parseInt(args[0]);
		// long cut
		// int sum = MathUtil.sumOfDigits(no);
		// System.out.println("Sum of digits of given no is " + sum);
		// short cut
		System.out.println("Sum of digits of given no is " + MathUtil.sumOfDigits(no));  // Nested method call
		

		// do not use this short cut for boolean methods bcoz in that case, it
		// will display "Given no is true" OR "Given no is false"
		// System.out.print("Given no is " + MathUtil.isPrime(no));

		// correct way is to use "if" command for boolean methods
		if (MathUtil.isPrime(no)) // true
			System.out.print("Given no is a Prime No");
		else
			System.out.print("Given no is not a Prime No");
	}
}