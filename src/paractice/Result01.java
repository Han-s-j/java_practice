package paractice;

public class Result01 {
	
	public static void main(String[] args) {
		/*
		 * q. 1 사용자로 부터 국어, 영어, 수학 점수를 각각 입력받아 ~~~~..
		 * 정수로 받으면 소수점이 잘림
		 */
		// 정수 나눗셈(int)
		int a = 7;
		int b = 3;
		int intResult = a/b;
		System.out.println("정수 나눗셈:" + intResult);
		
		double c = 7;
		double d = 3;
		double doubleResult = c/d;
		System.out.println("double 나눗셈" + doubleResult);
		
		//정수 나눗셈을 캐스팅
		double mixedReulst = (double)a/b;
		System.out.println("캐스팅된 나눗셈 " + mixedReulst);
		
		//ex
		System.out.println(4 / 3);	
		System.out.println(4 / 3.0);
		
		int intResult2 = (int) (c/d);
		System.out.println(intResult2);
		
		System.out.printf("결과: %.2f %n", mixedReulst);
	}
	
}
