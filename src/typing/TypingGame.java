package ch09_class.typing;


import java.util.ArrayList;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) { // 값을 던져주면 args에 입력 됨
		int num;
		if (args.length > 0) {
			num = Integer.parseInt(args[0]); // 실행시 입력값있으면
		} else {
			num = Dictionary.OPTION_STUDENT; // public static
		}
		System.out.println(num);
		System.out.println(" == typing Game == (0.name, 1.coding, 2.random)");
		Scanner scan = new Scanner(System.in);
		ArrayList<String> wordList = Dictionary.makeWordList(num);
		// 현재 시간 가져오기
		long before = System.currentTimeMillis(); // UDT기준 밀리초
		int s = 0; // 맞춘
		int f = 0; // 틀린
		int cnt = 0; // 횟수
		// 1. wordList 단어 중 랜덤하게 선택하여 출력
		while (true) {
			cnt++;
			int idx = (int) (Math.random() * wordList.size());
			System.out.println(wordList.get(idx));
			System.out.print(">>>");
			String input = scan.nextLine();
			// 2. 입력 단어와 문제 단어가 일치하면 삭제 s 증가
			if (wordList.get(idx).equals(input)) {
				wordList.remove(idx);
				s++;
				// 3. 틀리면 f 증가
			} else {
				f++;
			}
			if (cnt == 2) {
				System.out.println(cnt + "회 시도");
				System.out.printf("s:%d f:%d", s, f);
				break;
			}
			// 4. 게임이 끝나면 끝난시간과 before를 사용하여 소요시간 구하여 출력(총 맞춘, 틀린것도)
		}

			long after = System.currentTimeMillis();
			long diff = after - before; // 소요시간
			double result = diff / 1000.0; // 초로 변환
			System.out.println(result + "초 걸렸습니다");
	}
}
