package PartTwo;

import java.util.Random;

public class One {


	public static void main(String[] args) {


		int [] mas= new int [99];
		int [] a=as(mas);
		
	}
	public static int[] as(int[] mas)
	{
		int sum=0;
		int Col = 0;
		

		for (int i=0;i<mas.length;i++)
		{
			mas[i]=i;
			
		}

		for (int j=0;j<mas.length;j++)
		{
			if (mas[j]%2==0){
				sum = sum + mas[j];
				Col++;
			}
		}
		int []a={sum, Col};
		return a;
	}
	

}


