package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		// Phone phone = new phone(); <- X
		
		smartPhone.turnOn(); //Phone의 메소드 
		smartPhone.internetSearch();
		smartPhone.turnOff(); //Phone의 메소드 
		
	}
}
