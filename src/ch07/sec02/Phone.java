package ch07.sec02;

public class Phone {
	// 필드 선언
	public String model;
	public String color;
	
	// 메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String messange) {
		System.out.println("자기: " + messange);
	}
	public void receiveVoice(String messange) {
		System.out.println("상대방: " + messange);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}