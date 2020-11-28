// a prog to accept a filename from user & display it's contents
import java.io.*;

class Prog88
{
	public static void main(String args[ ]) throws IOException
	{
		// reserve buffer to accept the filename from user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the filename :- ");
		String filename = br.readLine();
		// create i/p stream from filecontents
		// i/p streams can be created only from existing files
		// if file doesn't exist, it throws "FileNotFoundException" (runtime)
		try
		{
			FileInputStream fin = new FileInputStream(filename);
			System.out.println("Contents of file are");
			while (true)  // file length/content not known
			{
				int no = fin.read();  // read() returns the unicode
						// of char read from file
				if (no == -1)   // -1 means End of File indicator
					    // unicode 0 to 65536
					break;

				System.out.print((char)no);
			}
			fin.close();  // fin is declared in inner scope		
		}
		catch (FileNotFoundException e)
		{
			System.out.print("File " + filename + " doesn't exist");
		}
		br.close();  // br is in outer scope (main)
	}
}