package practice.cafe;

public class Cafe extends Coffee{

	public Cafe(String korName, String engName, String price) {
		super(korName, engName, price);
	}
	
	void cafeMenu() {
		System.out.println("1. [" + KorName + ":" + price + "]");
		System.out.println("2. [" + KorName + ":" + price + "]");
		System.out.println("3. [" + KorName + ":" + price + "]");
		
	}
	
	
}
