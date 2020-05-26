class Person{
	String name;
	int age;

	int retirement() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	String get() {
		return name;
	}
}

public class Application {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "Michael";
		p1.age = 40;
		
		String michael = p1.get();
		int yearsleft = p1.retirement();
		
		Person p2 = new Person();
		
		p2.name = "Dwight";
		p2.age = 38;
		
		String dwight = p2.get();
		int years = p2.retirement();
		
		System.out.println("That's " + michael);
		System.out.println(p1.name + " has " + yearsleft + " years left to retirement");
		System.out.println("And that's " + dwight);
		System.out.println(p2.name + " has " + years + " years left to retirement");
	}

}
