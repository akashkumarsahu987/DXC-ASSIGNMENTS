import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
	int m,res=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	while(n!=0)
	{
	m=n%10;
	res=res*10+m;
	n=n/10;
	}
	System.out.println("number is:"+res);
}
}
