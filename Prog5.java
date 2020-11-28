// using ternary operator, determine the max no from given 3 nos
class Prog5
{
	public static void main(String args[ ])
	{
		int a = 10, b = 5, c = 30, max;

		//max = a > b ? a : b;  // 10
		//max = max > c ? max : c;  // 30

		max = a > b ?     a > c ? a : c    :     b > c ? b : c;

		System.out.print("Maximum no is " + max);
	}
}
	
