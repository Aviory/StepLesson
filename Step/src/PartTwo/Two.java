package PartTwo;

public class Two {

	public static void main(String[] args) {
		boolean f=true;
		int n=11;
		if (n>2)
		for (int i=2;i<n;i++)
			if (n % i==0)
				f=false;
		
				
		System.out.println(f);

	}

}
