// define a class "Shape" to define 2 D shapes with suitable attributes. Define a method to
// calculate area of any given shape
import java.util.Scanner;
abstract class Shape
{
	protected int dim1, dim2;  // protected bcoz these attributes will be reqd
			// by the sub classes to calculate their respective areas

	public Shape(int x,int y)
	{
		dim1 = x;
		dim2 = y;
	}

	// the method getArea() has to be abstract bcoz the formula to calculate area
	// of different shapes is different
	public abstract double getArea();
}

class Rectangle extends Shape
{
	public Rectangle(int l,int b)
	{
		// super();  // inserted automatically by compiler. We need to avoid this
			// bcoz there is no default constructor in super class Shape.
		super(l,b);  // imp & also avoids redundancy
	}

	public double getArea()
	{
		System.out.print("Object - Rectangle, Length - " + dim1 + ", Breadth - " + dim2 + ", Area = ");
		return dim1 * dim2;
	}
}

class Triangle extends Shape
{
	public Triangle(int b,int ht)
	{
		super(b,ht);
	}

	public double getArea()
	{
		System.out.print("Object - Triangle, Base - " + dim1 + ", Height - " + dim2 + ", Area = ");
		return 0.5 * dim1 * dim2;
	}
}


class Prog57
{
	public static void main(String args[ ])
	{
		// accept "n" objects of Rectangle & Triangle & display their areas
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of shapes :- ");
		int nos = sc.nextInt();
		Shape arr[ ] = new Shape[nos];  // OK bcoz "new" is used to create an
				// array of references to Rect or Tri objects		
				// Here we are not creating an array of super class
				// objects
		int i, dim1, dim2;
		char type;
		for (i=0;i<nos;i++)
		{
			System.out.print("Enter r/R for Rect or t/T for Tri :- ");
			type = sc.next().charAt(0);
			if (type == 'r' || type == 'R')
			{
				System.out.print("Enter length :- ");
				dim1 = sc.nextInt();
				System.out.print("Enter breadth :- ");
				dim2 =sc.nextInt();
				arr[i] = new Rectangle(dim1,dim2);
			}	
			else
			{
				System.out.print("Enter base :- ");
				dim1 = sc.nextInt();
				System.out.print("Enter height :- ");
				dim2 = sc.nextInt();
				arr[i] = new Triangle(dim1,dim2);
			}
		}

		System.out.println("Objects and their areas are");
		for (i=0;i<nos;i++)
			System.out.println(arr[i].getArea());  // dynamic method dispatch
	}
}









