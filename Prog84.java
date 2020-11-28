// An eg of imp methods of StringBuffer class
class Prog84
{
	public static void main(String args[ ])
	{
		StringBuffer s = new StringBuffer("Welcome Java");

		System.out.println("Initially s contains " + s);

		s.insert(8,"to ");

		System.out.println("After insert(), s contains " + s);

		s.setCharAt(8,'T');

		System.out.println("After setCharAt(), s contains " + s);

		s.append(" Programming");

		System.out.println("After append(), s contains " + s);

		s.reverse();
		
		System.out.println("After reverse(), s contains " + s);

		String s1 = s.toString();   // toString() returns the String representation
				// (immutable version) of StringBuffer 
				// (mutable version)

		System.out.print("s1 contains " + s1);

	}
}
