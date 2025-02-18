package practice.cafe;

import java.util.Scanner;

public class CafeMain {
	public static void main(String[] args) {

		Cafe myCafe1 = new Cafe("스타벅스");
		myCafe1.addCoffee(new Coffee("아메리카노", 5000));
		myCafe1.addCoffee(new Coffee("카푸치노", 6000));
		myCafe1.addCoffee(new Coffee("오곡라떼", 7000));
		Cafe myCafe2 = new Cafe("아카");
		myCafe2.addCoffee(new Coffee("아메리카노", 2500));
		myCafe2.addCoffee(new Coffee("바닐라라떼", 3000));
		myCafe2.addCoffee(new Coffee("아이스티", 3500));

		while (true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 방문 | 2. 아카 방문 | 3. 집으로..");
			System.out.print(">>>");

			Scanner scan = new Scanner(System.in);
			String choiceAct = scan.nextLine();

			switch (choiceAct) {
			case "1":
				System.out.println(myCafe1);
				myCafe1.showMenu();
				myCafe1.buyCoffee(scan);
				break;
			case "2":
				System.out.println(myCafe2);
				myCafe2.showMenu();
				myCafe2.buyCoffee(scan);
				break;
			case "3":
				System.out.println("집으로 갑니다..");
				break;
			}
			if(choiceAct.equals("3")) {
				break;
			}
		}
	}
}
