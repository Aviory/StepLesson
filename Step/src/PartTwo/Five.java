package PartTwo;

public class Five {

	public static void main(String[] args) {
		int n=705;
		int sum =0;
		for (int i=0; i<n;i++){
			
			sum+=(n%10);
			n/=10;
			
		}
		System.out.println(sum);

	}

}
