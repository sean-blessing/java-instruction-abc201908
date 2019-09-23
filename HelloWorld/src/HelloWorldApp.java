import java.util.Scanner;

public class HelloWorldApp {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while(choice.equalsIgnoreCase("y")) {
			int a = 5;
			double b = 5.5;
			System.out.println("total is"+(b+a));
	
			String name = "Sean";
			name = name + " N ";
			name += "Blessing";
			System.out.print(name);
			
			// StringBuilder example
			StringBuilder sb = new StringBuilder("Tricia");
			sb.append(" M ");
			sb.append("Good");
			System.out.println(sb);
			
			System.out.println("Enter first name: ");
			String firstName = sc.next();
			System.out.println(firstName);
			
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Age: "+age);
			
			while (age > 0) {
				System.out.println("age is "+age);
				age--;
			}
			System.out.println("Continue?");
			choice = sc.next();
		}		
		sc.close();
	}

}
