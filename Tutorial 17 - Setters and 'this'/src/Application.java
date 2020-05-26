class Character {
	
	String name;
	private int age;
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}


public class Application {

	public static void main(String[] args) {

		Character Jake = new Character();
		Jake.name = "Jake";
		//Jake.age = 31;
		
		Jake.setAge(32);
		
		System.out.println(Jake.getName());
	}

}
