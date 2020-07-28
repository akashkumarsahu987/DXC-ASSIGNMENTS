import java.util.Scanner;
class ncrsries
{
	public static void main(String args[])
	{
	int fact=1,fact1=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	System.out.println("enter r value");
	int r=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	fact=fact*i;
	}

	System.out.println("fact "+fact);
	for(int j=1;j<=(n-r);j++)
	{
	fact1=fact1*j;
	}
	System.out.println("fact1 "+fact1);
	System.out.println(n+"c"+r+" = "+(fact/(fact1*r))); 
	}
}