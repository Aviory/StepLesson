package Mas;

public class Five {
	public static int as(int []mas)
	{
		int sum=0;
		for (int i=0;i<mas.length;i++){
			if (i%2!=0){
			 sum += mas[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int mas []= {5,6,2,6,4,2};
		int n=as(mas);
		System.out.println(n);
		

	}

}
