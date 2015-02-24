package Random;

import java.util.Random;

public class Ran6 {

	private static Random generate = new Random();
	private static final int min = -10;
	private static final int max = 35;
	private static final int max1 = 15;
	private static final int min1 = 3;
	private static int [] array = new int[ran(min1, max1)];

	private static int ran (int n, int x){
		int a =generate.nextInt((x-n)+1)+n;
		return a;
	}
	private void print(int a, int b){
		for (int i=0;i<array.length;i++){
			array[i] = ran(min, max);
		}
		
	}
	public static void main(String[] args) {
		print()
		for (int i=1;i<print.length;i++){
			System.out.print(array[i]+" ");
		}

	}

}
