class Robot {
	public void talk(String words){
		System.out.println(words);
	}
	public void tall (int height) {
			System.out.println("I am " + height + " inches tall.");
		}
	public void move (String direction, double distance) {
		System.out.println("I move my cat " + distance + " meters to the " + direction);
	}
	}

public class Application {

	public static void main(String[] args) {

		String compass = "south";
		Robot angela = new Robot();
		angela.talk("Hello Dwight.");
		angela.tall(37);
		angela.move(compass, 35.6);
	}

}
