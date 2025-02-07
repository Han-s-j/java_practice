package ch10_extens_interface.starcraft;

public class Marine extends StarUnit{
	
	public Marine() {
		
	}
	public Marine(String name, int damage, int hp, int armor) {
		super(name, damage, hp, armor);
	}
	public void stimpack() {
		System.out.println("우아아아!!");
		super.setHp(super.getHp() -10);
		super.setDamage(super.getDamage() *2);	//해당객체만 변경
	}
	@Override
	public String toString() {
		return "Marine [getName()=" + getName() + ", getDamage()=" + getDamage() + ", getHp()=" + getHp()
				+ ", getArmor()=" + getArmor() + "]";
	}

}
