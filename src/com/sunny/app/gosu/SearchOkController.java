package com.sunny.app.gosu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.gosu.dao.GosuDAO;
import com.sunny.app.question.dao.QuestionDAO;
import com.sunny.app.question.dto.QuestionDTO;
import com.sunny.app.user.dto.UserDTO;

public class SearchOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		GosuDAO gosuDAO = new GosuDAO();
		List<UserDTO> gosus = gosuDAO.selectAll();
		
		req.setAttribute("searchGosu", gosus);
		req.getRequestDispatcher("/app/gosu/search.jsp").forward(req, resp);
		
		
	}

}
