package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// SmartPhon 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		// Phone으로 부터 상속 받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		//Phone으로 부터 상속 받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세용");
		myPhone.receiveVoice("안녕. 나는 수정이야.");
		myPhone.sendVoice("아~ 반가워용");
		myPhone.hangUp();
		
		// 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
