package ConditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Five {

	public static void main(String[] args) throws IOException {
		
		System.out.println("input bal:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		 int bal=Integer.parseInt(input);
		
		
		if (bal>0 & bal<20)
			System.out.println("F");
		
		if (bal>19 & bal<40)
			System.out.println("E");
		
		if (bal>39 & bal<60)
			System.out.println("D");
		
		if(bal>59 & bal<75)
			System.out.println("C");
		if(bal>74 & bal<90)
			System.out.println("B");
		if(bal>89 & bal<100)
			System.out.println("A");
		if(bal <0 || bal>100)
			System.out.println("write bal 1-100");
		
		
		
		

	}

}
