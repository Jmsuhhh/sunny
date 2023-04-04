package com.sunny.app.user.file;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.user.file.dao.UserFileDAO;


public class UserFileDeleteController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("delete컨트롤러들어옴");
		UserFileDAO userFileDAO = new UserFileDAO();
		HttpSession session = req.getSession();
		Integer userNumber = (Integer)session.getAttribute("userNumber");
		
		if(userFileDAO.select(userNumber)>0) {
			userFileDAO.delete(userNumber);	
		}
		
		

	}

}
