package com.sunny.app.algorithm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.admin.dao.AdminDAO;
import com.sunny.app.admin.dto.AdminDTO;
import com.sunny.app.algorithm.dao.AlgorithmDAO;
import com.sunny.app.algorithm.dto.AlgorithmDTO;
import com.sunny.app.algorithm.vo.AlgorithmVO;
import com.sunny.app.plant.dto.PlantDTO;
import com.sunny.app.util.AdminUtils;

public class TestOneOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		AlgorithmDTO algorithmDTO = new AlgorithmDTO();
		AlgorithmDAO algorithmDAO = new AlgorithmDAO();
		HttpSession session = req.getSession();
		List<AlgorithmDTO> result = algorithmDAO.algorithmResult(algorithmDTO);

		
		algorithmDTO.setSelectOne(req.getParameter("selectOne"));

		String selectOne = req.getParameter("selectOne");


		
		
		
		// 처리 결과를 session에 저장합니다.
		session.setAttribute("selectOne", selectOne);

		// testOne.jsp로 selectOne 값을 전달합니다.
		req.getRequestDispatcher("/app/algorithm/testOne.jsp").forward(req, resp);

	}
}