import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		System.out.println("Enter a command for Parzival");

		String t = "do";

		do {switch (t = a.nextLine()) {
		case "move forward":
			System.out.println("Parzival will move forward");
			break;
		case "turn left":
			System.out.println("Parzival will turn left");
			break;
		case "turn right":
			System.out.println("Parzival will turn right");
			break;

		default:
			System.out.println("Command not recognized");
		} }
		while(t != "win!");
		}
	}
