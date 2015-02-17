package Mas;

public class Five {

	public static void main(String[] args) {
		int mas []= {5,6,2,6,4,2};
		int sum=0;
		for (int i=0;i<mas.length;i++){
			if (i%2!=0){
			 sum += mas[i];
			}
		}
		System.out.println(sum);

	}

}
