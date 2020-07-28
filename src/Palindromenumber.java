import java.util.Scanner;
class Palindromenumer
{
	public static void main(String args[])
	{
	int temp,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	int n=sc.nextInt();
	temp=n;
	while(n>0)
	{
	int r;
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
	}
	if(temp==sum)	
	System.out.println(" no is palindrome");
	else
	System.out.println("is not a palindrome");
}
}