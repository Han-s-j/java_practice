package ch05_conditional;

/**
 * class Name   : ConditionalMain
 * Author       : SJ
 * Created Date : 2025. 1. 23.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 조건문 if
 */
public class ConditionalMain {
	public static void main(String[] args) {
		int score = 85;
		String grade = ""; // 빈 이유: 여러 조거문을 사용하기 위해서
		// 조건문이 if문 하나일 수도 else if, else를 추가하여 여러 개 일 수도 있다. 그래서 순서가 중요하다
		// if 문은 해당 조건이 true 이면 {} 해당영역으로 진입
		if(score >= 90) {
			grade = "A";
		}else if (score >= 80) { //조건이 더 있다면 else if 추가
			grade = "B";
		}
		else { // 그 밖에 모든 상황
			grade = "C";
		}
		System.out.println(score + "는" + grade);
		
		//변수의 scope
		int price = 3000;
		int myMoney = 1000;
		if (price > myMoney) {
			System.out.println("돈이 부족합니다...");
			//String msg = "돈이 부족합니다..."; {} 안에 있는 변수는 해당 {} 안에서만 쓸 수 있다. 공통으로 쓰려면 밖에 쓰기
		}else {
			System.out.println("돈이 충분합니다.");
		}
		//System.out.println(msg);
		
		// 중첩 if 가능 if문 안에 if문
		// 조건 1: 이름은 1글자 이상
		// 조건 2: 전화번호는 10 or 11 자리
		// 조건1이 만족하지 않으면 가입 실패
		String nm = "닉";
		String phone = "0101234567";
		if(nm.length() >=1) {
			//조건2 || <-- or '또는'의 의미
			 if(phone.length() == 10 || phone.length() ==11) {
				 System.out.println("환영 합니다.");
			 }else {
				 System.out.println("가입 실패!!");
			 }
		}else {
			System.out.println("가입 실패!!");
			
		}
	}
}
