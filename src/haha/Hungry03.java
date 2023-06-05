package haha;

public class Hungry03 {

	public static void main(String[] args) {	
//	int[] arr1 = new int[] { 1, 2, 3};
//	int[] arr2 = new int[] { 1, 2, 3};
//	int[] arr3 = arr2;
//	
//	System.out.println(arr1 == arr2);
//	System.out.println(arr2 == arr3);
//	String hobby = "여행";
//	hobby = null;
//	
//	String kind1 = "자동차";
//	String kind2 = kind1;
//	kind1 = null;
//	System.out.println("kind2: " + kind2);
//	String strVar1 = "홍길동";
//	String strVar2 = "홍길동";
//	
//	if(strVar1 == strVar2) {
//		System.out.println("strVar1과 strVar2는 참조가 같다");
//	} else {
//		System.out.println("strVar1과 strVar2는 참조가 다름");
//	}
//	
//	if(strVar1.equals(strVar2)) {
//		System.out.println("strVar1과 strVar2는 문자열이 같음");
//	}
//	
//	String strVar3 = new String("홍길동");
//	String strVar4 = new String("홍길동");
//	
//	if(strVar3 == strVar4) {
//		System.out.println("strVar3과 strVar4는 참조가 같음");
//	} else {
//		System.out.println("strVar3과 strVar4는 참조가 다름");
//	}
//	if(strVar3.equals(strVar4)) {
//		System.out.println("strVar3과 strVar4는 문자열이 같");
//	}
//	String hobby = "";
//	if(hobby.equals("")) {
//		System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
//	}
//	String ssn = "9506241230123";
//	char sex = ssn.charAt(6);
//	switch (sex) {
//		case '1':
//		case '3':
//			System.out.println("남자입니다");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자입니다");
//			break;
//	}
//		String ssn = "9506241230123";
//		int length = ssn.length();
//		if(length == 13) {
//			System.out.println("주민등록번호가 자릿수가 맞습니다.");
//		} else {
//			System.out.println("주민등록번호가 자릿수가 틀립니다.");
//		}
//		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
//		String newStr = oldStr.replace("자바", "JAVA");
//		
//		System.out.println(oldStr);
//		System.out.println(newStr);
		
//		String ssn = "880815-1234567";
//		
//		String firstNum = ssn.substring(0,6);
//		System.out.println(firstNum);
//		
//		String secondNum = ssn.substring(7);
//		System.out.println(secondNum);
		
//		String subject = "자바 프로그래밍";
//		
//		int location = subject.indexOf("프로그래밍");
//		System.out.println(location);
//		String substring = subject.substring(location);
//		System.out.println(substring);
//		
//		location = subject.indexOf("자바");
//		if(location != -1) {
//			System.out.println("자바와 관련된 책이군요.");
//		} else {
//			System.out.println("자바와 관련 없는 책이군요.");
//		}
//		
//		boolean result = subject.contains("자바");
//		if(result) {
//			System.out.println("자바와 관련된 책이군요.");
//		} else {
//			System.out.println("자바와 관련 없는 책이군요.");
//		}
//		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
//		
//		String[] tokens = board.split(",");
//		
//		System.out.println("번호: " + tokens[0]);
//		System.out.println("제목: " + tokens[1]);
//		System.out.println("내용: " + tokens[2]);
//		System.out.println("성명: " + tokens[3]);
//		System.out.println();
//		
//		for(int i=0; i<tokens.length; i++) {
//			System.out.println(tokens[i]);
//		}
		
//		String[] season = { "Spring", "Summer", "Fall", "Winter" };
//		
//		System.out.println("season[0] : " + season[0]);
//		System.out.println("season[1] : " + season[1]);
//		System.out.println("season[2] : " + season[2]);
//		System.out.println("season[3] : " + season[3]);
//		
//		season[1] = "여름";
//		System.out.println("season[1] : " + season[1]);
//		System.out.println();
//		
//		int[] scores = { 83, 90, 87 };
//		
//		int sum = 0;
//		for(int i=0; i<3; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합 : " + sum);
//		double avg = (double) sum / 3;
//		System.out.println("평균 : " + avg);
		
//		int[] scores;
//		scores = new int[] {83, 90, 87};
//		int sum1 = 0;
//		for(int i=0; i<3; i++) {
//			sum1 += scores[i];
//		}
//		System.out.println("총합 : " + sum1);
//		
//		printItem( new int[] { 83, 90, 87});
//		
//		
//	}
//	public static void printItem( int[] scores) {
//		for(int i=0; i<3; i++) {
//			System.out.println("scre[" + i + "]:" + scores[i]);
//		}
//		int[] arr1 = new int[3];
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr1[i] + ",");
//		}
//		System.out.println();
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
//		}
//		System.out.println("\n");
//		
//		double[] arr2 = new double[3];
//		for(int i=0; i<3; i++) {
//			System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
//		}
//		System.out.println();
//		
//		arr2[0] = 0.1;
//		arr2[1] = 0.2;
//		arr2[2] = 0.3;
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr2[" + i + "] :" + arr2[i] + ", ");
//		}
//		System.out.println("\n");
//		
//		String[] arr3 = new String[3];
//		for(int i=0; i<3; i++){
//			System.out.print("arr3[" + i + "]:" + arr3[i] + ", ");
//		}
//		System.out.println();
//		arr3[0] = "1월";
//		arr3[1] = "2월";
//		arr3[2] = "3월";
//		for(int i=0; i<3; i++) {
//			System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
//		}
//		int[] scores = { 84, 90, 96};
//		
//		int sum = 0;
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합 : " +sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("평균 : " + avg);
//		int[][] scores = {
//				{ 80, 90, 96},
//				{ 76, 88 }
//		};
//		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
//		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
//		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);
//		
//		System.out.println("scores[0][2]: " + scores[0][2]);
//		System.out.println("scores[1][1]: " + scores[1][1]);
//		
//		int class1Sum = 0;
//		for(int i=0; i<scores[0].length; i++) {
//			class1Sum += scores[0][i];
//		}
//		double class1Avg = (double) class1Sum / scores[0].length;
//		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);
//		
//		int class2Sum = 0;
//		for(int i=0; i<scores[1].length; i++) {
//			class2Sum += scores[1][i];
//		}
//		double class2Avg = (double) class2Sum / scores[1].length;
//		System.out.println("두 번째 반의 평균 점수: " + class2Avg);
//		
//		int totalStudent = 0;
//		int totalSum = 0;
//		for(int i=0; i<scores.length; i++) {
//			totalStudent += scores[i].length;
//			for(int k=0; k<scores[i].length; k++) {
//				totalSum += scores[i][k];
//			}
//		}
//		double totalAvg = (double) totalSum / totalStudent;
//		System.out.println("전체 학생의 평균 점수: " + totalAvg);
//		int[][] mathScores = new int[2][3];
//		for (int i = 0; i < mathScores.length; i++) {
//			for (int k = 0; k < mathScores[i].length; k++) {
//				System.out.println("mathScores[" + i + "] [" + k + "]:" + mathScores[i][k]);
//			}
//		}
//		System.out.println();
//		mathScores[0][0] = 80;
//		mathScores[0][1] = 83;
//		mathScores[0][2] = 85;
//		mathScores[1][0] = 86;
//		mathScores[1][1] = 90;
//		mathScores[1][2] = 92;
//		
//		int totalStudent = 0;
//		int totalMathSum = 0;
//		for (int i = 0; i < mathScores.length; i++) {
//			totalStudent += mathScores[i].length;
//			for (int k = 0; k < mathScores[i].length; k++) {
//				totalMathSum += mathScores[i][k];
//			}
//		}
//		double totalMathAvg = (double) totalMathSum / totalStudent;
//		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
//		System.out.println();
//		
//		int[][] englishScores = new int[2][];
//		englishScores[0] = new int[2];
//		englishScores[1] = new int[3];
//		for (int i = 0; i < englishScores.length; i++) {
//			for(int k = 0; k <englishScores[i].length; k++) {
//				System.out.println("englishScores[" + i + "][" + k + "]:" + englishScores[i][k]);
//			}
//		}
//		System.out.println();
//		englishScores[0][0] = 90;
//		englishScores[0][1] = 91;
//		englishScores[1][0] = 92;
//		englishScores[1][1] = 93;
//		englishScores[1][2] = 94;
//		
//		totalStudent = 0;
//		int totalEnglishSum = 0;
//		for (int i = 0; i < englishScores.length; i++) {
//			totalStudent += englishScores[i].length;
//			for(int k = 0; k <englishScores[i].length; k++) {
//				totalEnglishSum +=englishScores[i][k];
//			}
//		}
//		double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
//		System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
//		String[] oldStrArray = { "java", "arry", "copy" };
//		String[] newStrArray = new String[5];
//		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		for(int i=0; i<newStrArray.length; i++) {
//			System.out.print(newStrArray[i] + ", ");
//		}
//		int[] scores = {95, 71, 84, 93, 87 };
//		int sum = 0;
//		for (int score : scores) {
//			sum = sum + score;
//		}
//		System.out.println("점수 총합 = " + sum);
//		double avg = (double) sum / scores.length;
//		System.out.println("점수 평균: "+ avg);
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
	} 
}
