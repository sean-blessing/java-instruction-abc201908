import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calc App!");
		// initialize variables
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter miles:  ");
			double miles = sc.nextInt();
			
			System.out.println("Enter mph:  ");
			double mph = sc.nextInt();
			
			// calculate estimated drive time (Hours and minutes)
			int hours = (int)(miles / mph);
			double d = miles / mph;
			double dd = miles % mph;
			System.out.println(dd);
			int minutes = (int)((miles % mph));
			
			double hrs = miles / mph;
			int min = (int)(hrs * 60);
			int hrsAuthor = (int)(min/60);
			int minAuthor = min % 60;
			
			
			System.out.println("Estimated Travel Time");
			System.out.println("=====================");
			System.out.println("Hours: "+hours);
			System.out.println("Minutes: "+minutes);
			System.out.println("Hours2: "+hrsAuthor);
			System.out.println("Minutes2: "+minAuthor);
			
			System.out.println("Continue??");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("Bye!");

	}

}
