package ConditionalStatements;

public class Two {

	public static void main(String[] args) {
		
		int x=f11(-2,3);
		System.out.println(x);
		
		
	}
	public static int f11(int x, int y){
		int c = 0;
		 
		if (x<0 && y>0){
			c=1;}
		if (x>0 && y>0){
			c=2;}
		if (x>0 && y<0){
			c=3;}
		if (x<0 &&y<0){
			c=4;}
		return c;
	}
	

}
