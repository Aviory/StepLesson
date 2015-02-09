package ConditionalStatements;

public class three {

	public static void main(String[] args) {
		int [] mas= {2,-5,4};
		int sum=0;
		
		for (int i=0;i<mas.length;i++)
			if (mas[i]>0){
				sum = sum + mas[i];
				
			}
		System.out.println(sum);

	}

}
