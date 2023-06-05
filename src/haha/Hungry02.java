package haha;

import java.util.Scanner;

public class Hungry02 {
	public static void main(String[] args) {
		
//		int score = 93;
//		if (score >= 90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		}
//		if(score < 90)
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
//			
//			
//			
//		int score1 = 85;
//		
//		if(score1>=90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		} else {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
//		}
//		
//		
//		int score2 = 75;
//		
//		if(score2>=90) {
//			System.out.println("점수가 100~90 입니다.");
//			System.out.println("등급은 A입니다.");
//		} else if(score2>=80) {
//			System.out.println("점수가 90~80 입니다.");
//			System.out.println("등급은 B입니다.");
//		} else if(score2>=70) {
//			System.out.println("점수가 80~70 입니다.");
//			System.out.println("등급은 C입니다.");
//		} else {
//			System.out.println("점수가 70 미만입니다.");
//			System.out.println("등급은 D입니다.");
//		}
//		
//		
//		int num = (int)(Math.random()*6) +1;			//주사위 번호 하나 뽑기
//		
//		if(num==1) {
//			System.out.println("1번이 나왔습니다.");
//		} else if(num==2) {
//			System.out.println("2번이 나왔습니다.");
//		} else if(num==3) {
//			System.out.println("3번이 나왔습니다.");
//		} else if(num==4) {
//			System.out.println("4번이 나왔습니다.");
//		} else if(num==5) {
//			System.out.println("5번이 나왔습니다.");
//		} else {
//			System.out.println("6번이 나왔습니다.");
//		}
//		
//		
//		int score4 = (int)(Math.random()*20) + 81;
//		System.out.println("점수: " + score4);
//		
//		String grade;
//		
//		if(score4>=90) {
//			if(score4>=95) {
//				grade = "A+";
//			} else {
//				grade = "A";
//			}
//		} else {
//			if(score4>=85) {
//				grade = "B+";
//			} else {
//				grade = "B";
//			}
//		}
//		
//		System.out.println("학점: " + grade);
//		
//		// switch문
//		int num1 = (int)(Math.random()*6) + 1;
//		
//		switch(num1) {
//			case 1:
//				System.out.println("1번이 나왔습니다.");
//				break;
//			case 2:
//				System.out.println("2번이 나왔습니다.");
//				break;
//			case 3:
//				System.out.println("3번이 나왔습니다.");
//				break;
//			case 4:
//				System.out.println("4번이 나왔습니다.");
//				break;
//			case 5:
//				System.out.println("5번이 나왔습니다.");
//				break;
//			default:
//				System.out.println("6번이 나왔습니다.");
//		}
//		
//		int time = (int)(Math.random()*4) + 8;
//		System.out.println("[현재 시간: " + time + "시]");
//		
//		switch(time) {
//			case 6:
//				System.out.println("출근 합니다.");
//			case 7:
//				System.out.println("회의를 합니다.");
//			case 8:
//				System.out.println("업무를 봅니다.");
//			case 9:
//				System.out.println("외근을 나갑니다.");
//		}
//		
//		
//		char grade1 = 'B';
//		
//		switch(grade1) {
//			case 'A':
//			case 'a':
//				System.out.println("우수 회원 입니다.");
//				break;
//			case 'B':
//			case 'b':
//				System.out.println("일반 회원 입니다.");
//				break;
//			default:
//				System.out.println("손닙입니다.");
//		}
//		
//		// break문 없애는 대신 ->로 표시.
//		char grade2 = 'B';
//		switch(grade2) {
//			case 'A', 'a' ->{
//				System.out.println("우수 회원입니다.");
//			}
//			case 'B', 'b' -> {
//				System.out.println("일반 회원입니다.");
//			}
//			default -> {
//				System.out.println("손님 입니다.");
//			}
//		}
//		
//		switch(grade2) {
//			case 'A', 'a' -> System.out.println("우수 회원입니다.");
//			case 'B', 'b' -> System.out.println("일반 회원입니다.");
//			default -> System.out.println("손닙입니다.");
//		}
//		
//		
//		String dinner = "hamburger";
//		switch(dinner) {
//			case "friedRice" -> System.out.println("질립니다.");
//			case "hamburger" -> System.out.println("괜찮을지도?");
//			case "짜장면" -> System.out.println("고민되지만 기름이 많습니다.");
//			case "굶어" -> System.out.println("죽습니다.");
//			default -> System.out.println("뭘 말하든 안땡깁니다.");
//		}
//		
//		int dinner2 = (int)(Math.random()*5);
//		
//		if(dinner2 == 1) {
//			System.out.println("햄버거");
//		} else if(dinner2 == 2) {
//			System.out.println("짜장면");
//		} else if(dinner2 == 3) {
//			System.out.println("볶음밥");
//		} else if(dinner2 == 4) {
//			System.out.println("비빔밥");
//		} else {
//			System.out.println("굶기");
//		}
//		
//		String grade10 = "B";
//		
//		// java 11 이전 문법
//		int score10 = 0;
//		switch(grade10) {
//			case "A":
//				score10 = 100;
//				break;
//			case "B":
//				int result = 100 - 20;
//				score10 = result;
//				break;
//			default:
//				score10 = 60;
//		}
//		System.out.println("score10: " + score10);
//		
//		// java 12	부터 가능
//		int score11 = switch(grade10) {
//			case "A" -> 100;
//			case "B" -> {
//			int result = 100-20;
//			// java 13부터 가능
//			 yield result;
//			}
//			default -> 60;
//		};
//		System.out.println("score11: " + score11);
//		
//		
//		// for문 가보자
//		for(int i=1; i<=10; i++) {
//			System.out.println(i + " ");
//		}
//		
//		
//		int sum = 0; // 합계 변수 
//		int i; // 카운터 변수 
//		
//		for(i=1; i<=100; i++) {
//			sum += i;
//		}
//		System.out.println("1~" + (i-1) + " 합 : " + sum );
//		
//		
//		
//		// 부동 소수점 방식의 float 타입은 연산 과정에서 정확히 0.1을 표현하지 못하기 때문에 증감식에서 x에 더해지는 실제값은 0.1보다 약간 클수있음. 따라 최종반복횟수는 9
//		for(float x=0.1f; x<=1.0f; x+=0.1f) {
//			System.out.println(x);
//		}
//		
//		for (int m=2; m<=9; m++) {
//			System.out.println("***" + m + "단 ***");
//			for (int n=1; n<=9; n++) {
//				System.out.println(m + " x " + n + " = " + (m*n));
//			}
//		}
//		
//		
//		
//		for (i=1; i<=5; i++) {
//			for (int j=0; j<i; j++) {
//			System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		
//		
//		
//	
//		for (i=1; i<=100; i++) {
//			int a = i*3;
//			if(a<100) {
//				sum +=a;
//				System.out.println(a + sum);
//			}
//		}
		
//		while (true) {
//			int dice1 = (int)(Math.random()*6)+1;
//			int dice2 = (int)(Math.random()*6)+1;
//			System.out.println(" dice1: " + dice1 + " dice2: " + dice2 + " dice1+dice2 = " + (dice1+dice2));
//			if(dice1+dice2 == 5) {
//				break;
//			}
//			
//		}
		
		// 중첩for 문을 이용하여 방정식 4x + 5y = 60 의 모든 해를 구해서 (x, y)형태로 출력하는 코드를 작성. 단x,y는 10이하 자연수
		
//		for(int x = 1; x <= 10; x++) {
//			for(int y = 1; y <= 10; y++) {
//				if(4 * x + 5 * y == 60) {
//					System.out.println("(" + x + ", " + y + ")");
//				}
//			}
//		}
		
//		int i = 1;
//		while (i<=10) {
//			System.out.println(i + " ");
//			i++;
//		}

		// do-while
//		System.out.println("메세지를 입력하세요.");
//		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
//		
//		Scanner scanner = new Scanner(System.in);
//		String inputString;
//		
//		do {
//			System.out.print(">");
//			inputString = scanner.nextLine();
//			System.out.println(inputString);
//		} while ( ! inputString.equals("p") );
//		
//		System.out.println();
//		System.out.println("프로그램 종료");
		
		//break 문
//		while(true) {
//			int num = (int)(Math.random()*6) + 1;
//			System.out.println(num);
//			if(num == 6) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
//		Outter: for(char upper='A'; upper<='Z'; upper++) {
//			for(char lower = 'a'; lower<='z'; lower++) {
//				System.out.println(upper + "-" + lower);
//				if(lower=='g') {
//					break Outter;
//				}
//			}
//		}
//		System.out.println("프로그램 실행 종료");
		
//		for(int i=1; i<=10; i++) {
//			if(i%2 != 0) {
//				continue;
//			}
//			System.out.println(i+" ");
//		}
		
//		int sum = 0;
//		int i = 1;
//		while(i<=100) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~" + (i-1) + " 합: " + sum);
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 증속| 2. 감속 | 3. 중지");
			System.out.println("-----------------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			}else if(strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("프로그램 종");
	}
}
