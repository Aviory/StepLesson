package PartTwo;

public class Two {

	public static void main(String[] args) {
		

	}
	public static boolean bul(int n){
		boolean f=true;
		if (n>2)
		for (int i=2;i<n;i++)
			if (n % i==0)
				f=false;
		return f;
	}

}
