package crystal;

public class ExArrayInArray {
	
	int[][] score = {
			{50, 70, 80}, // 각 행의 요소 3 == score[i].length
			{30, 20, 50}, 
			{30, 60, 20}, 
			{95, 80, 100}, 
			{60, 70, 90}, 
			{70, 80, 20} // 총 6줄 == score.length
	};

	String[] name = { "민수", "철수", "김씨", "이씨", "박씨", "시발"};
	String[] subject = {"국어", "수학", "영어"};
	String str;

	int[] subjectTotal = new int[score[0].length];
	int[] personTotal = new int[score.length];
		
	public void total() {
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j <score[i].length; j++) {
				subjectTotal[j] += score[i][j];
				personTotal[i] += score[i][j];
			}
		}
	}
	
	public void totalBySubject() {
		str = "과목별 총합" ;
		tatle();
		gap();
		for (int i = 0; i < score[i].length; i++) {
			System.out.println(" * " + subject[i] + "의 총합 : " + subjectTotal[i] + " 점");
		}
		gap();
	}
	
	public void subjectByAverage() {
		str = "과목별 평균" ;
		tatle();
		gap();
		for (int i = 0; i < score[i].length; i++) {
			double subjecAverage = (double) subjectTotal[i] / score.length;
			System.out.printf(" * " + "%s의 평균: %.2f점\n", subject[i], subjecAverage);
		}
		gap();
	}
	
	public void totalByPerson() {
		str = "학생별 총합" ;
		tatle();
		gap();
		for (int i = 0; i < score.length; i++) {
			System.out.println(" * " + name[i] + "의 총합 : " + personTotal[i] + "점");
		}
		gap();
	}
	
	public void personByAverage() {
		str = "학생별 평균" ;
		tatle();
		gap();
		for (int i = 0; i < score.length; i++) {
			double personAverage = (double) personTotal[i] / score[i].length;
			System.out.printf(" * " + "%s의 평균: %.2f점\n", name[i], personAverage);
		}
		gap();
	}
	
	public void tatle() {
		System.out.println("--------====" + str + "====--------");
	}
	public void gap() {
		System.out.println();
	}
}
