// an eg of toString()
class Student
{
	private int rollno;
	private String name;
	private double per;

	public Student(int r,String n,double p)
	{
		rollno = r;
		name = n;
		per = p;
	}

	// override the toString() of Object class
	// if we do not override this method, then SOP() will print the address of
	// Student object from memory
	public String toString()
	{
		return "Rollno - " + rollno + ", Name - " + name + ", Percent - " + per;
	}
}

class Prog71
{
	public static void main(String args[ ])
	{
		Student s1 = new Student(1,"kamlesh",67.33);
		Student s2 = new Student(2,"sunita",75.00);
		Student s3 = new Student(3,"ashok",80.01);

		// calling an object actually means calling the super class's (Object)
		// toString()
		System.out.println("s1 contains " + s1.toString());
		System.out.println("s2 contains " + s2);
		System.out.println("s3 contains " + s3);
	}
}



