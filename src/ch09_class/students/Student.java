package ch09_class.students;

import ch09_class.util.UtilClass;

/**
 * class Name   : Student
 * Author       : SJ
 * Created Date : 2025. 2. 5.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : class 기초
 */
public class Student {
	//1.필드, 속성값
	//public: 공개, 프로젝트 어디서든 사용가능
	//private: 비공개, 현재 클래스 내에서만 접근 (내에서만 수정 가능)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	//2.생성자 (class는 생성자를 정의하지 않아도 무조건 클래스명의 생성자가 있음.)
	// 단축키 shift + alt + s
	public Student(String name) {	//사용할 때 이름 값 필수
		this.name = name;
		save();
	}
	public Student(String name, int kor, int eng, int math) { // 이름, 국어, 영어, 수학 필수
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student() {
	}
	
	//3.toString 출력
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}
	//4.getter, setter	public으로 외부 class에서도 접근 가능해짐
	public String getName() {	
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		setAvg();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		setAvg();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		setAvg();	// 점수 변경이 일어나면 평균계산
	}
	private void setAvg() {
									//this.kor 동일함
		this.avg = UtilClass.weRound((kor + eng + math) / 3.0, 2); //static 메서드이기 때문에 new로 호출하지 않고 사용 가능
	}
	public void nm() {
		System.out.println(name + " 입니다.");
		
	}
	private void save() {
		System.out.println(name + " 등록됨.");
	}
	public static void check() {
		System.out.println("student의 static method 클래스명.check로 호출가능");
	}
}
