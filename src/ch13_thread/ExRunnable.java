package ch13_thread;

/**
 * class Name   : ExRunnable
 * Author       : SJ
 * Created Date : 2025. 2. 12.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 스레드 사용법2. Runnable 인터페이스 구현
 */
public class ExRunnable implements Runnable{ // ctrl + 1
	int num;
	String name;
	public ExRunnable(int num, String name) {
		this.name = name;
		this.num = num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = num; i <= num + 5; i ++) {
			System.out.println(name+ " " + i);
			//시간 차를 두기 위해
			try {
				Thread.sleep(500); //0.5초 딜레이
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
