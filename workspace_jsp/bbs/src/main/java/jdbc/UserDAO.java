package jdbc;

import java.sql.Connection;

// DAO Data Access Object
public class UserDAO {
	
	private static UserDAO instance = new UserDAO();
	
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {};
	// user 조회
	public UserVO selectUser(Connection conn, String id) {
		// db 조회하는 부분
		
		// 결과를 리턴
		UserVO vo = new UserVO();
		return vo;
	}
}
