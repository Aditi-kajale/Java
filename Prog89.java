// accept a source and target filenames from user & copy the contents of source into
// target
import java.io.*;

class Prog89
{
	public static void main(String args[ ]) throws IOException
	{
		// A buffer can store millions of lines. So the store 2 filenames,
		// we don't require 2 buffer objects.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter source filename :- ");
		String src = br.readLine(); // flush the buffer using ENTER key
		System.out.print("Enter target filename :- ");
		String tgt = br.readLine();
		try
		{
			// create i/p stream from src & o/p stream from tgt filenames
			FileInputStream fin = new FileInputStream(src);
			FileOutputStream fout = new FileOutputStream(tgt,true);
			// the 2nd option is "boolean append". If set to false, it
			// will overwrite the target file (if it exists) otherwise will
			// create a new one. Setting it to true, will append the 
			// contents of src into tgt.
			while (true)
			{
				int no = fin.read();
				if (no == -1)
					break;

				// write the char to target file
				fout.write((char)no);  // typecast the unicode to
					// equivalent char & then write
			}
			fin.close();
			fout.close();
			System.out.print("File contents copied successfully");
		}
		catch (FileNotFoundException e)
		{
			System.out.print("Source file " + src + " not found");
		}
		br.close();
	}
}

			










