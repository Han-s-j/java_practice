package ch14_jdbc;

import java.sql.Connection;

import ch14_jdbc.jdbc.ConnectionPool;

public class PoolTest {
	
	public static void main(String[] args) {
		ConnectionPool cp = ConnectionPool.getInstance();
		Connection conn1 = cp.getConnection();
		System.out.println("conn1 가져옴");
		Connection conn2 = cp.getConnection();
		System.out.println("conn2 가져옴");
		Connection conn3 = cp.getConnection();
		System.out.println("conn3 가져옴");
		Connection conn4 = cp.getConnection();
		System.out.println("conn4 가져옴");
		// 5번째 연결 요청
		new Thread(()->{
			Connection conn5 = cp.getConnection(); // 자리가 없어서 밑에 실행 건너뜀
			System.out.println("conn5을 얻었습니다!" + conn5);	// 2초 wait후  자리 반환돼서 사용 가능 -> 실행 됨 
		}).start();
		// 2초 대기
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cp.releaseConnection(conn4); // 사용 후 반환
		System.out.println("conn4 반환");
	}
}
