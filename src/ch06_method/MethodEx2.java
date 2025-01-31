package ch06_method;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		// coffee shop method 만들어 주세요
		// input : 고객 수
		// output : 없음

		// 고객수만큼 커피 주문을 받아 금액을 출력하는 메소드

		// 아아, 아메리카노 : 3000, 카푸치노 : 4500, 밀크티 : 5000
		// 메뉴가 없으면 '메뉴가 없습니다.' 출력 후 다시 주문 받아야 함.
		// n명 고객 주문완료
		// 총 주문 금액: m 원
		coffeeShop(3);
	}
	// 1.메소드 선언 (리턴 없음, 입력 인원수)
	// 2.인원 수 만큼 반복(특정 횟수 반복은 for문, 조건이 만족할 때까지 반복은 while)
	// 3.사용자 입력에 따른 음료의 가격 조건문(단순 값비교는 switch)
	// 4.조건에 해당되는 음료가 있을 때 가격 합산 (해당 메소드 전역적으로 합산관련 변수를 사용함.)
	// 5.인원수에 따른 주문이 완료되면 합산 출력

	public static void coffeeShop(int n) {
		System.out.println(n + " 명 고객 출현");
		int i = 0;
		while (i < n) {
			System.out.println((i + 1) + "번째 고객님 어떤걸 드릴까요?");
			i++;

			Scanner scan = new Scanner(System.in);
			
			int price = 0;
			
			String order = scan.nextLine();
			switch (order) {

			case "아아":
			case "아메리카노":
				price = 3000;
				break;
			case "카푸치노":
				price = 4500;
				break;
			case "밀크티":
				price = 5000;
				break;
			default:
				System.out.println("메뉴 없습니다.");
				i--;
			}
			if (price > 0) {
				System.out.println("선택한 음료는" + price + "원 입니다.");
			}
		}
		System.out.println(n + "명의 고객 주문완료.");
		//System.out.println("총 주문 금액: " + price + "입니다.");
	}
}
