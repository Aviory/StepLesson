package ConditionalStatements;

public class Four {
	public static int total (int a, int b, int c)
	{
		int sum=a*b*c>a+b+c?(a*b*c)+3:a+b+c+3;
		return sum;
	}

	public static void main(String[] args) {
		int v = total(4, 5, -1);
		
		
		System.out.println(v);
	}

}
