package String;

public class FunctionWithString {

	public static void main(String[] args) {
		String s= "new stile,then worldsss";
		int sum=0;
		int sumMax=0;
		int sumMin=s.length();
		for (int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c != ' ' || c!=','|| c=='.')
			{
				sum++;
			}
			if(c == ' ' || c==',' || c=='.')
			{
				if(sumMax<sum)
				{
					sumMax=sum;
				}
				if (sumMin>sum)
				{
					sumMin=sum;
				}
				sum=0;

			}
		}
		System.out.println(sumMax + " " + sumMin);

	}

}
