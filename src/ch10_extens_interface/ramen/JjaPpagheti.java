package ch10_extens_interface.ramen;

public class JjaPpagheti extends Ramen{			//추상 클래스 상속받음
	
	
	public JjaPpagheti(String nameString, int price) {
		super(nameString, price);
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 물은 버리고 스프를 비벼드세요.");
		System.out.println("tip.스프를 비빌 때는 불을 끄고 하시는 게 맛있음.");
		
	}
	

}
