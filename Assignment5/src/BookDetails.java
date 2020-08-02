import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		Book object=new Book();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book No :");
		object.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Title :");
		object.setTitle(sc.nextLine());
		System.out.println("Enter Author");
		object.setAuthor(sc.nextLine());
		System.out.println("Enter Price");
		object.setPrice(sc.nextFloat());
		
		System.out.println("Book No :"+object.getBookNo());
		System.out.println("Title : "+object.getTitle());
		System.out.println("Author :"+object.getAuthor());
		System.out.println("Price :"+object.getPrice());
		Engineeringbook object1=new Engineeringbook();
		
		System.out.println("Enter Book No :");
		object1.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Book Category :");
		object1.setCategory(sc.nextLine());
		System.out.println("Enter Title :");
		object1.setTitle(sc.nextLine());
		System.out.println("Enter Author");
		object1.setAuthor(sc.nextLine());
		System.out.println("Enter Price");
		object1.setPrice(sc.nextFloat());
		System.out.println("Book No :"+object1.getBookNo());
		System.out.println("Book Category :"+object1.getCategory());
		System.out.println("Title : "+object1.getTitle());
		System.out.println("Author :"+object1.getAuthor());
		System.out.println("Price :"+object1.getPrice());
	}

}