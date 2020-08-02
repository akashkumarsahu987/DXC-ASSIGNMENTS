import java.util.Scanner;
public class largestno{
public static void main(String[] args)
{
int  max;
Scanner sc = new Scanner(System.in);
System.out.print("elements");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("insert array elements");
for(int i = 0; i < n; i++)
{
arr[i] = sc.nextInt();
}
max = arr[0];
for(int i = 0; i < n; i++)
{
if(max < arr[i])
{
max = arr[i];
}
}
System.out.println("largest element:"+ max);
}
}