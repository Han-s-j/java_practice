package practice;

import java.util.Scanner;

public class Result01 {

	public static void main(String[] args) {
		/*
		 * q. 1 사용자로 부터 국어, 영어, 수학 점수를 각각 입력받아 ~~~~.. 정수로 받으면 소수점이 잘림
		 */
		// 정수 나눗셈(int)
//		int a = 7;
//		int b = 3;
//		int intResult = a/b;
//		System.out.println("정수 나눗셈:" + intResult);
//		
//		double c = 7;
//		double d = 3;
//		double doubleResult = c/d;
//		System.out.println("double 나눗셈" + doubleResult);
//		
//		//정수 나눗셈을 캐스팅
//		double mixedReulst = (double)a/b;
//		System.out.println("캐스팅된 나눗셈 " + mixedReulst);
//		
//		//ex
//		System.out.println(4 / 3);	
//		System.out.println(4 / 3.0);
//		
//		int intResult2 = (int) (c/d);
//		System.out.println(intResult2);
//		
//		System.out.printf("결과: %.2f %n", mixedReulst);

		//
		System.out.println("======= Q.01 =======");
		System.out.println("사용자로 부터 국어, 영어, 수학 점수를 각각 입력받아 평균점수를 구하고, 등급을 출력해주세요.");
		System.out.println("====================");

		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>>");
		String score1 = scan.nextLine();
		double scoreint1 = Integer.parseInt(score1);

		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>>");
		String score2 = scan.nextLine();
		double scoreint2 = Integer.parseInt(score2);

		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>>");
		String score3 = scan.nextLine();
		double scoreint3 = Integer.parseInt(score3);

		double average = ((scoreint1 + scoreint2 + scoreint3) / 3);
		System.out.println("평균 :" + average);

		double score = average;
		String grade = ""; // 빈 이유: 여러 조거문을 사용하기 위해서
		// 조건문이 if문 하나일 수도 else if, else를 추가하여 여러 개 일 수도 있다. 그래서 순서가 중요하다
		// if 문은 해당 조건이 true 이면 {} 해당영역으로 진입
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) { // 조건이 더 있다면 else if 추가
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else { // 그 밖에 모든 상황
			grade = "D";
		}
		System.out.println("등급 : " + grade + "등급");
		//
		System.out.println("======= Q.02 =======");
//		System.out.println("for문을 사용해서 10팩토리얼의 값을 출력해주세요.");
//		int num = 1;
//		for (int i = 1; i <= 10; i++) {
//			num *= i;
//		}
//		System.out.println("결과:" + num);
		System.out.println("for문을 사용해서 10 팩토리얼의 값을 출력해주세요.");
		int num = 1;
		for (int i = 10; i >= 1; i--) {
			num *= i;
		}
		System.out.println("결과:" + num);
		System.out.println("=====================");
		System.out.println("@ 15팩토리얼의 값을 출력해주세요.");
		// 13 을 넘어가면 13! = 6227020800 으로 int 형의 범위를 벗어나기 때문에 long 타입으로 해주어야 한다.
		long num2 = 1;
		for (int h = 1; h <= 15; h++) {
			num2 *= h;
		}
		System.out.println("결과:" + num2);
	}
}
