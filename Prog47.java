// An eg of "Call By Value" in Java
// Write a method "incr()" which increments the value of 2 int vars from main() by 2 different
// quantities say 3 & 5. Process is known as "Call By Value". Result not achieved.
class Test
{
	int a, b;  // instance vars
}

class Prog47
{
	public static void main(String args[ ])
	{
		// vars a & b will come to life only after we create an object of class Test
		Test obj = new Test();
		obj.a = 10;
		obj.b = 20;
		System.out.println("Before incr(), values in a and b are " + obj.a + " and " + obj.b);
		incr(obj.a,obj.b);
		System.out.println("After incr(), values in a and b are " + obj.a + " and " + obj.b);
	}

	static void incr(int a,int b)
	{
		a += 3;
		b += 5;
	}
}
