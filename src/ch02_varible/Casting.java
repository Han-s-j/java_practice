package ch02_varible;


/**
 * class Name   : Casting
 * Author       : SJ
 * Created Date : 2025. 1. 22.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 변환
 */
public class Casting {
	public static void msin(String[] args)  {
		// 작은 단위 -> 큰 단위 형변환은 자동
		int a = 10;
		double b = a;
		
		// 큰 단위 -> 작은 단위는 형변환해야 함
		double c = 10.5;
		int d = (int) c; // 명시적 형변환
		
		// 타입 변환
		// 정수 to 문자열
		int num = 123;
		String str = String.valueOf(num); // 문자열 타입으로
		System.out.println(str);
		
		//문자열 to 정수
		String str2 = "123";
		int num2 = Integer.parseInt(str2);
		System.out.println(num2);
	}
}
