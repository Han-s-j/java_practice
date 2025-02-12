package practice;

import java.util.Scanner;

public class Result05 {

	public static void main(String[] args) {

		System.out.println("[계좌생성 실행 결과]");
		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			Scanner scan = new Scanner(System.in);
			System.out.print("선택> ");
			String inputMenu = scan.nextLine();
			int intInputMenu = Integer.parseInt(inputMenu);
			if (intInputMenu == 1) {
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");
				Scanner scan2 = new Scanner(System.in);
				System.out.print("계좌번호: ");
				String inputAcount = scan2.nextLine();
				Scanner scan3 = new Scanner(System.in);
				System.out.print("계좌주: ");
				String inputName = scan3.nextLine();
				Scanner scan4 = new Scanner(System.in);
				System.out.print("초기입금액: ");
				String inputInMoney = scan4.nextLine();
			}
			System.out.println("결과: 계좌가 생성되었습니다.");
			if (intInputMenu == 2) {
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
			}
		}
	}
}
