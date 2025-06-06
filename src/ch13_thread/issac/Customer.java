package ch13_thread.issac;

public class Customer extends Thread{
	
	private Issac issac = Issac.getInstance();
	private String name;
	private int count;
	
	public Customer(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	@Override
	public void run() {
		System.out.println(name + "주문!");
		issac.buyToast(name, count);
	}
}
