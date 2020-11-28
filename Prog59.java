// to prove that both interfaces and abstract classes can inherit
interface X
{
	void methX();
}

// error, 1 interface cannot implement another interface bcoz an interface contains only a
// list of abstract methods
/* interface Y implements X
{
} */

interface Y extends X
{
	void methY();
}

abstract class A implements Y
{
	abstract void methA();
}	

abstract class B extends A
{
	// not compulsory, optional
	public void methY()
	{
		System.out.println("B's implementation of methY()");
	}
}

class C extends B
{
	// compulsory to implement methA() & methX()
	void methA()
	{
		System.out.println("C's implementation of methA()");
	}

	public void methX()
	{
		System.out.println("C's implementation of methX()");
	}
	// to avoid overriding the methY() multiple times, declare the method "final"
	// in class B
	public void methY()
	{
		super.methY();
		System.out.println("C's implementation of methY()");
	}
}

class Prog59
{
	public static void main(String args[ ])
	{
		C objc = new C();
		objc.methA();  // C's implementation
		objc.methX();  // C's implementation
		objc.methY();  // B's & C's implementation
	}
}
