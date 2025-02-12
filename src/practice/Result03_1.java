package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Result03_1 {

	public static void main(String[] args) {
		String [] userNum = {"2","12"};
		System.out.println(makeLotto(userNum));
	}
	public static ArrayList<Integer> makeLotto(){
		ArrayList<Integer> numbers = new ArrayList<>();
		// 비어있는 메소드 호출
		String [] arr = new String[0];
		numbers = makeLotto(arr);
		return numbers;
	}
	public static ArrayList<Integer> makeLotto(String [] arr){
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < arr.length; i ++) {
			numbers.add(Integer.parseInt(arr[i]));
		}
		while (numbers.size()<6) {
			int lotto = (int) (Math.random()* 45 +1);
			boolean isEqual = false;
			for(int i = 0; i < numbers.size(); i ++) {
				if(lotto == numbers.get(i)) {
					isEqual = true;
					break;
				}
			}
			if(!isEqual) {
				numbers.add(lotto);
			}
		}
		Collections.sort(numbers);
		return numbers;
	}
}
