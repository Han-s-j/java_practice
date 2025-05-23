package ch02_varible;


/**
 * class Name   : VariableName
 * Author       : SJ
 * Created Date : 2025. 1. 22.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 변수 타입
 */
public class VariableName {
	
	public static void main(String[] args) {
		/*
		 * 여러 줄 주석
		 * 
		 * 변수, 클래스 명명 규칙
		 * 프로젝트, 클래스명 이름은 앞에 대문자를 씀(JavaStudy)
		 * 패키지(폴더) 이름은 전부 소문자로 작성
		 * 필요하면 단어 사이에 언더바(_)를 넣어서 사용(ch02_variable)
		 * 
		 * 변수명(or 함수명[메소드])
		 * java는 카멜표기법(Camel, 낙타 표기법이라 함 울룩불룩)
		 * 첫글자는 소문자, 다음 단어들은 대문자로 시작
		 * ex) todayIsHappy
		 * 
		 * 나중에 배울 python은 스네이크 표기법 사용
		 * ex) today_is_happy
		 * 
		 */
		 // [데이터 타입] [변수명]
		int todayIsHappy = 0;
		todayIsHappy = todayIsHappy + 10;
		System.out.println(todayIsHappy);
		
		//Debug 왼쪽 파란색 라인 더블클릭해서 멈출 곳 지정 F5,F6,,F8:취소
	}
}
