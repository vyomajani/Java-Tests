
public class Application {
	public static void main(String[] args) {

		int[] val;
		val = new int[4];
		
		val[2] = 38;
		val[3] = 39;
		val[1] = 37;
		val[0] = 36;
		
		System.out.println(val[0]);
		System.out.println(val[1]);
		System.out.println(val[2]);
		System.out.println(val[3]);
		
		for(int j=0; j<val.length; j++){
			System.out.println(val[j]);
		}
	}

}
