// accept some data from user & display it line by line till word "stop" is not encountered
// in the line
import java.io.*;

class Prog87
{
	public static void main(String args[ ]) throws IOException
	{
		// here we will use BufferedReader class bcoz it contains the
		// readLine() which makes the prog more efficient
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // System.in generates byte stream, whereas BufferedReader is char stream
	// class & hence the InputStreamReader object is used to facilitate the conversion

		System.out.println("Enter some text");
		while (true)
		{
			String line = br.readLine();  // will execute when the user
					// presses ENTER key
			if (line.contains("stop"))
				break;

			System.out.println(line);
		}
		br.close();
	}
}
			