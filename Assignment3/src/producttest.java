 import java.util.*;
public class producttest {
	public static void main(String ar[])
	{
		product ob1=new product("Dishwasher",40000.25,'K');
		product ob2=new product("Computer",37000.23);
		System.out.println(" Product Code : "+ob1.getProductCode());
		System.out.println(" Name : "+ob1.getProductName());
		System.out.println(" Price : "+ob1.getProductPrice());
		System.out.println(" Category : "+ob1.getCategoryCode());
		
		System.out.println(" Product Code : "+ob2.getProductCode());
		System.out.println(" Name : "+ob2.getProductName());
		System.out.println(" Price : "+ob2.getProductPrice());
		System.out.println(" Category : "+ob2.getCategoryCode());
	}
}