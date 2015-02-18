package Mas;

public class Nine {

	public static void main(String[] args) {
		int myArray[] = {1,225,33,2,5,69,777};
		
		for (int j=0; j<myArray.length; j++)
		{
			
			
		for (int i=0;i<myArray.length-1; i++)
		{
			if (myArray[i]>myArray[i+1])
			{
				int a = myArray[i+1];
				myArray[i+1]= myArray[i];
				myArray[i]=a;
			}
			
				
		}
		System.out.print(myArray[j]+" ");
		}
		
	}

}
