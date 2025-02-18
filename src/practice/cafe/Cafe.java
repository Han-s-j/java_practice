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
			System.out.println(i+1 +". " +menuList.get(i));
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
	void buyCoffee(Scanner scan) {
		System.out.println("메뉴를 선택해주세요: ");
		int userMenu = scan.nextInt();
		if (userMenu >= 1 && userMenu <= menuList.size()) {
			System.out.println(
					menuList.get(userMenu - 1).getName() + "를 " + menuList.get(userMenu - 1).getPrice() + "원에 구매했습니다.");
		}

	}
}
