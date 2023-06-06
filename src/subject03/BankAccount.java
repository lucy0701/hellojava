package subject03;

import java.util.Scanner;
// 'BankAccount' : 계좌 번호, 소유자 이름, 현재 잔액 등 필드
// 잔액을 입금하고, 출금하고, 현재 잔액을 출력하는 메소드 구현

public class BankAccount {
	
	private Scanner sc;
	private int deposit; // 입금
	private int withdraw; // 출금
	private int balance; // 잔액
	private int selection;
	Bank bank = new Bank();
	
	public void run() {
		this.sc = new Scanner(System.in);
		System.out.println("  ****** 메뉴를 선택 하세요.******  ");
		System.out.println("[1.입금] [2.출금] [3.잔액]");
		menuList();
	}
	public void menuList() {
		selection = sc.nextInt();
		
		while (selection != 1 && selection != 2 && selection != 3) {
			System.out.println("잘 못 입력");
			selection = sc.nextInt();
		}
		if (selection == 1) {
			System.out.println("입금 금액을 입력");
			deposit = sc.nextInt();
			System.out.println("입금 : " + deposit + "원 맞음?");
			System.out.println("[1.Yes] [2.No]");
			selection = sc.nextInt();
			
			while(selection != 1 && selection != 2) {
				System.out.println("1,2 중에 고르라고...");
				selection = sc.nextInt();
			}
			
			if (selection == 1) {
				System.out.println( deposit + "원 입금 완");
				bank.gap();
			} else {
				System.out.println("취소 됨. ㅂㅂ");
				bank.gap();
			}
		run();
		} else if (selection == 2) {
			System.out.println("출금 금액을 입력");
			withdraw = sc.nextInt();
			System.out.println("출금 : " + withdraw + "원 맞음?");
			System.out.println("[1.Yes] [2.No]");
			selection = sc.nextInt();
			
			while(selection != 1 && selection != 2) {
				System.out.println("1,2 중에 고르라고...");
				selection = sc.nextInt();
			}
			
			if (selection == 1) {
				System.out.println( withdraw + "원 출금 완");
				bank.gap();
			} else {
				System.out.println("취소 됨. ㅂㅂ");
				bank.gap();
			}
		run();
		} else {
			System.out.println("잔액 조회");
		}
		
	}
	
	
	
}
