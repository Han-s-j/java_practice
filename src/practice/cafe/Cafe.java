package practice.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

	String name; // 카페 이름
	ArrayList<Coffee> menuList = new ArrayList<>(); // 메뉴판

	public Cafe(String name) {
		this.name = name;
	}

	// 메뉴판 출력
	void showMenu() {
		for (int i = 0; i < menuList.size(); i++) {
			System.out.println(menuList.get(i));
		}
	}

	@Override
	public String toString() {
		return "어서오세요 " + name + " 입니다.";
	}

	void addCoffee(Coffee coffee) {
		menuList.add(coffee);
	}

	// 음료 구매
	void buyCoffee(Scanner scan2) {
		for (int i = 0; i < menuList.size(); i++) {
			if (menuList.get(i).equals(scan2)); {
				System.out.println(menuList.get(i).getName() + "를" + menuList.get(i).getPrice() + "에 구매함");
			}

		}
	}
//		for(int i =0; i< menuList.size(); i++) {
//			if(menuList.get(i).equals(choiceMenu));
//				System.out.println(name + "를");
//		}

}
