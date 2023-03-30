package com.sunny.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.user.dao.UserDAO;
import com.sunny.app.user.dto.UserDTO;

public class LoginOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		int userNumber = 0;
		String userId = req.getParameter("userId");
		String userPassword = req.getParameter("userPassword");
		String remember = req.getParameter("remember");
		String path = null;
		HttpSession session = req.getSession();
		
		userDTO.setUserId(userId);
		userDTO.setUserPassword(userPassword);
		
		try {
			userNumber = userDAO.login(userDTO);
			path = "/story/storyListOk.st";
			session.setAttribute("userNumber", userNumber);
		} catch (NullPointerException e) {
			path = "/user/login.us?login=fail";
//			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(remember != null) {
			Cookie cookie = new Cookie("userId", userId);
			cookie.setMaxAge(60 * 60 * 24);
			resp.addCookie(cookie);
		}
		
//		if(userNumber == -1) {
//			path = "/user/login.me";
//		} else {
//			path = "/story/storyListOk.st";
//		}
		
		resp.sendRedirect(path);
		
		
	}
}
