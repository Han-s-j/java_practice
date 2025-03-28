package jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	private String driver;
	private String url;
	private String id;
	private String pw;
	private int maxConn ;
	private static ConnectionFactory instance = new ConnectionFactory();
	
	public static ConnectionFactory getInstance() {
		return instance;
		
	}
	private ConnectionFactory() {
		Properties prop = new Properties();
		InputStream reader = getClass().getClassLoader()
				.getResourceAsStream("config/db.properties");
		try {
			prop.load(reader);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			id = prop.getProperty("id");
			pw = prop.getProperty("pw");
			maxConn = Integer.parseInt(prop.getProperty("max"));
			Class.forName(driver);
			System.out.println(id+"|"+pw+"|"+url+"|"+driver+"|"+maxConn);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url,id,pw);
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","java","oracle");
		return conn;
	}
	public static void main(String[] args) {
		ConnectionFactory test = ConnectionFactory.getInstance();
		try {
			Connection conn = test.getConnection();
			System.out.println("접속됨");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public int getMaxConn() {
		return maxConn;		// 접속자 최대 4명까지
	}
}
