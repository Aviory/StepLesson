package Random;

import java.util.Random;

public class Ran1 {
		private static Random generate = new Random();

		public static void main(String[] args) {
			int n = generate.nextInt(9);
			System.out.println(n);

	}

}
