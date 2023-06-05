package subject01;

public class Calculator {

	// 필드
	int numberA; //변수 선언
	int numberB; // primitive type
	int result;
	
	public Calculator(int a, int b) {
		this.numberA = a;
		this.numberB = b;
	}
	
	// 메소드
	
	public void setNumberA(int a) {
		this.numberA = a;
	}
	
	public void setNumberB(int a) {
		this.numberB = a;
	}

	public void plus() {
		this.result = numberA + numberB;
	}
	
	public void setField(int a, int b) {
		this.numberA = a;
		this.numberB = b;
		this.result = numberA + numberB;
	}
	
	public void printResult() {
		System.out.println("result: " + result);
	}
	
}
