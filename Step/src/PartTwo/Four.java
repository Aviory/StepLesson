package PartTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Four {
	
	public static int fact(int n){
		return n<2?1:n*fact(n-1);
		
	}

	public static void main(String[] args) throws IOException {
//		System.out.println("input num:");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input =br.readLine();
//		int n=Integer.parseInt(input);
		
		int n = fact(3);
		
		System.out.println(n);
				
		}

	}


