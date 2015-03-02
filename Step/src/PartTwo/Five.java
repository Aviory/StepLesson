package PartTwo;

public class Five {
	public static int as (int n)
	{
		int sum =0;
		for (int i=0; i<n;i++){
			
			sum+=(n%10);
			n/=10;
			
			
		}
		return sum;
	}

	public static void main(String[] args) {
		int n;
		n=as(705);
		System.out.println(n);

	}

}
