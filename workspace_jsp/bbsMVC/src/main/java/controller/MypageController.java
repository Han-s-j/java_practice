package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserService;
import model.UserVO;

@WebServlet("/mypage.do")
public class MypageController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 세션 체크 후 없으면 login.do 리다이렉트
		String userId = (String) req.getSession().getAttribute("userId");
		// 			  있으면 mypage.jsp
		if(userId != null) {
			UserService service = UserService.getInstance();
			UserVO vo = service.userInfo(userId);
			req.setAttribute("user", vo);
			req.getRequestDispatcher("/WEB-INF/view/mypage.jsp").forward(req, resp);
		// 세션 체크 후 없으면 login.do 리다이렉트
		}else {
			resp.sendRedirect("login.do");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. id, nm을 받아서 수정
		//2. message 전달 mypage.jsp로 리턴이 1이면 수정되었습니다.
		UserVO vo = new UserVO();
		vo.setUserId(req.getParameter("userId"));
		vo.setUserNm(req.getParameter("userNm"));
		UserService service = UserService.getInstance();
		service.updateUser(vo);
		vo = service.userInfo(vo.getUserId());
		req.setAttribute("user", vo);
		req.setAttribute("message","수정되었습니다.");
		System.out.println("Message in doPost: " + req.getAttribute("message"));
		
		req.getRequestDispatcher("/WEB-INF/view/mypage.jsp").forward(req, resp);
	}
}
