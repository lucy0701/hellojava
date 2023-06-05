package subject01;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 변수 선언
		
		int a = sc.nextInt();
		int b = sc.nextInt();
//		System.out.println("b는" + b + "입니다.");
		
		// 스캐너를 호출한 방식처럼 Calculator 클래스를 객체로 만들어봐
		Calculator calculator = new Calculator(a, b);
//		Calculator calculator = new Calculator();
//		calculator.setNumberA(a);
//		calculator.setNumberB(b);
		calculator.setField(a, b);
//		calculator.plus();
		calculator.printResult();


	}
}
