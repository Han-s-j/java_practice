package ch11_java_api;

import java.util.Scanner;

public class CoinMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("====== 코인 정보 시스템 입니다. =======");
		// 1. 코인 종목코드 출력 (한 줄에 5 ~ 7 개 정도 출력)

		while (true) {
			System.out.println("\n 어떤 종목을 보여드릴까요?(end:q)");
			String msg = scan.nextLine();
			if (msg.equalsIgnoreCase("q")) {
				System.out.println("========= 종료 ========");
				break;
			}
			// 2. 해당 코인의 최저가(low), 최고가(high), 현재가(trade)출력
		}

	}
}
