package ch07_array;

public class ArrayEx2 {
	public static void main(String[] args) {
		// Q. 윌리를 찾아라!
		// findWally 문자열에 '월리'가 총 몇 개 있는지 출력하시오
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		
		
		int fixLength = 2;
		int strArraySize = (int) Math.ceil((double) findWally.length() / fixLength);
		String[] subFindWally = new String[strArraySize];

		int index = 0;
		for (int startIndex = 0; startIndex < findWally.length(); startIndex += fixLength) {
			subFindWally[index++] = findWally.substring(startIndex,
					Math.min(startIndex + fixLength, findWally.length()));
			System.out.println(subFindWally[2]);
			// 0. 반복문 만들기
			// 1. 문자열 자르기 2개씩
			// 2. 배열 0 자리 "월" 찾기
			// 3. 같으면 카운트
			int cnt = 0;
			for (int i = 0; i < findWally.length(); i++) {
				if ((subFindWally[i] == "월리")) {
					cnt++;
				}
			} 
			System.out.println("월리는 총:" + cnt);

		}
	}
}
