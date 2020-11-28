// an eg of indexOf() which returns the position of a character in a String
// if character is not found, it returns -1
class Prog80
{
	public static void main(String args[ ])
	{
		String name = "databyte";

		int pos_1a = name.indexOf('a');   // 1, 2nd parameter if not given,
				// then the search begins from 0th position
		int pos_2a = name.indexOf('a',pos_1a+1);  // 3
		int pos_3a = name.indexOf('a',pos_2a+1);  // -1

		System.out.println("Position of 1st a in name is " + pos_1a);
		System.out.println("Position of 2nd a in name is " + pos_2a);
		System.out.println("Position of 3rd a in name is " + pos_3a);
	}
}
	