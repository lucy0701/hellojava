package haha;

public class KoreanExample {
	public static void main(String[] args) {
		//Korean 객체 생성
		Korean korean = new Korean("박자바", "011225-1234567");
		//Korean 객체 데이터 읽기
		System.out.println("korean.nation : " + korean.nation);
		System.out.println("korean.name : " + korean.name);
		System.out.println("korean.ssn : " + korean.ssn);
		
		// 또다른 객체 생성 
		Korean korean2 = new Korean("김자바", "930525-0654321");;
		// 또다른 Korean객체 데이터 읽기
		System.out.println("korean.nation : " + korean2.nation);
		System.out.println("korean.name : " + korean2.name);
		System.out.println("korean.ssn : " + korean2.ssn);
	}
}
