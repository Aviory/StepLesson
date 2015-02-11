package PartTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class three {

	public static void main(String[] args) throws IOException {
		System.out.println("input num: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int num =Integer.parseInt(input);
		int sum=0;
		for (int i=0;i<num;i++){
			sum ++;
		}
		System.out.println(sum);

	}

}
