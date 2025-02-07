package ch10_extens_interface.papacar;

public class GasCar implements Vehicle {		//해당 인터페이스를 구현하는 클래스이기 때문에 implements

	@Override
	public void start() {
		System.out.println("부릉 부르릉~");
	}

	@Override
	public void stop() {
		System.out.println("..탈 탈..탈");

	}

}
