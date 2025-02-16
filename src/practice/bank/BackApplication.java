package bank;
// 어려워요
import java.util.Scanner;

public class BackApplication {
	public static void main(String[] args) {
		Account[] account = new Account[10];
		while (true) {
			System.out.println("[계좌생성 실행 결과]");
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			Scanner scan = new Scanner(System.in);
			System.out.print("선택> ");
			String inputMenu = scan.nextLine();
			switch (inputMenu) {
			case "1":
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");
				System.out.print("계좌번호: ");
				String inpuAccountNum = scan.nextLine();
				System.out.print("계좌주: ");
				String inputName = scan.nextLine();
				System.out.print("초기입금액: ");
				String inputMoney = scan.nextLine();
				int intMoney = Integer.parseInt(inputMoney);
				Account accountList = new Account(inpuAccountNum, inputName, intMoney);
				accountList.setAccountNum(inpuAccountNum);
				accountList.setName(inputName);
				accountList.setBalance(intMoney);
				int num = 0;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			case "2":
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				int i =0;
				while(account[i] != null) {
					System.out.println(account[i].getAccountNum()+ " ");
					System.out.println(account[i].getName() + " ");
					System.out.println(account[i].getBalance());
					i++;
				}
			break;
			case "3":
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				System.out.println("계좌번호: ");
				System.out.println("예금액 : ");
			case "4":
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				System.out.println("계좌번호: ");
				System.out.println("출금액 : ");
			case "5":
				System.out.println("프로그램 종료");
			}
			break;
		}
	}
}
