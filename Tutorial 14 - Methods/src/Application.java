
class Person {
	String name;
	int age;
	
	void meet() {
		System.out.println("Hi there, I'm " + name + ",");
	}
	void greet() {
		System.out.println("Hello, I'm " + name + ",");
	}
}

public class Application {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Jim";
		p1.age = 38;
		p1.meet();
		
		System.out.println("How are you?");
		
		Person p2 = new Person();
		p2.name = "Pam";
		p2.age = 36;
		p2.greet();
		
		System.out.println("I'm fine, thanks!");
	}

}
