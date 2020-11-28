// validation of emailid - 2
class Prog82
{
	public static void main(String args[ ])
	{
		String emailid = args[0];

		// which char sets are valid/legal for emailid
		// letters, digit, @ _ .
		boolean flag = true;  // assumption that all the chars are legal

		// check every character from emailid
		for (int i=0;i<emailid.length();i++)
		{
			char ch = emailid.charAt(i);
			// rejection
			if (!Character.isLetter(ch) && !Character.isDigit(ch) && ch!='_' && ch!='.' && ch!='@')
			{
				flag = false;
				System.out.println("Bad char " + ch + " found in emailid");
			}
		}
		if (!flag)
			System.out.print("Invalid Emailid");
		else
			System.out.print("Emailid seems to be valid");
	}
}		
