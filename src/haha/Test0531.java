package haha;

public class Test0531 {

	public static void main(String[] args) {
		
//		for (int i=1; i<=9; i++) {
//			System.out.println(i + "단");
//			for (int j=1; j<=9; j++) {
//				System.out.println( i + "X" + j + "=" + i * j );
//			}
//		}

		

		for (int i = 1; i <=5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
				}
			for(int k = 	0; k < i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for(int j = 0; j < 1 * i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 9 - i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}

  