public class TestCustomer {
	public static void main(String ar[])
	{
	Customer object=new Customer();
		object.setCustomerName("John");
		object.resendialAddress.setAddressLine("Ist Main HSR Layout");
		object.resendialAddress.setCity("Bangalore");
		System.out.println(object.getCustomerDetails());
		
		
		Customer object1=new Customer("John","Ist Main HSR Layout","Bangalore");
		System.out.println(object1.getCustomerDetails());
		
		
	}
}