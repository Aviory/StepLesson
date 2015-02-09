package ConditionalStatements;

public class Four {

	public static void main(String[] args) {
		int a=2,b=-4,c=8, sum;
		sum=a*b*c>a+b+c?(a*b*c)+3:a+b+c+3;
		System.out.println(sum);
	}

}
