package ch14_jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMain {
	public static void main(String[] args) {
		// db연결 객체
				Connection conn = null;
				// SQL 명령
				PreparedStatement ps = null;
				// 쿼리 결과
				ResultSet rs = null;
				// 1.드라이버 로딩
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					//System.out.println("드라이버 로딩 성공");
				} catch (ClassNotFoundException e) {
					System.out.println("실패");
					e.printStackTrace();
					System.exit(0); // 프로그램 종료
				}
				// 2. db연결
				String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
				String db_id = "java";
				String db_pw = "oracle";
				try {
					conn = DriverManager.getConnection(url, db_id, db_pw);
					//System.out.println("접속 성공");
					StringBuffer query = new StringBuffer();
					query.append(" SELECT info_no");
					query.append("      ,nm");
					query.append("      ,email");
					query.append("      ,hobby");
					query.append(" FROM tb_info");
					query.append(" WHERE nm LIKE ?||'%' ");
					ps = conn.prepareStatement(query.toString());
//					ps.setString(1, "이");
//					rs = ps.executeQuery();		// 쿼리문 실행!
					
					while(true) {
						System.out.println("학사 정보 시스템입니다.");
						Scanner sc = new Scanner(System.in);
						System.out.println("1.조회|2.수정|3.추가(q:종료)");
						String msg = sc.nextLine();
						if(msg.equalsIgnoreCase("q")) {
							System.out.println("학서 정보 시스템 종료");
							break;
						}
						//1.조회는 이름을 입력받아서(like검색) 다 출력
						else if(msg.equalsIgnoreCase("1")) {
						Scanner sc2 = new Scanner(System.in);
						System.out.println("조회할 학생의 이름을: ");
						String inputNm = sc2.nextLine();
						ps = conn.prepareStatement(query.toString());
						ps.setString(1, inputNm);
						rs = ps.executeQuery();
						// 조회결과 
						while(rs.next()) {
							int no = rs.getInt("info_no");
							String nm = rs.getString("nm");
							String email = rs.getString("email");
							String hobby = rs.getString("hobby");
							System.out.println(no+"|"+nm+"|"+email+"|"+hobby);
						}
						
						}
						//2.수정은 취미를 입력받아서 변경되도록 
						else if (msg.equalsIgnoreCase("2")) {
						Scanner sc2 = new Scanner(System.in);
						System.out.println("수정 학생의 이름을:");
						String inputnm2 = sc2.nextLine();
						Scanner sc3 = new Scanner(System.in);
						System.out.println("수정 취미를 입력:");
						String inputhb = sc2.nextLine();
						query.append(" UPDATE tb_info");
						query.append(" SET hobby =? ");
						query.append(" WHERE nm =? ");
						ps = conn.prepareStatement(query.toString());
						ps.setString(1,inputhb);
						ps.setString(2,inputnm2);
						int cnt = ps.executeUpdate(); // 오류
						if(cnt >0) {
							System.out.println(cnt + "건 수정됨.");
							conn.commit();
						}else {
							System.out.println("대상건이 없음.");
							conn.rollback();
						}
						}
					}

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					//System.out.println("접속 종료");
					if (conn != null) {try {rs.close();} catch (SQLException e) {}}
					if (conn != null) {try {ps.close();} catch (SQLException e) {}}
					if (conn != null) {try {conn.close();} catch (SQLException e) {}}
					{
						}
					}		
	}
}
