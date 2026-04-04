package javaprograms;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter value 1");
		int value1= s1.nextInt();
		System.out.println("Enter value 2");
		int value2= s1.nextInt();
		int output= value1*value2;
		s1.close();
		System.out.println("Output "+output);
		
		
		
		

	}

}
