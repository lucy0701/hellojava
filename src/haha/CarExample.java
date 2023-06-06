package haha;

public class CarExample {
	public static void main (String[] args) {
		// Car 객체 생성 
//		Car myCar = new Car();
//		
//		// Car 객체의 필드값 읽기
//		System.out.println("제작 회사: " + myCar.company);
//		System.out.println("모델명: " + myCar.model);
//		System.out.println("색깔: " + myCar.color);
//		System.out.println("최속고 속도: " + myCar.maxSpeed);
//		System.out.println("현재 속도: " + myCar.speed);
//		
//		// Car 객체의 필드값 변경
//		myCar.speed = 60;
//		System.out.println("현재 속도: " + myCar.speed);
		
//		Car myCar = new Car("그랜저", "검정", 250);
		// Car myCar = new Car(); // 기본 생성자 호출 못함.

		
		Car car1 = new Car("자가용");
		System.out.println("car2.company : " + car1.company);
		System.out.println("car2.model : " + car1.model);
		System.out.println();
		
		Car car2 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car2.company);
		System.out.println("car3.model : " + car2.model);
		System.out.println("car3.color : " + car2.color);
		System.out.println();
		
		Car car3 = new Car("택시", "검정", 200);
		System.out.println("car4.company : " + car3.company);
		System.out.println("car4.model : " + car3.model);
		System.out.println("car4.color : " + car3.color);
		System.out.println("car4.maxSpeed : " + car3.maxSpeed);
		
	} 
}
