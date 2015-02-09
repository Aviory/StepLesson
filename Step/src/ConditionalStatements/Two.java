package ConditionalStatements;

public class Two {

	public static void main(String[] args) {
		int x=5,y=-1;
		
		if (x<0 & y>0)
			System.out.println("One");
		if (x>0 & y>0)
			System.out.println("Two");
		if (x>0 & y<0)
			System.out.println("3");
		else 
			System.out.println("4");

	}

}
