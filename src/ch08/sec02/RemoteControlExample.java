package ch08.sec02;

public class RemoteControlExample {
	public static void mian(String[] args) {
		RemoteControl rc;
		
		// rc 변수에 Television 객체를 대
		rc = new Television();
		rc.turnOn();
		
		// rc 변수에 Audio 객체를 대입 (교체 시킴)
		rc = new Audio();
		rc.turnOn();
	}
}
