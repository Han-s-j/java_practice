package practice;

import java.util.Scanner;

// Q.엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터가
//이동하는 프로그램을 구현해 봅시다. 
//1. 사용자의 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다. 
//2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다. 
//3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다. 
//4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit 중 하나를 입력한다. 
//※사용자가 엘리베이터에 탑승하고 층을 입력하면 탑승 중인 엘리베이터가 해당 층으로
//이동하도록 만드세요.
public class Result04 {
	public static void main(String[] args) {
		int A = 10;
		int B = 4;
		while (true) {
			System.out.println("========== 엘리베이터 ===========");
			System.out.println("승장기 A의 현재 위치: " + A);
			System.out.println("승장기 B의 현재 위치: " + B);
			Scanner scan = new Scanner(System.in);
			System.out.println("몇층에 계시나요? [종료는 q 또는 exit]:");
			String input = scan.nextLine();
			if (input.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}if (input.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				int inputFloor = Integer.parseInt(input);
				int floor1 = Math.abs(A-inputFloor);
				int floor2 = Math.abs(B-inputFloor);
				if (floor1 > floor2){
//					System.out.print(floor1);
//					System.out.print(floor2);
					System.out.println("엘리베이터 B가 " + inputFloor + "층으로 이동하였습니다.");
					B = inputFloor;
				} else {
					System.out.println("엘리베이터 A가 " + inputFloor + "층으로 이동하였습니다.");
					A = inputFloor;
				}
			}
		}
	}
}
