package practice.cafe;

import java.util.Scanner;

public class CafeMain {
	public static void main(String[] args) {

		System.out.println("행동을 선택해주세요.");
		System.out.println("1. 스타벅스 방문 | 2. 아카 방문 | 3. 사무실 복귀..");
		System.out.print(">>>");
		Scanner scan = new Scanner(System.in);
		String choiceAct  = scan.nextLine();
		if(choiceAct == "1") {
			System.out.println("어서오세요 스타벅스 입니다.");
			
		}
		

	}
}
