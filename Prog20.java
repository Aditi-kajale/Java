// to accept the data from user
// One of the techniques is using a class called as "Scanner" & which is kept in a package
// java.util & hence need to import it
// import java.util.*;   // OK but will import the entire library of classes
import java.util.Scanner;  // preferred for selective import

class Prog20
{
	public static void main(String args[ ])
	{
		// create an object of Scanner class to receive i/p from keyboard
		Scanner sc = new Scanner(System.in);  // System.in represents the KB i/p

		System.out.print("Enter empid :- ");
		int empid = sc.nextInt();  // nextInt() is a method of Scanner class which
					// accepts the i/p as int value

		sc.nextLine();  // to solve the issue of buffer wherein it doesn't accept the
			// data for next var 
		System.out.print("Enter fullname :- ");
		String fn = sc.nextLine();  // nextLine() accepts Strings with spaces

		System.out.print("Enter designation :- ");
		String desgn = sc.next();  // accepts the 1st word of given String only &
					// ignores the rest

		System.out.print("Enter salary :- ");
		double sal = sc.nextDouble();  // to accept nos with decimals

		System.out.println("Data of emp is");
		System.out.println("Empid :- " + empid);
		System.out.println("Fullname :- " + fn);
		System.out.println("Designation :- " + desgn);
		System.out.print("Salary :- Rs. " + sal);
	}
}

