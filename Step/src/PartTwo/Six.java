package PartTwo;

public class Six {

	

		public static void main(String[] args)
		{
			int a = 103;
			int total =0;
			
			while (a != 0)
			{
				total +=(a%10);
				total *= 10;
				a/=10;
			}
			
			System.out.println(total);
		}
		

	}
