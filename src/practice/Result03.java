package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// 문제 3번 상황1 까지 했습니다. 더 공부하겠습니다...ㅜㅜ
public class Result03 {

	public static void main(String[] args) {
//		Q.01
//		로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 오름차순으로 출력하
//		는 makeLotto() 만들어주세요 (로또 번호는 중복이 없습니다.)
//		Q.02
//		사용자 희망번호를 매개변수로 전달받기 (중복X, 최대 6개)
//		나머지 숫자는 랜덤 번호로 생성 후 출력		
		String[] numArr = {"1","2"};
//		String[] numArr = new String[0];
		ArrayList<Integer> weekLotto = makeLotto();
		
		System.out.println("======== 🍀행운의 로또번호 생성기 입니다. ========");
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 값이 있으면 'y', 전체 자동으로 선택하려면 'n'을 선택하세요>>>");
		String choice = scan.nextLine();
		if (choice.equals("n")) {
			weekLotto = makeLotto();
		} else if (choice.equals("y")) {
			System.out.println("번호를 한칸씩 띄어서 입력해주세요 최대 6개");
			Scanner scan2 = new Scanner(System.in);
			String userInput = scan2.nextLine();
//			numArr = Add(userInput);
			weekLotto = makeLotto(numArr);
		}
		System.out.println("이번주 행운의 번호는 ❤");
		System.out.println(weekLotto.toString());
		System.out.println("GOOD LUCK ❤");
	}

	// 1~45까지 랜덤 숫자 6개를 중복없이 오름차순으로 출력하는 makeLotto()
	public static ArrayList<Integer> makeLotto() {
		Set<Integer> lotto = new HashSet<>();
		// 1 ~ 45 사이의 랜덤값 6개 생성
		while (lotto.size() < 6) {
			int num = (int) ((Math.random() * 45) + 1);
			lotto.add(num);
		}
		ArrayList<Integer> RamdomLotto = new ArrayList<>(lotto);
		Collections.sort(RamdomLotto);
		return RamdomLotto;
	}
	// 사용자 희망번호 최대 6개를 매개변수로 전달받아 나머지 숫자를 1~45까지로 생성 후
	// 오름차순으로 출력하는 makeLotto(String [] strArr)
	public static ArrayList<Integer> makeLotto(String[] strArr) {
		Set<Integer> lotto = new HashSet<>();
		// 전달받은 길이만큼 int로 변경 후 생성
		for (int i = 0; i < strArr.length; i++) {
			int inputnum2 = Integer.parseInt(strArr[i]);
			// System.out.println(inputnum2);
			lotto.add(inputnum2);
			// 1 ~ 45 사이의 랜덤값 6개 생성
			while (lotto.size() <= 6 - strArr.length) {
				int num = (int) ((Math.random() * 45) + 1);
				lotto.add(num);
			}
		}
		ArrayList<Integer> RamdomLotto = new ArrayList<>(lotto);
		Collections.sort(RamdomLotto);
		return RamdomLotto;
	}

}
