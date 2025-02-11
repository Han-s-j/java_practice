package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.println("메인 시작");
		int[] arr = { 1, 2, 3 };
		String str = null;
		try {
//			System.out.println(arr[3]);	//오류 발생
			str.length();
			// catch 블럭을 탐
			// 특정 오류(인덱스) 에 대한 내용 추적
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 문제!!!");
			// 특정 오류(null) 에 대한 내용 추적
		} catch(NullPointerException e ) {
			System.out.println("널이다.....");
			// 모든 오류 추적
		} catch (Exception e) {
//			System.out.println(e.toString());
			e.printStackTrace();//예외 발생코드에 대해 추적한 내용 출력
			// 무조건 처리해야 할 것이 있을 때 finally까지 사용
		}finally {
			System.out.println("오류가 나도 안 나도 여긴 처리 됨");
		}
		
		// throws 메소드 호출하는 쪽에서 예외처리해야 함.
//		ExMethod.dateMillSec2("2024/01/01"); ctrl + 1 -> catch
		try {
			ExMethod.dateMillSec("2024/01/01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 예외처리가 되어있는 메소드
		ExMethod.dateMillSec2("2024/01/01");
		
		try {
			ExMethod.PrinterName("");
		} catch (BizException e) {
			System.out.println(e.getErrCode());	//BizException 클래스 메소드
			System.out.println(e.getMessage()); // 부모(Exception) 메서드
		}
		try {
			ExMethod.PrinterName("길");
		} catch (BizException e) {
			e.printStackTrace();
		}
		System.out.println("메인 종료");
	}
}
