// design a class "Student" with suitable attributes and methods to accept & display data.
// At the end, display all records alongwith no of records created
class Student
{
	private int rollno;
	private String name;
	private double per;
	private static int count = 0;  // = 0 is optional bcoz static vars are auto initialised to 0

	// constructors are never "static" - non static method........
	public Student(int r,String n,int m1,int m2,int m3) // field names may not match the
						// arg list at times
	{
		rollno = r;
		name = n;
		per = (double) (m1 + m2 + m3) / 3;  // type cast
		count++;  // v. imp.
		System.out.println("Rollno - " + rollno + ", Name - " + name + ", Percent - " + per);
		
	}
	
	// a method to return the value of count, Getter Method
	public static int getCount()
	{
		// System.out.print(rollno);  // error, non static var rollno cannot be 
					// referenced from static context
		return count;
	}
}

class Prog34
{
	public static void main(String args[])
	{
		Student s1 = new Student(1,"paresh",67,55,90);
		Student s2 = new Student(2,"suresh",64,65,55);
		Student s3 = new Student(3,"sandesh",70,73,87);
		// Student.count++; // is possible if it is public, Unauthorised access
		// error, count has pvt access in class Student
		// System.out.println("No of records created are " + Student.count);
		System.out.println("No of records created are " + Student.getCount());
		System.out.println("No of records created are " + s1.getCount());  // OK
		// but not preferred as it is misleading
	}
}


