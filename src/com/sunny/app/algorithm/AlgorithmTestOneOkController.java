package com.sunny.app.algorithm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.algorithm.dao.AlgorithmDAO;
import com.sunny.app.algorithm.dto.AlgorithmDTO;

public class AlgorithmTestOneOkController implements Execute{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	AlgorithmDTO algorithmDTO = new AlgorithmDTO();
	AlgorithmDAO algorithmDAO = new AlgorithmDAO();
	
	
}
