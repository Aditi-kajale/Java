// to prove that the sub class cannot access pvt members of super class
class A
{
	int i;
	private int j;

	void showij()
	{
		System.out.println("Values in vars i and j are " + i + " and " + j);
	}
	
	// getter method
	int getj()
	{
		return j;
	}

	// setter method
	void setj(int no)
	{
		j = no;
	}
}

class B extends A
{
	// i, j, showij(), getj() are available
	// i, showij() & getj() are accessible but j is not accessible
	int k;

	void showk()
	{
		System.out.println("Value in var k is " + k);
	}

	void sumijk()
	{
		// error, var j has pvt access in class A
		// System.out.println("Sum of i, j & k is " + (i+j+k));
		System.out.println("Sum of i, j & k is " + (i+getj()+k)); // OK, getj() is not
							// pvt
	}
}

class Prog43
{
	public static void main(String args[ ])
	{
		B objb = new B();
		objb.i = 10;  // OK
		// objb.j = 20;  // error, same as above
		objb.setj(20);  // OK bcoz setj() is not pvt
		objb.k = 30;  // OK
		objb.showij();
		objb.showk();
		objb.sumijk();
	}
}






