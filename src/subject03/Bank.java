package subject03;

import java.util.Scanner;

// 'Bank' : 이 클래스는 'BankAccount' 객체의 리스트 필드. 
// 계좌 추가하고, 제거, 특정 계좌를 찾는 메소드 구현.

public class Bank {
	
	private Scanner sc;	
	private int selection;
	private int addition; // 추가
	private int eliminate; // 제거
	private int search; // 검색 
	
	public void accountManagement() {
		this.sc = new Scanner(System.in);
		System.out.println("  ****** 계좌 관리 ******  ");
		System.out.println("[1.계좌 등록] [2.계좌 제거] [3.검색]");
		startList();
	}
	public void startList() {

		selection = sc.nextInt();

		while(selection != 1 && selection != 2 && selection != 3) {
			System.out.println("잘 못 입력");
			selection = sc.nextInt();
		}
		if (selection == 1) {
			System.out.println("등록 할 계좌 입력");
			addition = sc.nextInt();
			System.out.println("입력한 " + addition + " 로 등록 완료");
			gap();
		} else if (selection == 2) {
			System.out.println("제거 할 계좌 입력");
			eliminate = sc.nextInt();
			System.out.println("입력한 " + eliminate + "가 삭제 완료");
			gap();
		} else {
			System.out.println("검색 할 계좌 입력");
			search = sc.nextInt();
			System.out.println(search);
			gap();
		}
		accountManagement();
	}
	public void gap() {
		System.out.println();
	}
}
