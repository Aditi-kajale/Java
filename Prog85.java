// an eg of wrapper classes
class Prog85
{
	public static void main(String args[ ])
	{
		int i = 10;    // int pdt
		Integer obji = new Integer(i);  // int pdt --> Integer object
		int ival = obji.intValue();  // Integer obj --> int pdt
		// String representation of int value
		String istr = Integer.toString(ival); // int pdt --> String object
		// int value from String object
		int istrval = Integer.parseInt(istr);

		System.out.println("i contains " + i);
		System.out.println("obji contains " + obji);
		System.out.println("ival contains " + ival);
		System.out.println("istr contains " + istr);
		System.out.println("istrval contains " + istrval);

		// even though all vars contain 10, their memory representations
		// are different & hence they give different results in same situation
		System.out.println("istr + istr = " + (istr + istr));  // 1010
		System.out.println("istrval + istrval = " + (istrval + istrval)); // 20
	}
}