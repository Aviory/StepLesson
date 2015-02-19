package ConditionalStatements;

public class three {
	public static int as (int[] a){
		int sum=0;
		
		for (int i=0;i<a.length;i++)
			if (a[i]>0){
				sum = sum + a[i];
				
			}
		return sum;
		
	}

	public static void main(String[] args) {
		int [] mas= {2,-5,4};
		int a = as(mas);
		
		System.out.println(a);

	}

}
