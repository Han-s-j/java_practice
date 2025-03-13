package servlet01.com.future;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletMain extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// 
		System.out.println("main");
		String nm = req.getParameter("nm");	//요청받은 내용에서 nm값 가져오기
		System.out.println(nm);
		res.setContentType("text/html; charset=utf-8");
		res.setCharacterEncoding("utf-8");
		PrintWriter out = res.getWriter();
		out.println("<script>");
		out.println("alert('" + nm + "님 반가워요 ^^');");
		out.println("</script>");

		
	}

	
}
