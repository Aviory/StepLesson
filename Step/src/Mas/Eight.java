package Mas;
/*
 * ѕомен€ть местами первую и вторую половину массива, например, дл€ массива 1 2 3
 * результат 3 4 1 2
 */
public class Eight
{

	public static void main(String[] args) 
	{
		
	
		int myArray[] = {1,22,33,48,55,69,777};
		int a = myArray.length/2;
		int y=a+myArray.length %2;
		int x=0;
		
		for (int i=0;i<a; i++)
		{
			
		x=myArray[i];
		myArray[i]=myArray[y+i];
		myArray[y+i]=x;
				
		}
		for (int j=0;j<myArray.length; j++)
		{
			System.out.print(myArray[j]+" ");
		}
	
		
	}
	
}


