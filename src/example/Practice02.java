package example;

import java.util.Scanner;

public class Practice02 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int result = number1 + number2;
		
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);
		System.out.println("number1 + number2: " + result);
		System.out.println("number1 * number2: " + number1 * number2);
	}
}
