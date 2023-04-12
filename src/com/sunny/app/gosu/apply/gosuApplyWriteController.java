package com.sunny.app.gosu.apply;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.gosu.apply.dao.GosuApplyDAO;

public class gosuApplyWriteController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		Integer userNumber = (Integer)session.getAttribute("userNumber");
		String path = null;
		
//		session에 user number 확인 후 없으면 로그인 페이지 경로처리하기
		if(userNumber == null) {
			path = "로그인페이지";
		}else {
			path = "/app/apply/gosuApplyWrite.jsp";
		}
		
		req.getRequestDispatcher(path).forward(req, resp);
	}

}
