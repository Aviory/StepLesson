package Mas;

public class Seven {

	public static void main(String[] args) {
		int myArray[] = {1,22,33,48,55,69,777,888,43,12};
		int col =0;
		
		for (int i=0;i<myArray.length;i++){
			if(myArray[i]%2!=0){
				col++;
			}
		}
		System.out.println(col);

	}

}
