// an eg of executable class
import nipun.Customer;  // selective import

class Prog70
{
	public static void main(String args[ ])
	{
		// self initialised array of customer objects
		Customer arr[ ] = new Customer[5];
		arr[0] = new Customer(1,"manish",-10000.35);
		arr[1] = new Customer(2,"sandesh",9000.55);
		arr[2] = new Customer(3,"mahesh",-12300.00);
		arr[3] = new Customer(4,"beena",8000.75);
		arr[4] = new Customer(5,"namita",-8735.60);

		System.out.println("Customers with -ve bal in their a/cs are");
		System.out.println("Custid\tName\tBal");
		for (int i=0;i<5;i++)
			arr[i].display();
	}
}