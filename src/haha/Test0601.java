package haha;

public class Test0601 {

	public static void main(String[] args) {
//		int[][] array = {
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
//		int sum = 0;
//		System.out.println(array.length); //3
//		System.out.println(array[2].length); //5
	
//	int[] array = { 1, 5, 3, 8, 2};
//	int max = 0; 
//	
//	for(int i=0; i < array.length; i++) { 
//		if (array[i] > max) { 
//			max = array[i];
//		}
//	}
//	System.out.println(max);
	
	//평균값 출력 코드 (중첩 for문)
//	int[][] array = {
//			{95, 86},
//			{83, 92, 96},
//			{78, 83, 93, 87, 88}
//	};
//	int sum = 0;
//	for(int i = 0; i<array.length; i++) { // 전체 횟수만큼 반복
//		for(int j = 0; j<array[i].length; j++) { //값을 차례대로 입력 
//			sum += array[i][j]; // i = 행, j = 열, 행에있는 열들을 하나씩 더함.
//		}
//	}
//
//	int totalElements = 0;
//	for (int i = 0; i <array.length; i++) { // 전체 횟수만큼 반복
//		totalElements += array[i].length; // 행의 갯수 저장. (+=이 들어가는 이유는 행의 갯수를 누적시키기위함)
//	}
//	double average = (double) sum / totalElements; // 합계/요소갯수 = 평균
//	
//	System.out.println("총합 :" + sum);
//	System.out.println("평균 :" + average);
	
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			for(int j= 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i].length;
		}
		double ave = (double) sum / total;
		System.out.println("평균 :" + ave);
	
	}
}
