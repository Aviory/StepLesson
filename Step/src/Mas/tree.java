package Mas;

public class tree {

	
	public static void main(String[] args) {
		int[] mas = {-31,2,-6,4,5,10,18,-11};
		int min = mas[0],max=mas[0];
		int imax = 0,imin = 0;
		for (int i=1;i<mas.length;i++){
			if(mas[i]<min){
				min=mas[i];
			    imin = i;}
			if(mas[i]>max){
				max=mas[i];
			    imax=i;}
		} 
		System.out.println(imin+" "+min+ " "+imax+" "+max);

	}

}
