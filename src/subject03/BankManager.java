package subject03;

//'BankManager' : 사용자가 콘솔을 통해 은행 계좌를 관리
//'Bank' 객체를 필드, 사용자로부터 입력을 받아'Bank' 메소드를 호출하는 역할.
public class BankManager {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.run();
	}
}
