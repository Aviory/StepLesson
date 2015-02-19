package Mas;
/*
 * Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
 */

public class Nine {

	public static int[] Bubble (int[] a){
		for (int j=0; j<a.length; j++)
		{
			for (int i=0;i<a.length-1; i++)
			{
				if (a[i]>a[i+1])
				{
					int b = a[i+1];
					a[i+1]= a[i];
					a[i]=b;
				}
			}
		}
		return a;
			
	}
	public static int[] Select (int[] a){
		for (int i=a.length-1;i>0;i--){
			int first = 0;
			for (int j=1;j<=i;j++){
				if (a[j]>a[first]){
					first = j;
				}
			}
			int temp = a[first];
			a[first] = a[i];
			a[i] = temp;
		}
			
		return a;
		
	}
	public static int[] Insert (int[] a){
		
		return a;
	}

	public static void main(String[] args)
	{
//пузырьком (Bubble)
		int myArray[] = {1,225,33,2,5,69,777};
		Bubble(myArray);
		Select(myArray);
		
		for (int i=0;i<myArray.length; i++){
			System.out.print(myArray[i]+" ");
		}
	}

}

