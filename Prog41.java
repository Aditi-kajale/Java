// define a method which returns the sum of "n" int values passed as an argument
// Here we can handle the situation by using a concept called as "variable length arg" to a
// method i.e. every arg passed to the method is accepted as an element of a dynamic array
class Overload
{
	int getSum(int ... nos)  // special syntax, we use 3 ellipses, do not specify the
			// parameter as int nos[ ] bcoz in this case, it will accept
			// the arg only if it is passed as an array.
	{
		// here "nos" is auto converted to a dynamic array
		int sum = 0;
		for (int i=0;i<nos.length;i++)
			sum += nos[i];

		return sum;
	}

	// overloading getSum()
	int getSum(int a,int b,int c)
	{
		System.out.println("getSum(a,b,c) method called");
		return a+b+c;
	}
}

class Prog41
{
	public static void main(String args[ ])
	{
		Overload obj = new Overload();

		System.out.println("Sum of 10 & 20 is " + obj.getSum(10,20));
		System.out.println("Sum of 10, 20 & 30 is " + obj.getSum(10,20,30));
		System.out.println("Sum of 10, 20,30  & 40 is " + obj.getSum(10,20,30,40));
		System.out.println("Sum of 10, 20,30, 40  & 50 is " + obj.getSum(10,20,30,40,50));
		System.out.println("Sum of 10, 20,30, 40, 50  & 60 is " + obj.getSum(10,20,30,40,50,60));
		 int arr[ ] = {1,2,3,4,5,6,7,8,9,10};
		 System.out.print("Sum of 1st 10 natural nos is " + obj.getSum(arr));
	}
}
/*
Note - 
1. It is possible to pass additional parameters to this method. However the var length arg 
should be the trailing argument

2. A var length arg method can accept only 1 var length arg as it's parameter

3. It is possible to overload var length arg method. In this case, if the no & type of args of the
overloaded method matches, then that method is given the 1st preference

*/
