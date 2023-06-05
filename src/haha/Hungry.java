package haha; // 패키지

import java.util.Scanner;

public class Hungry {	// 클래스 선언 
	
	public static void main(String[] args) {		// main()메소드 선언 main은 메소드 명. {}안은 메소드 블럭
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute +"분");
		
		
		
		// x, y 값 바꾸
		int x = 3;
		int y = 5;
		System.out.println("x:"+ x + ", y:" + y);
		
		int temp = x; //temp값에 x값을 저장
		x = y; // x에 y값을 지정 
		y = temp; // y에 temp값(초기:x) 값을 넣음 
		System.out.println("x: "+ x + ", y:" + y);
		
		
		// 정수 타입 
		int var1 = 0b1011;  // 2진수 
		int var2 = 0206;  // 8진수 
		int var3 = 365;  // 10진수 
		int var4 = 0xB3;  // 16진수 
		System.out.println("var1: " + var1 );
		System.out.println("var2: " + var2 );
		System.out.println("var3: " + var3 );
		System.out.println("var4: " + var4 );
		
		// 실수 타입
		// 정밀도 확인 
		float var5 = 0.1234567890123456789f;
		double var6 = 0.1234567890123456789;
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		
		// 10의 거듭제곱리터럴
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
		
		
		// 논리 타입
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		int a = 10;
		boolean result1 = (a == 20);
		boolean result2 = (a != 20);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		// 문자열 타입
		String name = "가연";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		
		
		String str1 = "" +
		"{\n" + 
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";
		
		String str2 = """
			{
				"id":"winter"
				"name":"눈송이"
			}
				""";
		System.out.println(str1);
		System.out.println("----------------------------------------");
		System.out.println(str2);
		System.out.println("----------------------------------------");
		String str3 = """
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		System.out.println(str3);
		
		
		// 자동 변환 
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " +intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 1000;
		float floatValue = longValue;
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5f;
		double doybleValue = floatValue;
		System.out.println("doybleValu: " + doybleValue);
		
		// 강제 변환
		int var11 = 10;
		byte var12 = (byte) var11;
		System.out.println(var12);
		
		long var13 = 300;
		int var14 = (int) var13;
		System.out.println(var14);
		
		int var15 = 65;
		char var16 = (char) var15;
		System.out.println(var16);
		
		double var17 = 3.14;
		int var18 = (int) var17;
		System.out.println(var18);
		
		//연산식 자동타입 변
		byte result10 = 10+20;
		System.out.println("result10: " + result10);
		
		byte v1 = 10;
		byte v2 = 20;
		int result11 = v1+v2;
		System.out.println("resylt11: " + result11);
		
		byte v3 = 10;
		byte v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 +v5;
		System.out.println(result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		
		int v8 = 10;
		int result5 = v8/4;
		System.out.println("result5: " + result5);
		
		int v9 = 10;
		double result6 = v9/4.0;
		System.out.println("tesult6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 =(double) v10 / v11;
		System.out.println("result7: " + result7);
		
		//숫자 연산
		int result20 = 10 + 2 + 8;
		System.out.println("result20: " + result20);
		
		// 결합 연산
		String result21 = 10 + 2 + "8";
		System.out.println("result21: "+ result21);
		
		String result22 = 10 + "2" + 8;
		System.out.println("reult22: " + result22);
		
		String result23 = "10" + 2 + 8;
		System.out.println("reult23: " + result23);
		
		String result24 = "10" + ( 2 + 8 );
		System.out.println("reult24: " + result24);
		
		int value31 = 123;
		System.out.printf("상품의 가격:%d원\n", value31);
		System.out.printf("상품의 가격:%6d원\n", value31);
		System.out.printf("상품의 가격:%-6d원\n", value31);
		
		
		// 콘솔 변수값 출력 
		int value41= 123;
		System.out.printf("상품의 가격:%d원\n", value41);
		System.out.printf("상품의 가격:%6d원\n", value41);
		System.out.printf("상품의 가격:%-6d원\n", value41);
		System.out.printf("상품의 가격:%06d원\n", value41);
		
		double area10 = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area10);
		
		String name2 = "홍길동";
		String job2 = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name2, job2);
		
		
		
		// 키보드 입력 데이터를 변수에 저장
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("X 값 입력 : ");
		String strX = scanner.nextLine();
		int x1 = Integer.parseInt(strX);
		
		System.out.print("Y 값 입력 : ");
		String strY = scanner.nextLine();
		int y1 = Integer.parseInt(strY);
		
		int result = x1 + y1;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {		// 중괄호{} 안을 무한 반복 실행 
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {		// 입력된 문자열이 q라면 반복 중지 
				break;
			}
		System.out.println("출력 문자열: " + data);
		System.out.println();
		}
		
		System.out.println("종료");
		
		
	}
}
