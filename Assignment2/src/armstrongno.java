import java.util.Scanner;

public class armstrongno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int temp = n;
		sc.close();
		int sum = 0, x= 0;
		while(n>0)
		{
			x = n % 10;
			n = n / 10;
			sum += x * x * x;
		}
		if(temp == sum)
			System.out.println(temp + " is an Armstrong number.");
		else
			System.out.println(temp + " is not an Armstrong number.");
	}
}