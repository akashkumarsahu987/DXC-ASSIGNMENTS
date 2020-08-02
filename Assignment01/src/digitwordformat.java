import java.util.Scanner;
class digitwordformat
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	String names[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","so on"};
	System.out.println("number is" +num + "word is" + names[num]);
}
}
