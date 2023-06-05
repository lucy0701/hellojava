package subject01;

import java.util.Scanner;

public class Application2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Calculator2 calculator2 = new Calculator2();
		
		calculator2.setNumber(a, b);
		calculator2.plus();
		calculator2.minus();
		calculator2.multiply();
		calculator2.divide();
	}
}
