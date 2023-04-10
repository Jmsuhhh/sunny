package com.sunny.app.algorithm;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.algorithm.dao.AlgorithmDAO;
import com.sunny.app.algorithm.dto.AlgorithmDTO;

public class TestFiveOkController implements Execute{

	 @Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 AlgorithmDTO algorithmDTO = new AlgorithmDTO();
			AlgorithmDAO algorithmDAO = new AlgorithmDAO();
			HttpSession session = req.getSession();
			List<AlgorithmDTO> result = algorithmDAO.algorithmResult(algorithmDTO);

			algorithmDTO.setSelectFive(req.getParameter("selectFive"));

			String selectFive = req.getParameter("selectFive");
			System.out.println(req.getParameter("selectFive"));

			// 받아온 값을 적절히 처리합니다.

			// 처리 결과를 session에 저장합니다.
			session.setAttribute("selectFive", selectFive);

			// testOne.jsp로 selectOne 값을 전달합니다.
			req.getRequestDispatcher("/app/algorithm/testFive.jsp").forward(req, resp);

		}
	}