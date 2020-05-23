import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		//Create scanner object
		Scanner nebula = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("Enter a number:");
		
		//Wait for user to enter text
		double space = nebula.nextDouble();
		
		//Output text accordingly
		System.out.println("You input " + space);
	}

}
