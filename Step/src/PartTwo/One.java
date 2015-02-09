package PartTwo;

import java.util.Random;

public class One {


	public static void main(String[] args) {
		
		
		int [] mas= new int [99];
		int sum=0,Col = 0;
		Random r = new Random();
		
		for (int i=0;i<mas.length;i++){
		mas[i]=r.nextInt(99);
		//System.out.print(mas[i]+" ");
		}
		
		for (int j=0;j<mas.length;j++){
			if (mas[j]%2==0){
				sum = sum + mas[j];
				Col++;
			}
		}
		System.out.println("Sum: "+sum +"\n" + "amoung: "+Col);

	}

}
