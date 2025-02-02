package practice;

import java.util.Scanner;

public class Result02 {

	// Q.2 업다운 게임
	// 1 ~ 50 사이의 랜덤 정수 생성
	// 기회는 5번!
	public static void main(String[] args) {
//	    System.out.println("== 난수 발생 == ");
//	   for(int i = 0 ; i < 10; i++) {
//		   System.out.println(Math.random());// 난수 생성 메소드 0 ~ 1 사이 실수
//	   }
//	   int randInt =  (int) (Math.random() * 50 + 1);  // 1 ~ 5 사이 정수
//	   System.out.println(randInt);
		System.out.println("== 업다운 게임을 시작합니다. == ");
		System.out.println("1 ~ 50 중 랜덤 숫자 하나를 맞춰보세요.");
		System.out.println("기회는 5번 입니다.");
		System.out.println("=========================");
		int randInt = (int) (Math.random() * 50 + 1); // 1 ~ 5 사이 정수
		//System.out.println(randInt);
		Scanner scan = new Scanner(System.in);
		
		int chance = 5;		//기회 5번
		while (chance >= 1) {
			System.out.print("숫자를 입력해주세요.");
			String inputnum = scan.nextLine();		
			int num = Integer.parseInt(inputnum);	//문자열 -> 정수 변경
			if (randInt == num) {					//랜덤숫자 == 입력숫자 
				System.out.println("정답입니다.");
				break;								//종료
			} else if (randInt > num) {				//랜덤숫자 > 입력숫자
				chance--;							//기회 줄어들기
				if (chance == 0) {					//기회가 0일 때
					break;							//종료
				}
				System.out.println("업!! 기회가 " + chance + "번 남았습니다.");

			} else {								//나머지
				chance--;							//기회 줄어들기
				if (chance == 0) {					//기회가 0일 때
					break;							//종료
				}
				System.out.println("다운!! 기회가 " + chance + "번 남았습니다.");
			}
		}
		if (chance == 0) {							//기회가 0일 때
			System.out.println("실패하였습니다. 정답은" + randInt + "입니다.");
		}
	}
}