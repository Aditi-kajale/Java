// an eg of super keyword
class A
{
	int i;
}

class B extends A
{
	int i;   // OK but will hide member "i" of super class

	B(int x,int y)
	{
		i = x;   // i of sub class
		super.i = y;  // i of super class
	}

	void display()
	{
		System.out.println("i of super class is " + super.i + " and of sub class is " + i);
	}
}

class Prog44
{
	public static void main(String args[ ])
	{
		B objb = new B(10,20);
		objb.display();  // 20, 10
	}
}





