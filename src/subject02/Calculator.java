package subject02;

import java.util.Scanner;

public class Calculator {
	
	Scanner sc;
	int numberA;
	int numberB;
	
	public void run() {
		this.sc = new Scanner(System.in);
		System.out.println("Scanner 초기화 완료!");
		action();
	}
	
	public void action() {
		
		while(true) {
			System.out.println("첫번째 숫자를 입력하세요");
			setNumberA();
			System.out.println("numberA: " + numberA);
			
			System.out.println("두번째 숫자를 입력하세요");
			setNumberB();
			System.out.println("numberB: " + numberB);
			
			System.out.println();
			System.out.println("------menu------");
			System.out.println("[1.plus] [2.minus]");

			int selection = sc.nextInt();
			while(selection != 1 && selection != 2) {
				System.out.println("1 또는 2만 입력 가능합니다.");
				selection = sc.nextInt();
			}
			showResult(selection);
			
		}
		
	}
	
	public void setNumberA() {
		this.numberA = sc.nextInt();
	}
	
	public void setNumberB() {
		this.numberB = sc.nextInt();
	}
	
	public void showResult(int selection) {
		if(selection == 1) {
			System.out.println("numberA + numberB = " + (numberA + numberB));
		} else {
			System.out.println("numberA - numberB = " + (numberA - numberB));
		}
	}

}
