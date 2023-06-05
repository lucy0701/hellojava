package example;

public class Practice01 {
	
	/* Camel Case: 카멜 = 낙타 > 첫번째 글자는 반드시 소문자. 이후부터는 단어마다 앞글자를 대문자
	 * 예시: memberRepository, findMemberListByCategory();
	 * 사용처: 패키지 이름, 메소드 이름, 변수 이 
	 * Pascal Case: 파스칼 = 첫번째 글자는 반드시 대문자, 이후부터도 단어마다 글자만 대문
	 * 예시: MemberRepository
	 * 사용처: 클래스 이름
	 * Snake Case: 스네이크 = 뱀 >모든 글자를 소문자 or 대문자로만 작성하고, 단어마다 사이에 언더바(_)를 넣어준다.
	 * member_repository, MEMBER_ID
	 * 사용처: SQL에서 사용, 테이블 이름이나 컬럼 이름에 사용한다.
	 * int number = 0;
	 */
	
	int number1 = 1111111111; // 정수형 자료형 ...-3, -2, -1, ,0, 1, 2, 3 ...
	// 대충 20억 정도까지 표현할 수 있음
	long number4 = 1111111111111111111l; //정수형 자료형인데int보다 2배 더 담음 
	double number2 = 0.1; // 실수형 자료형
	float number3 = 0.1f;
	String str = "true";
	char ch = 'A';
	boolean isTrue = true;
	
	
	public static void main(String args[]) {

		String numberString = "3000";
		int number = Integer.parseInt(numberString);
		System.out.print(number);
		String anyNumber = String.valueOf(number);
		System.out.println(anyNumber);
		
	}
	//Integer? int라는 자료형의 기반이되는 wrapper class
	//parseInt()? Integer클래스가 가지고 있는 내장 메소드
	

	


}
