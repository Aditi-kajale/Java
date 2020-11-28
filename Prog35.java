// An eg of static vars/fields
class Prog35
{
	// instance vars/members
	int no1 = 10;
	int no2 = no1 + 5;

	public static void main(String args[ ])
	{
		// error, non static members cannot be referred using static context 
		//System.out.println("no1 contains " + no1);
		//System.out.print("no2 contains " + no2);	
		// Solution - 1
		// declare the vars no1 & no2 in scope of main() i.e. make them local
		// Solution - 2
		// keep them outside main() but declare them static
		// Solution - 3
		// create an object of class Prog35 from/within scope of itself
		Prog35 obj = new Prog35();
		System.out.println("no1 contains " + obj.no1);			
		System.out.println("no2 contains " + obj.no2);			
	}
}