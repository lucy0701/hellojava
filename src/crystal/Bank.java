package crystal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 'Bank' : 이 클래스는 'BankAccount' 객체의 리스트 필드. 
// 계좌 추가하고, 제거, 특정 계좌를 찾는 메소드 구현.

public class Bank {
	
	private Scanner scanner;
	private List<String> accounts;
//	<>는 다이아몬드 연산자(Generics)라고 불리며, Java에서 제네릭 타입을 표현하기 위해 사용
	
	public Bank() {
		accounts = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		while (true) {
			System.out.print("1. 계좌 추가\n2. 계좌 제거	\n3. 종료\n메뉴 선택: ");
			int choice = scanner.nextInt();
			
			if (choice == 1) {
				System.out.println("추가 할 계좌 입력해라: ");
				String account = scanner.next();
				addAccount(account);
			} else if (choice == 2) {
				System.out.println("제거 할 계좌 입력해라: ");
				String account = scanner.next();
				removeAccount(account);
			} else if (choice == 3) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("그딴 번호는 보기에 없다.");
			}
		}
	}
	
	public void addAccount(String account) {
		accounts.add(account);
		System.out.println("계좌 추가 함: " + account);
	}
	
	public void removeAccount(String account) {
		if (accounts.contains(account)) {
			accounts.remove(account);
			System.out.println("계좌 제거 함: " + account);
		} else {
			System.out.println("해당 계좌 없음: "+ account);
		}
	}	
	
}
