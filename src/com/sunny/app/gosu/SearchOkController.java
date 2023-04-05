package com.sunny.app.gosu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.gosu.dao.GosuDAO;
import com.sunny.app.user.vo.UserVO;

public class SearchOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		GosuDAO gosuDAO = new GosuDAO();
		List<UserVO> gosus = gosuDAO.selectAll();
		
		req.setAttribute("gosus", gosus);
		
		req.getRequestDispatcher("/app/gosu/search.jsp").forward(req, resp);
		
		
	}

}
