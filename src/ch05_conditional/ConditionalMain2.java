package ch05_conditional;

/**
 * class Name   : ConditionalMain2
 * Author       : SJ
 * Created Date : 2025. 1. 24.
 * Version      : 1.0
 * Purpose      : [목적을 작성하세요]
 * Description  : switch문
 */
public class ConditionalMain2 {
	
	private static void main(String[] args) {
		// switch 문은 단순 값을 매칭하는 경우 사용
		int num =1;
		switch(num) {
		case 0 :
			System.out.println("수강등록");
			break;
		case 1 :
			System.out.println("기초 프로그래밍");
			break;
		case 2 :
			System.out.println("취업 관련");
			break;
		default :
			System.out.println("종료");
			
		}
	}
}
