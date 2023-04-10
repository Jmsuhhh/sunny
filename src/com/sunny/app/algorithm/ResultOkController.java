package com.sunny.app.algorithm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.algorithm.dao.AlgorithmDAO;
import com.sunny.app.algorithm.dto.AlgorithmDTO;
import com.sunny.app.plant.dto.PlantDTO;

public class ResultOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
		
		
		
		
		
		
		
		req.getRequestDispatcher("/app/algorithm/result.jsp").forward(req, resp);
	}
}
