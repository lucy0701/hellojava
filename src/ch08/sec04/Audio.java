package ch08.sec04;

public class Audio implements RemoteControl {
	// 필드 
	private int volume;
	
	// turnOn() 추상 메소드
	@Override 
	public void turnOn() {
		System.out.println("전원 킴");
	}
	
	// turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("전원 끔");
	}
	
	//setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + volume)
		;
	}
}
