package haha;

public class Hungry01 {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: "+ x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);
		
		
		// 부호 증감 연산자
		int x1 = 10;
		int y1 = 10;
		int z;
		
		x1++;
		++x1;
		System.out.println("x1= " + x1);
		
		System.out.println("------------------------");
		y1--;
		--y1;
		System.out.println("y1= " + y1);
		
		System.out.println("------------------------");
		z = x1++;
		System.out.println("z= " + z);
		System.out.println("x1= " + x1);
		
		System.out.println("------------------------");
		z = ++x1;
		System.out.println("z= " + z);
		System.out.println("x1= " + x1);
		
		System.out.println("------------------------");
		z = ++x1 + y1++;
		System.out.println("z= " + z);
		System.out.println("x1= " + x1);
		System.out.println("y= " + y1);
		
		// 산술 연산자
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2; 	// 모든 피연산자는 Int 타입으로 자동 변환 후 연산
		System.out.println("result1: " + result1);
		
		long result2 = v1 + v2 - v4; // 모든 피연산자는 long 타입으로 자동 변환 후 연산 
		System.out.println("result2: " + result2);
		
		double result3 = (double) v1 / v2; // double 타입으로 강제 변환 후 연산 
		System.out.println("result3: " + result3);
		
		int result4 = v1 % v2;
		System.out.println("result4: " + result4);
		
		
		// 오버플로우와 언더플로우
		byte var1 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			System.out.println("var1: "+ var1);
		}
		
		System.out.println("------------------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		}
		
		// 정확한 계산은 정수 연산으로
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		
		int apple2= 1;
		int totalPieces = apple2 * 10;
		int number1 = 7;
		
		int result5 = totalPieces - number1;
		
		System.out.println("10조각에서 남은조각: " + result5);
		System.out.println("사과 1개에서 남은 양: " + result5/10.0);
		
		
		// 나눗셈 연산후 NaN과 Infinity 처리
		int x2 = 5;
		double y3 = 0.0;
		double z1 = x2 / y3;
		// double z1 = x2 % y3;
		// 잘못 된 코드
		System.out.println(z1+2);
		
		// 알맞은 코드
		if(Double.isInfinite(z1) || Double.isNaN(z1)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println( z1 + 2 );
		}
		
		// 비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean result6 = (num1 == num2);
		boolean result7 = (num1 != num2);
		boolean result8 = (num1 <= num2);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		System.out.println("result8: " + result8);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result9 = (char1 < char2);
		System.out.println("result9: " + result9);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result10 = (num3 == num4);
		System.out.println("result10: " + result10);

		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result11 = (num5 == num6);
		boolean result12 = (num5 == (float)num6);
		System.out.println("result: " + result11);
		System.out.println("result: " + result12);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result13 = (str1.equals(str2));
		boolean result14 = (! str1.equals(str2));
		System.out.println("result13: " + result13);
		System.out.println("result14: " + result14);
		
		
		// 논리 연산자
		int charCode = 'A';
		// int charCode = 'a';
		// int charCode = '5';
		
		if ( (65<=charCode) & (charCode<=90)) {
			System.out.println("대문자 군요.");
		}
		
		if ( (97<=charCode) && (charCode<=122) ) {
			System.out.println("소문자 군요.");
		}
		if ( (48<=charCode) && (charCode<=57 )) {
			System.out.println("0~9숫자 군요.");
		}
		
		// -------------------------------------------
		int value = 6;
		// int value = 7;
		
		if ( (value%2==0) | (value%3==0) ){
			System.out.println("2 또는 3의 배수군요.");
		}
		
		boolean result20 = (value%2==0) || (value%3==0);
		if( !result20 ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
		
		
		// 비트 논리 연산자
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 45 = " + (45 | 45));
		System.out.println("45 ^ 45 = " + (45 ^ 45));
		System.out.println("~45 = " + (~45));
		System.out.println("------------------------");
		
		
		
		
		byte receiveData = -120;
		
		// 방법1 : 비트 논리곱 연산으로 Unsigned 정수 얻기 
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		// 방법2 : 자바 API를 이용해서 Unsigned 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
		
		
		int num10 = 1;
		int result21 = num10 << 3;
		int result22 = num10 * (int) Math.pow(2,3); //Math.pow(2,3)double값으로 산출. int값을 얻고싶다면 (int)값으로 캐스팅 
		System.out.println("result21: " + result21);
		System.out.println("result22: " + result22);
		
		int num11 = -8;
		int result23 = num11 >> 3;
		int result24 = num11 / (int) Math.pow(2, 3);
		System.out.println("result23: " + result23);
		System.out.println("result24: " + result24);
		
		
		
		int value10 = 772; //[00000000] [00000000] [0000011] [00000100]
		
		// 우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte1 = (byte) (value10 >>> 24);
		int int1 = byte1 & 255;
		System.out.println("첫 번째 바이트 부호 없는 값: " + int1);
		
		// 우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte2 = (byte) (value10 >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두 번째 바이트 부호 없는 값: " + int2);
		
		// 우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음 [00000011]
		byte byte3 = (byte) (value10 >>> 8);
		int int3 = byte3 & 255;
		System.out.println("세 번째 바이트 부호 없는 값: " + int3);
		
		// 끝 1바이트만 읽음 [00000100]
		byte byte4 = (byte) value10;
		int int4 =  Byte.toUnsignedInt(byte4);
		System.out.println("네 번째 바이트 부호 없는 값: " + int4);
		
		
		
		
		// 대입 연산자 
		int result30 = 0;
		result30 += 10;
		System.out.println("result30= " + result30);
		result30 -= 5;
		System.out.println("result30= " + result30);
		result30 *= 3;
		System.out.println("result30= " + result30);
		result30 /= 5;
		System.out.println("result30= " + result30);
		result30 %= 3;
		System.out.println("result30= " + result30);
		
		// 삼향 조건 연산자
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score>80) ? 'B' : 'C' );
		System.out.println(score + "점은" + grade + "등급입니다.");
		
		
	}
}
