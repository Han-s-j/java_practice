package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Result03 {

	public static void main(String[] args) {
//		Q.01
//		로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 오름차순으로 출력하
//		는 makeLotto() 만들어주세요 (로또 번호는 중복이 없습니다.)

		ArrayList<Integer> weekLotto = null;
		weekLotto = makeLotto();
		System.out.println(weekLotto.toString());
	}

	public static ArrayList<Integer> makeLotto() {
		Set<Integer> lotto = new HashSet<>();
		
		// 1 ~ 45 사이의 랜덤값 6개 생성
		while (lotto.size() < 6) {
			int num = (int) ((Math.random() * 45) + 1);
			lotto.add(num);
		}
		ArrayList<Integer> myLotto = new ArrayList<>(lotto);
		Collections.sort(myLotto);
		return myLotto;
		
	}
}
