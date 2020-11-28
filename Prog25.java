// define your own method (function) which returns the absolute value of any given whole (int) no
// Write this method in the same class as that of main()
class Prog25
{
	// method has to be static here bcoz method is called using class name
	static int abs(int x)
	{
		if (x < 0)  // no is -ve
			return -x;
		
		return x;
	}

	public static void main(String args[ ])
	{
		int no = Integer.parseInt(args[0]);
		no = abs(no);   // if the method name is not preceeded by class name,
			// it means the compiler will look for this method in 
			// class Prog25
		//no = Prog25.abs(no);  // OK but class name is optional
		System.out.print("Absolute value of given no is " + no);
	}

}

/* There are 2 syntax to call a method

1. meth_name(arg-list);   // void method
2. var_name = meth_name(arg-list);  // non void method i.e. it has a return type of var_name

*/