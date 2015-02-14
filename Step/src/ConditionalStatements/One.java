package ConditionalStatements;

public class One {
	public static int f11 (int a, int b){
		int c;
		
		if (a%2==0)
			c=a*b;
		else
			c=a+b;
		return c;
		
	}

	public static void main(String[] args) {
		int c1;
		c1=f11(2,5);
		
		System.out.println(c1);
	}

}
