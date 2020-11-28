// accept a filename from user & display it's contents alongwith the no of lines, words &
// vowels.
import java.io.*;

class Prog91
{
	public static void main(String args[ ]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the filename :- ");
		String filename = br.readLine();
		try
		{
			// shortcut - get the filecontents in BufferedReader bcoz
			// it contains readLine() which is very efficient
			br = new BufferedReader(new FileReader(filename));
			// 1. use the BufferedReader already declared in outer scope
			// 2. Do not use FileInputStream bcoz it generates byte 
			// stream which has to be converted to char stream
			int nol = 0, now = 0, nov = 0;
			while (true)
			{
				String line = br.readLine();
				if (line == null)   // EOF
					break;			

				System.out.println(line);
				nol++;
				now += countWords(line);
				nov += countVowels(line);
			}
			System.out.println("No of lines are " + nol);
			System.out.println("No of words are " + now);
			System.out.println("No of vowels are " + nov);
		}
		catch (FileNotFoundException e)
		{
			System.out.print("File " + filename + " not found");
		}
		br.close();
	}

	static int countWords(String line)
	{
		int now = 1;   // line will contain atleast 1 word
		// count the no of spaces in line
		// each space indicates the start of next word
		for (int i=0;i<line.length();i++)
		{
			if (line.charAt(i) == ' ')  // space
				now++;
		}
		return now;
	}

	static int countVowels(String line)
	{
		int nov = 0;

		for (int i=0;i<line.length();i++)
		{
			char ch = line.charAt(i);
			switch (ch)
			{
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					nov++;
			}
		}
		return nov;
	}
}
	



