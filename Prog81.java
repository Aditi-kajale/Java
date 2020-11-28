// validation of emailid - 1
class Prog81
{
   public static void main(String args[ ])
   {
         String emailid = args[0];
         int pos_1at = emailid.indexOf('@');
         if (pos_1at == -1)
	System.out.print("Missing @, Invalid Emailid");
         else
         {
	// look for multiple @s
	int pos_2at = emailid.indexOf('@',pos_1at+1);
	if (pos_2at != -1)  // there is one more @ after 1st @
		System.out.print("Multiple @s, Invalid Emailid");
	else
	{
		if (pos_1at == 0)
		   System.out.print("Missing Username, Invalid Emailid");
		else
		{
		      int pos_dot = emailid.indexOf('.',pos_1at+1);
		      if (pos_dot == pos_1at + 1)
			System.out.print("Missing server name, Invalid Emailid");
		      else
		      {
			if (pos_dot == -1)
			     System.out.print("Missing domain, Invalid Emailid");
			else
			{
			     // for domain to be valid, it must contain min 2 chars
			     int len = emailid.substring(pos_dot + 1).length();
			     
			     if (len < 2)   // 0 or 1
				System.out.print("Invalid Domain");
			     else			
		                     	System.out.print("Emailid seems to be valid");
			}
		       }
		}
	}
         }
    }
}