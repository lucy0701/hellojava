package haha;

public class test {

	public static void main(String[] args) {
		
		// 사과, 배, 오렌지 각 하루 생산량 5,6,7개
		// 1) 과수원에서 하루 생산되는 과일 총 갯수 (int타입)
		// 2) 시간당 과일의 생산 갯수 (float타입 작성)
//		int apple = 5;
//		int ship = 6;
//		int orange = 7;
//
//		int total = (apple + ship + orange);
//		System.out.println("하루 생산되는 총 과일 갯수: " + total + "개");
//		
//		float day = total/24f;
//		System.out.println("시간당 생산 갯수: " + day + "개");
		
		// 변수 n에 정수값 장성, 1부터 입력받은 정수 n까지의 합을 계산한 결과 출력.
		// ex) 1+2+3+4+5 연산결과 15 출력
//		int result = 0;
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			result += i;
//		}
//		System.out.println(result);
		
//		변수 n1과 n2에 값을 넣고 n1과 n사이의 합을 계산해 결과 출력.
//		ex) 2와 5를 입력받으면, 2 + 3 + 4 + 5의 연산결과인 14출력
//		int result = 0;
//		int n1 = 2;
//		int n2 = 5;
//		for (int i = n1; i <= n2; i++) {
//			result += i;
//		}
//		System.out.println(result);
		
		// 1부터 100까지 반복 에서 3배수만 출력
//		int i = 0;
//		int result = 0;
//		
//		for (i = 1; i <= 100; i++) {
//			result = i*3;
//			if (result < 100) {
//				System.out.println(result);
//			}
//		}
		
//		for(int i = 1; i*3 <= 100; i++) {
//			System.out.println(i*3);
//		}
		
//		for(int i = 1; i <= 100; i++) {
//			if(i%3 == 0) {
//				System.out.println(i);
//			}
//		}
		
		//2중 for문을 사용하여 결과 출력
		//12345678910
		//23456789101
		//34567891012
		//... 10123456789
		
//		 for(int i = 0; i < 10; i ++) {
//			    for(int j = 0; j < 10; j++ {
//			        System.out.println((startNumber + i + j) % 10);
//			    }
//			}
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 1; j<= 10; j++) {
				System.out.print(j);
			}
		}
		
	}
}
