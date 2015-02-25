package String;

public class Alphabet {
	private static void English()
	{
		for (char i='a';i<='z';i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	private static void backEng()
	{
		for (char i='z';i>='a';i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	private static void Rus()
	{
		for (char i='à';i<='ÿ';i++)
		{
			System.out.print(i+" ");
		}		
		System.out.println();
	}
	private static void num()
	{
		for (char i='0';i<='9';i++)
		{
			System.out.print(i+" ");
		}		
		System.out.println();
	}

	public static void main(String[] args) {
		English();
		backEng();
		Rus();
		num();


	}

}
