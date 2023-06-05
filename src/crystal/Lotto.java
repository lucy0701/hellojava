package crystal;

public class Lotto {
	public static void main (String[] arg) {
		System.out.println("********** 이번주 추천 LOTTO 번호 **********" );
		lottoGenerator();
	}
	
	public static void lottoGenerator() {
		int[] lottoList = new int[6];
		
		for (int i = 0; i < 6; i ++) {
			lottoList[i] = (int)(Math.random() * 45) + 1;
			// {1, 2, 3, 3, 0, 0}
			for(int j = 0; j < i; j++) {
				if(lottoList[j] == lottoList[i]) {
					System.out.println("중복 처리");
					lottoList[i] = (int)(Math.random() * 45) + 1;
					j--;
				}
			}
		}
		for(int i = 0; i < lottoList.length; i++) {
			System.out.print(lottoList[i] + " ");
		}
	}
	
}
