package Random;

import java.util.Random;

public class Ran5 {

	private static Random generate = new Random();
	private static final int min = -10;
	private static final int max = 10;
	
	private static int ran (int n, int x){
		int a =generate.nextInt((x-n)+1)+n;
		return a;
		
	}
	public static void main(String[] args) {
		for (int i=1;i<10;i++){
			int n = ran(min, max);
			System.out.print(n+" ");
		}

	}

}
