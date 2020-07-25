import java.io.*;
public class Example
{
	public static void main(String []args) throws IOException
	{
		File fobj=new File("./csetuts.txt");
		fobj.createNewFile();
		System.out.println(fobj.exists()+":csetuts.txt");
		System.out.println(fobj.length()+": Size of csetuts");

	}
}