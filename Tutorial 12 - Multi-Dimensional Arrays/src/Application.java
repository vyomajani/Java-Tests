public class Application {
	public static void main(String[] args) {

		//1-dimensional array
		int[] val = {3, 5, 2};
		
		System.out.println(val[0]);
		
		//2-dimensional array
		int[][] mul = {
				{4, 7, 39, 42},
				{0, 2, 5},
				{9464}
		};
		System.out.println(mul[2][0] - val[0]);
		
		String[][] tex = new String[3][2];
		
		System.out.println(tex[2][1]);
		
		tex[1][0] = "blasphemy";
		
		System.out.println(tex[1][0]);
		
		for(int i=0; i<mul.length; i++) {
			for(int k=0; k < mul[i].length; k++) {
				System.out.print(mul[i][k] + "\t");
			}
			System.out.println();
		}
		String[][] wo = new String [2][];
		
		wo[1] = new String [2];
		
		wo[1][0] = "'ello there mate!";
		
		System.out.println(wo[1][0]);
}
}