// accept some data from user & display it char by char till char 'q' is not encountered
import java.io.*;    // to manage streams, we have to import this package

class Prog86
{
	public static void main(String args[ ]) throws IOException
	{
		// reserve some memory (buffer) to accept data from user
		BufferedInputStream bin = new BufferedInputStream(System.in);
		// the buffer is connected to KB
		System.out.println("Enter some text");
		while (true)  // we are unaware as to how much text the user is
				// going to enter
		{
			int no = bin.read();  // read() returns the ascii code of
					// char accepted from user
			char ch = (char) no;  // typecasting
			if (ch == 'q' || ch == 'Q')
				break;

			System.out.print(ch);
		}
		bin.close();  // to free the memory
	}
}
			