package subject01;

public class Calculator2 {

	private int numberA;
	private int numberB;
	private int result;
	private String str;
	
	public void setNumber(int a, int b) {
		this.numberA = a;
		this.numberB = b;
	}
	public void plus() {
		this.result = numberA + numberB;
		this.str = " + ";
		printResult2();
	}
	public void minus() {
		this.result = numberA - numberB;
		this.str = " - ";
		printResult2();
	}
	public void multiply() {
		this.result = numberA * numberB;
		this.str = " * ";
		printResult2();
	}
	public void divide() {
		this.result = numberA / numberB;
		this.str = " / ";
		printResult2();
	}
	public void printResult2() {
		System.out.println(numberA + str + numberB + " = " + result);
	}
}
