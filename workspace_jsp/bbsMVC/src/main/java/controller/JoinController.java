package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserService;
import model.UserVO;

@WebServlet("/join.do")
public class JoinController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 화면이동 join.jsp로
		
		String pathString = req.getServletPath();
		req.getRequestDispatcher("/WEB-INF/view/join.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 회원 가입
		UserService service = UserService.getInstance();
		UserVO vo = new UserVO();
		vo.setUserId(req.getParameter("userId"));
		vo.setUserPw(req.getParameter("userPw"));
		vo.setUserNm(req.getParameter("userNm"));
		int cnt = service.insertUser(vo);
		// insertUser 리턴이 1 이면 login.jsp로 포워드
		if(cnt >0) {
			req.setAttribute("message","회원가입이 정상 처리 되었습니다.");
			req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, resp);
			// 아니면 join.do로 리다이렉트
		}else {
			resp.sendRedirect("join.do");
		}

	}

}
