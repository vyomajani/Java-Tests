public class Application {
	public static void main(String[] args) {
		
		int val = 0;
		
		while(val < 4){
			System.out.println(val + " is less than 4!");
			if(val == 4){
				break;
			}
			val++;
		}
		if(val > 7){
			System.out.println("The first phrase is true");
		}
		else {if(val > 1){
			System.out.println("The second phrase is true");
		}
		else {
			System.out.println("None were true");
		}
		}
	}
}
