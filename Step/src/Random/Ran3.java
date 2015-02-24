package Random;

import java.util.Random;

public class Ran3 {
	private static Random generate = new Random();
	
	public static void main(String[] args) {
		for (int i=1;i<10;i++){
			int n = generate.nextInt(10);
			System.out.print(n+" ");
		}

	}

}
