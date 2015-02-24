package Random;

import java.util.Random;

public class Ran2 {
	private static Random generate = new Random();

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++)
		{
		int n = generate.nextInt(9);
		System.out.print(n+" ");
		}


	}

}
