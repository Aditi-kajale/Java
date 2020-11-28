// an eg of a class which refers to another class which is kept in another path
// import nipun.*;  // * is wild card character & will import all classes from nipun package

class Prog69
{
	public static void main(String args[ ])
	{
		int no = Integer.parseInt(args[0]);
		// no = MathOpns.abs(no);
		// if import statement is not used, we need to use full qualifier
		no = nipun.MathOpns.abs(no);
		System.out.println("Absolute value of given no is " + no);
	}
}
