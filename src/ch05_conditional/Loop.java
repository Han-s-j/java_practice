package ch05_conditional;

/**
 * class Name : Loop Author : SJ Created Date : 2025. 1. 24. Version : 1.0
 * Purpose : Java 기초 Description : 반복문 for(중요)
 */
public class Loop {
	public static void main(String[] args) {
		// for문 (1. 초기화 식; 2. 조건식; 4. 증감식){
		// 3.실행문
		// }
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// 1 ~ 10까지의 합은?
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10 더하면 : " + sum);
		// 21~45까지 합은?
		int sum2 = 0;
		for (int i = 21; i <= 45; i++) {
			sum2 += i;
		}
		System.out.println("21 ~ 45 더하면?:" + sum2);
		// 1~ 40까지 중에 짝수만 더한 값은?
		// 1. 1 ~40 반복문 만들기
		int sum3 = 0;
		for (int i = 1; i <= 40; i++) {
			// System.out.println(i);
			// 2.조건식(짝수일때만 더하기)
			if (i % 2 == 0)
				;
			{
				sum3 += i;
				// System.out.println(i);
			}
		}
		// 3.출력
		System.out.println("1~40까지 중 짝수의 합은:" + sum3);

		// 구구단 출력
		int dan = 9;
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d \n", dan, i, dan * i);
		}
		// 2 ~ 9단 출력
		// 각 단마다 1 ~ 9까지 곱하기
		// 1.단 증가 for문
		for (int i = 2; i <= 9; i++) {
			// 5단은 제외! (continue)
			// 5단 전까지! (break)
			if (i == 5) {
//				continue;	// continue를 만나면 아래 실행문을 건너뜀
				break; // true 일 시 해당 반복문 즉시 종료
			}
			System.out.println("==" + i + "단 ==");
			// 2. 1 ~ 9 곱하기 for문
			// 위에서 i를 썼기 때문에 다른 변수명인 j를 입력
			for (int j = 1; j <= 9; j++) {
				// 3. 출력
				System.out.printf("%d x %d = %d \n", i, j, i * j);
			}
		}
		// 1 ~ n 까지 더한 값이 100 이상이 되는 지점의 n을 구하시오
		int num5 = 0;
		for (int i = 1; i < 9999; i++) {
			num5 += i;
			if (num5 >= 100) {
				System.out.println("100 이상이 되는 n:" + i);
				break;
			}
		}
		// 중첩 for문에서 서브 for문 시점에 특정 시점의 반복을 중단하는
		// label(for문의 제어 흐름을 전달)
		int sum6 = 0;
		outer: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				sum6 = i * j;
				System.out.printf("i:%d, j:%d, i*j=%d \n", i, j, sum6);
				if (sum6 >= 50) {
					// break;	// sub for문 중단, main for은 진행됨.
					break outer; // outer 해당 for 문 즉시 중단.
				}
			}
		}
	}
}
