package com.sunny.app.algorithm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.algorithm.dto.AlgorithmDTO;

public class LoadingOkController implements Execute {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	HttpSession session = req.getSession();
        session.getAttribute("selectOne");
        session.getAttribute("selectTwo");
        session.getAttribute("selectThree");
        session.getAttribute("selectFour");
        session.getAttribute("selectFive");

        // 세션에서 가져온 값으로 AlgorithmDTO 객체 생성
        AlgorithmDTO algorithmDTO = new AlgorithmDTO();
        
        algorithmDTO.setSelectOne(req.getParameter("selectOne"));
        algorithmDTO.setSelectTwo(req.getParameter("selectTwo"));
        algorithmDTO.setSelectThree(req.getParameter("selectThree"));
        algorithmDTO.setSelectFour(req.getParameter("selectFour"));
        algorithmDTO.setSelectFive(req.getParameter("selectFive"));

        // 다음 페이지로 전달하기 위해 request 객체에 알고리즘 DTO 객체 저장
        req.setAttribute("algorithmDTO", algorithmDTO);

        req.getRequestDispatcher("/app/algorithm/loading.jsp").forward(req, resp);
    }
}





