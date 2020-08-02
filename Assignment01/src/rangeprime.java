import java.util.*;
class rangeprime
{
	public static void main(String args[])
	{
		System.out.println("Prime numbers that are there betwen 2 to 200");
		for(int n=2;n<=200;n++)
		{
			int count=0;
			
			for(int i=2;i<n-1;i++)
			{
				if(n%i==0)
				{

				count++;
				}
			}
		
			if(count==0)
			{	
			System.out.print(n+" ");
			}
		}
	}
}