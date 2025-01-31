package ch06_method;

public class Methodx {
	public static void main(String[] args) {
		// 이름, 국어점수, 수학점수, 영어점수를 입력받아
		// 평균과 등급을 출력하는 메소드를 작성하시오

		// input : String, int, int, int
		// output : 없음
		// method name : makeCard
		// 등급은 90이상:A, 80이상:B 나머지 C
		// 출력) xxx님의 평균은 95.0으로 A등급 입니다.
		// 함수호출 예
		makeCard("팽수", 100, 90, 100);
	}

	public static void makeCard(String name, int kor, int math, int eng) {
		double average = (kor + math + eng) / 3;
		String grade = "C";
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) { // 조건이 더 있다면 else if 추가
			grade = "B";
	}
//		System.out.println(name + "님의 평균은 " + average + "으로 " + grade +"등급 입니다.");
		System.out.printf("%s 님의 평균은 %.1f 으로 %s 등급 입니다.", name, average, grade);
		
		}
		
	}
