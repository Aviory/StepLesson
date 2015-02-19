package ConditionalStatements;





public class Five {
	public static String aff(int bal){
		String b = null;
		if (bal<20){
			b="F";}
		
		if (bal>19 && bal<40){
			b="E";}
		
		if (bal>40 && bal<59){
			b="D";}
	
		if(bal>60 && bal<74){
			b="C";}
		if(bal>75 && bal<90){
			b="B";}
		if(bal>89){
			b="A";}
		
		return b;
		
	}

	public static void main(String[] args) {
		String c = aff(33);
		
		
		
	
		
		
		
		
		
		
		

	}

}
