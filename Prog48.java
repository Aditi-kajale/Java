// An eg of "Call By Reference" in Java
// Write a method "incr()" which increments the value of 2 int vars from main() by 2 different
// quantities say 3 & 5. Process is known as "Call By Reference". Result achieved.
class Test
{
	int a, b; 
}

class Prog48
{
	public static void main(String args[ ])
	{
		Test obj = new Test();
		obj.a = 10;
		obj.b = 20;
		System.out.println("Before incr(), values in a and b are " + obj.a + " and " + obj.b);
		incr(obj);  // Instead of passing each instance member which becomes
			// tedious, why not pass the object itself
		System.out.println("After incr(), values in a and b are " + obj.a + " and " + obj.b);
	}

	static void incr(Test ref)  // type of formal arg should match with type of actual arg
	{
		ref.a += 3;
		ref.b += 5;
	}
}
