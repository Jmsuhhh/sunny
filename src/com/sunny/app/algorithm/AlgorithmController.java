package com.sunny.app.algorithm;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.algorithm.dao.AlgorithmDAO;
import com.sunny.app.algorithm.dto.AlgorithmDTO;
import com.sunny.app.plant.dto.PlantDTO;

public class AlgorithmController implements Execute{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[] selects = { "selectOne", "selectTwo", "selectThree", "selectFour", "selectFive" };

		// 세션에서 5개의 값을 가져옵니다.
		String[] selectValues = new String[5];
		for (int i = 0; i < 5; i++) {
			selectValues[i] = (String) req.getSession().getAttribute(selects[i]);
			if (selectValues[i] == null || selectValues[i].equals("")) {
				// 세션에 저장된 값이 없으면 에러 페이지로 이동합니다.
				req.getRequestDispatcher("error.jsp").forward(req, resp);
				return;
			}
		}

		// 가져온 5개의 값을 이용하여 적절한 plant_name과 plant_content를 찾아옵니다.
		AlgorithmDTO algorithmDTO = new AlgorithmDTO();
		AlgorithmDAO algorithmDAO = new AlgorithmDAO();
		
		List<PlantDTO> plants = algorithmDAO.selectPlantsByAlgorithmInput(algorithmDTO);

		// 찾아온 plant_name과 plant_content를 request 객체에 저장합니다.
		req.setAttribute("plantName", plants.get(0).getPlantName());
		req.setAttribute("plantContent", plants.get(0).getPlantContent());

		// 결과 페이지로 이동합니다.
		req.getRequestDispatcher("/result.jsp").forward(req, resp);
	}

}
		
