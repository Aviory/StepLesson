package function;

public class One {
	public static String Day(int a){
		
		String b;
		switch(a){
		case 1:
			b="Sunday";
		break;
		case 2:
			b="Monday";
		break;
		case 3:
			b="Tursday";
		break;
		case 4:
			b="Wednesday";
		break;
		case 5:
			b="Friday";
		break;
		case 6:
			b="Saturday";
		break;
		case 7:
			b="Sunday";
		break;
		default:
			b="intcorrect day ";
		
		
		}
		return b;
	}

	public static void main(String[] args) {
		String n = Day(4);
		
		
		
		
		
		System.out.println(n);
		}
		
			

	

}
