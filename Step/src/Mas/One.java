package Mas;

public class One {
	public static int [] as(int []mas)
	{
		int min = mas[0],max=mas[0];
		
		for (int i=1;i<mas.length;i++){
			if(mas[i]<min)
			{
				min=mas[i];
			}
			if(mas[i]>max)
			{
				max=mas[i];
			}
		}
		int [] a={min, max};
		return a;
	}

	public static void main (String[] args) {


		int[] mas = {-31,2,-6,4,5,10,18,-11};


	}
}
