package com.sunny.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.user.dao.UserDAO;

public class MyPageOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     UserDAO userDAO = new UserDAO();
	      HttpSession session = req.getSession();
	      Integer userNumber = (Integer)session.getAttribute("userNumber");
	      if(userNumber == null) {  req.getRequestDispatcher("/user/login.us").forward(req, resp);}
	      
//			 userNumber로 받아와야 할 것은 무엇이지?
//	         userDAO에서 등급, 닉네임, 게시물수, 팔로워수, 팔로잉수, 한줄소개코멘트, 프로필사진, 내가쓴글리스트, 내가 질문한 리스트? 식고수인경우질문리스트
	      req.getRequestDispatcher("/app/user/myPage.jsp").forward(req, resp);
	      
	}

}
