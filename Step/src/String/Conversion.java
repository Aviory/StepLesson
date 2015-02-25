package String;

public class Conversion {
	private static void intToStr()
	{
		int n=555;
		String s = Integer.toString(n);
		s+=1;
		System.out.println(s);
	}
	private static void material()
	{
		double n=555.02;
		String s = Double.toString(n);
		s+=1;
		System.out.println(s);
	}
	private static void strToInt()
	{
		String s="151";
		int n = Integer.parseInt(s);
		n+=1;
		System.out.println(n);
	}
	private static void strToDouble()
	{
		String s="151.02";
		double n = Double.parseDouble(s);
		n+=1;
		System.out.println(n);
	}

	public static void main(String[] args) {
		intToStr();
		material();
		strToInt();
		strToDouble();

	}

}
