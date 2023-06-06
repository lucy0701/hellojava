package subject03;

import java.util.Scanner;
// 'BankAccount' : 계좌 번호, 소유자 이름, 현재 잔액 등 필드
// 잔액을 입금하고, 출금하고, 현재 잔액을 출력하는 메소드 구현

public class BankAccount {
	
	private Scanner sc;
	private int deposit; // 입금
	private int amount; // 출금
	private int balance; // 잔액
	private int selection;
	Bank bank = new Bank();
	
	public void run() {
		this.sc = new Scanner(System.in);
		System.out.println("  ****** 메뉴를 선택 하세요.******  ");
		System.out.println("[1.입금] [2.출금] [3.잔액]");
		selection = sc.nextInt();
		while (selection != 1 && selection != 2 && selection != 3) {
			System.out.println("다시 고르세요.");
			selection = sc.nextInt();
		}
		if (selection == 1) {
			deposit();
		} else if (selection == 2) {
			withdraw();
		} else {
			balanceInquiry();
		}
	}
		
	public void deposit() {
		
		System.out.println("입금 금액을 입력");
		deposit = sc.nextInt();
		System.out.println("입금 : " + deposit + "원 맞음?");
		System.out.println("[1.Yes] [2.No]");
		selection = sc.nextInt();
		
		wrongChoice();

		if (selection == 1) {
			if (deposit >= 0) {
				balance += deposit;
				System.out.println(deposit + "원 입금 완료. 잔액 : " + balance + "원");
				gap();
			} else {
				System.out.println("0원 이상 입금하세영");
				gap();
			}
		} else {
			cancellation();
		}
		run();
		}
		
	public void 	withdraw() {
		System.out.println("출금 금액을 입력");
		amount = sc.nextInt();
		System.out.println("출금 : " + amount + "원 맞음?");
		System.out.println("[1.Yes] [2.No]");
		selection = sc.nextInt();

		wrongChoice();

		if (selection == 1) {
			while (balance >= 0) {
				System.out.println("0원 이상 입력하세요.");
				break;
			}
			if (balance >= amount) {
				balance -= amount;
				System.out.println(amount + "원을 출금 완료. 잔액: " + balance + "원");
			} else {
				System.out.println("금액이 이상함.");
				gap();
			}
		} else {
			cancellation();
		}
		run();
		}
	
	public void balanceInquiry() {
		if ( balance >= 0) {
			System.out.println("너의 잔액은 " + balance + "원 이다.");
			gap();
			run();
		} else {
			System.out.println("입력이 잘 못됨");
			gap();
			run();
		}
	}

	public void wrongChoice() {
		while(selection != 1 && selection != 2) {
			System.out.println("1,2 중에 고르라고...");
			selection = sc.nextInt();
			gap();
		}
	}
	public void cancellation() {
		System.out.println("취소 됨. ㅂㅂ");
		gap();
	}
	public void gap() {
		System.out.println();
	}

}
