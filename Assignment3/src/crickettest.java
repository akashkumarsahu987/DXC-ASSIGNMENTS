import java.util.*;

public class crickettest {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the target Runs");
		int targetRuns=sc.nextInt();
		System.out.println("enter the current Over");
		int currentOver=sc.nextInt();
		System.out.println("Enter the current Score:");
		int currentScore=sc.nextInt();
		Onedcricket obj=new Onedcricket(targetRuns);
		obj.setCurrentOver(currentOver);
		obj.setCurrentScore(currentScore);
		System.out.println("Current Run rate:");
		System.out.println(obj.calcCurrentRunrate(currentScore, currentOver));
		System.out.println("Required Run rate:");
		System.out.println(obj.calcReqdRunrate((targetRuns-currentScore),(obj.getMaxOvers()-currentOver)));
		

	}

}
