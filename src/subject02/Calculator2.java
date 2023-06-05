package subject02;

import java.util.Scanner;

public class Calculator2 {

	Scanner sc;
	private int numberA;
	private int numberB;
	
	public void run() {
		this.sc = new Scanner(System.in);
		action();
	}
	
	public void action() {

		while(true) {
			System.out.println("첫번째 숫자 입력");
			this.numberA = sc.nextInt();
			System.out.println("두번째 숫자 입력");
			this.numberB = sc.nextInt();
			System.out.println("[1.PLUS] [2.MINUS] [3.MULTIPY] [4.DIVID]");
			int selection = sc.nextInt();
			while(selection != 1 && selection != 2 && selection != 3 && selection != 4) {
				System.out.println("없는 번호 입니다.");
				selection = sc.nextInt();
			}
			if(selection == 1) {
				System.out.println(numberA + " + " + numberB + " = " + (numberA + numberB));
			} else if (selection == 2) {
				System.out.println(numberA + " - " + numberB + " = " + (numberA - numberB));
			} else if (selection == 3) {
				System.out.println(numberA + " * " + numberB + " = " + (numberA * numberB));
			} else {
				double result = (double) numberA / numberB;
				System.out.println(numberA + " / " + numberB + " = " + result);
			}
			System.out.println("---------------------");
		}
	}

}
