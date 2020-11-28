// Commercial Appn of Dynamic Method Dispatch
// Define a class "Emp" with attributes "empid" & "empname" and with methods "accept()"
// & "display()"
// Define a class "Temp_Emp" which inherits "Emp" & with additional attributes "rate_hr" &
// "hrs_wkd".
// Define a class "Perm_Emp" which inherits "Emp" & with additional attributes "desgn" & 
// "salary".
// Accept data of "n" employees & display their details
import java.util.Scanner;

class Emp
{
	private int empid;
	private String empname;
	Scanner sc = new Scanner(System.in);  // do not declare this object/attribute as 
			// private bcoz the sub class need access to it

	public void accept()
	{
		System.out.print("Enter empid :- ");
		empid = sc.nextInt();
		System.out.print("Enter empname :- ");
		empname = sc.next();
	}

	public void display()
	{
		System.out.print("Empid - " + empid + ", Name - " + empname);	
	}
}

class Temp_Emp extends Emp
{
	private int rate_hr, hrs_wkd;

	// overriding
	public void accept()
	{
		super.accept();  // v. imp. (avoid redundancy & also empid & empname
				// are pvt in super class)
		System.out.print("Enter rate per hour :- ");
		rate_hr = sc.nextInt();
		System.out.print("Enter no of hours worked :- ");
		hrs_wkd = sc.nextInt();
	}

	public void display()
	{
		super.display();
		System.out.println(", Type - Temp, Rate/hr - " + rate_hr + ", Hours wkd - " + hrs_wkd + ", Net Pay - " + rate_hr * hrs_wkd);  // expressions are supported SOP
	}
}

class Perm_Emp extends Emp
{
	private String desgn;
	private int sal;

	public void accept()
	{
		super.accept();
		System.out.print("Enter designation :- ");
		desgn = sc.next();
		System.out.print("Enter salary :- ");
		sal = sc.nextInt();
	}

	public void display()
	{
		super.display();
		System.out.println(", Type- Permanent, Designation - " + desgn + ", Salary - " + sal);
	}
}

class Prog50
{
	public static void main(String args[ ])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of employees :- ");
		int noe = sc.nextInt();
		// to store data of "n" employees, we will require an array.
		// However we do not know, how many employees are of each type i.e.
		// Temp, Perm, Skilled, Unskilled, etc. This is imp to know bcoz an array
		// is a collection of homogenous elements. 
		Emp arr[ ] = new Emp[noe];
		int i;
		char type;
		for (i=0;i<noe;i++)
		{
			System.out.print("Enter t/T (Temp) OR p/P (Perm) :- ");
			type = sc.next().charAt(0);
			if (type=='t' || type=='T')
				arr[i] = new Temp_Emp();
			else
				arr[i] = new Perm_Emp();

			arr[i].accept();  // dynamic method dispatch
		}
		System.out.println("Data of emps is");
		for (i=0;i<noe;i++)
			arr[i].display();  // dynamic method dispatch
	}
}

		




















































