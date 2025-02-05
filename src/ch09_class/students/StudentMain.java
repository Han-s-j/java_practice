package ch09_class.students;

import java.util.ArrayList;

public class StudentMain {
	public static void main(String[] args) {
		Student stu1 = new Student("팽수");	//new 클래스를 사용하기 위해 인스턴스화
		Student stu2 = new Student("팽순");	//new 클래스를 사용하기 위해 인스턴스화
		Student stu = new Student();
		System.out.println(stu1);
		System.out.println(stu2);
		//stu1.name; private 이기 때문에 외부 class에서 접근 불가능
		System.out.println(stu1.getName());
		stu1.setName("김팽수");				// 이름 변경
		System.out.println(stu1.getName());
		System.out.println(stu2.getName());
		
		stu1.setKor(90);
		System.out.println(stu1);
		stu1.setEng(75);
		System.out.println(stu1);
		stu1.nm();
		Student.check(); // 정적메소드 호출
//		Student.nm();  // class의 기본 메소드는 인스턴스 메소드임(인스턴스화 이후 사용가능)
		
		ArrayList<Student> classMate = new ArrayList<>();
		classMate.add(stu1);
		classMate.add(stu2);
		for(Student st : classMate) {
			System.out.println( st.getName());
		}
		
	}
}
