package com.sunny.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.gosu.dao.GosuDAO;
import com.sunny.app.question.dao.QuestionDAO;
import com.sunny.app.question.vo.QuestionVO;

public class myPageQuestionListController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		QuestionDAO questionDAO = new QuestionDAO();
		GosuDAO gosuDAO = new GosuDAO();
		
		int gosuNumber=0;
		int userNumber =(Integer) session.getAttribute("userNumber");
		System.out.println(userNumber);

		QuestionVO questions = new QuestionVO();
		
		gosuNumber = gosuDAO.getGosuNumber(userNumber);
			
		System.out.println(gosuNumber);
		
	}

}
