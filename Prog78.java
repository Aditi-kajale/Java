// an eg of split() to convert a String into an array of Strings on the basis of a delimiter
// Delimiter is nothing but a separator
class Prog78
{
	public static void main(String args[ ])
	{
		String name = "databyte computer trg. centre";
		// for eg in Networking appns, a lot of filenames are sent by the
		// client to the server. The server needs to read every filename 
		// separately. So if these filenames are separated by any character
		// like comma, ; or space, it becomes easier for server to access
		// each file name
		// Another eg can be a URL http://www.microsoft.com
		// 		          http://www.timesofindia.com
		// here the separator is . to get the name of host as arr[1]

		String arr[ ] = name.split(" ");  // split on the basis of space

		System.out.println("Words in name are");
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}