class Brook{
	private String name;
	private int salsa;
	
	public Brook(){
		
		System.out.println("My name is Raymond J. Holt.");
		
		name = "Raymond";
	}
	public Brook(String text) {
		
		System.out.println("I am captain of this precinct.");
	}
	
	public Brook (String name, int salsa) {
		this(47);
		System.out.println("Jake, Rosa, and Charles.");
		this.name = name;
		this.salsa = salsa;
	}
	public Brook (int pjs) {
		
		System.out.println("These are my detectives:");
	}
}

public class Application {

	public static void main(String[] args) {
		
		Brook holt = new Brook();
		
		Brook captain = new Brook("Hello");
		
		Brook detective = new Brook("Hi", 36);

	}

}
