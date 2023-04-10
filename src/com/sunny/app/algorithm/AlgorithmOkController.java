package com.sunny.app.algorithm;

import java.awt.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.Execute;
import com.sunny.app.algorithm.dto.AlgorithmDTO;
import com.sunny.app.algorithm.vo.AlgorithmVO;
import com.sunny.app.plant.dto.PlantDTO;

public class AlgorithmOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// MyBatis를 이용하여 DB에서 select_one 정보 조회
				SqlSession session = null;
				try {
					AlgorithmVO algorithmVO = new AlgorithmVO();
					AlgorithmDTO algorithmDTO = new AlgorithmDTO();
					algorithmDTO.getAlgorithmResult(); // select_one 값 가져오기
					algorithmVO = session.selectOne("AlgorithmDAO.selectAlgorithmVO", algorithmDTO);
					req.setAttribute("algorithmVO", algorithmVO);
					req.getRequestDispatcher("/WEB-INF/views/algorithm/testOne.jsp").forward(req, resp);
				} finally {
					session.close();
				}
			}
		}