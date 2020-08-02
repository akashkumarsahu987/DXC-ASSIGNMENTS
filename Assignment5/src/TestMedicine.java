import java.util.*;

public class TestMedicine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Medicine [] object=new Medicine[5];
		
		
		 Random randomGenerator = new Random();
	      
	   for(int i=0;i<=4;i++)
	   {
		   System.out.println("Enter Expiry Date");
		   object[i].date=sc.nextLine();
		   sc.nextLine();
		   System.out.println("Enter Price");
		   object[i].price=sc.nextDouble();   
	   }
	   for(int i=0;i<=4;i++)
	   {
		  object[i].getDetails();
		  int randomInt = randomGenerator.nextInt(2) + 1;
		  if(randomInt==1)
		  {
			 Syrup object1 = new Syrup();
			 object1.displaylabel();
		  }
		  if(randomInt==2)
		  {
			 Tablet object1 = new Tablet();
			 object1.displaylabel();
		  }
		  if(randomInt==3)
		  {
			 Oinment object1 = new Oinment();
			 object1.displaylabel();
		  }
			  
	   }
	    

	}

}
