package ch03_system;

import java.util.Scanner;

public class SystemEx {
	public static void main(String[] args) {
		/* 1.사용자의 이름:나이를 입력받아
		 * 이름 출력
		 * 나이를 출력 하세요
		 * 
		 * 2.사용자의 이름: 나이를 입력받아
		 * 변수에 각각 할당 후
		 * 해당 변수로 사용자의 이름, 나이를 출력하시오
		 * 
		 * 단) 이름의 길이가 달라질 수 있음.
		 * hint (:) 콜론을 기준으로 앞이 이름, 뒤가 나이
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("이름:나이를 입력하세요=");
		String userInputString = scan.nextLine();
		System.out.println("===== 1번 문제 =====");
		System.out.println(userInputString);
//		System.out.println(userInputString.substring(0, 3));
//		System.out.println(userInputString.substring(4));
		// 2번
		System.out.println("이름:나이를 입력하세요=");
		String userInputString2 = scan.nextLine();
		//":"의 자리 찾기
		int point = userInputString2.indexOf(":");
		//System.out.println(point);
		// 이름
//		String userName = userInputString2.substring(0,length()-4);
//		String userName = userInputString2.substring(userInputString2.substring(0),userInputString2.lastIndexOf("4"));
//		System.out.print(userName);
		String name = userInputString2.substring(0,point);

		System.out.println(name);
		// 나이
//		String userAge = userInputString2.substring(length()-1);
//		System.out.print(userAge);
		//String userAge = userInputString2.substring(userInputString2.length()-2, userInputString2.length());
		//System.out.print(userAge);
		//
//		System.out.printf("입력하신 이름은 :",userName,"나이는: ",
//				userAge);
		String age = userInputString2.substring(point+1);
		System.out.println(age);
		// 콘솔입력은 String 타입
		// 숫자형태로 사용하려면 casting 형변환 해야함.
		int userAge = Integer.parseInt(age);
		System.out.println("입력하신 이름은:" + name + " 나이는:"+ age);
		System.out.println("입력하신 이름은:" + name + " 나이는:"+ userAge);
		
	}
		
//	System.out.printf("입력하신 이름은 :",userName,"나이는: ", userAge);
// String str = "01011112222"; System.out.println(str.substring(str.length()-3, str.length())); // 결과 222

}