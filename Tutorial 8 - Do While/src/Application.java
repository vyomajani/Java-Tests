import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanny = new Scanner(System.in);
		
		int value = 0;
		do{
			System.out.println("Pick a number");
			value = scanny.nextInt();
		}
		while(value != 47);
		/*System.out.println("Enter a number between 1 and 100: ");
		in value = scanny.nextInt();
		while(value != 47){
			while(value > 47){
				System.out.println("Lower!");
				value = scanny.nextInt();}
			while(value < 47){
				System.out.println("Higher!");
				value = scanny.nextInt();}}*/
		System.out.println("Correct! 47!");
	}

}
