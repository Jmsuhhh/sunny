package com.sunny.app.algorithm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AlgorithmFrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(target);
		switch (target) {
		case "/algorithmTest/index.ag":
			req.getRequestDispatcher("/app/algorithm/algorithmTest/index.jsp").forward(req, resp);
			break;
		case "/algorithmTest/testOne.ag":
			req.getRequestDispatcher("/app/algorithm/algorithmTest/testOne.jsp").forward(req, resp);
			break;
		case "/algorithmTest/testTwo.ag":
			req.getRequestDispatcher("/app/algorithm/algorithmTest/testTwo.jsp").forward(req, resp);
			break;
		case "/algorithmTest/testThree.ag":
			req.getRequestDispatcher("/app/algorithm/algorithmTest/testThree.jsp").forward(req, resp);
			break;
		case "/algorithmTest/testFour.ag":
			req.getRequestDispatcher("/app/algorithm/algorithmTest/testFour.jsp").forward(req, resp);
			break;
		case "/algorithmTest/testFive.ag":
			req.getRequestDispatcher("/app/algorithm/algorithmTest/testFive.jsp").forward(req, resp);
			break;
		case "/algorithmTest/loading.ag":
			req.getRequestDispatcher("/app/algorithm/algorithmTest/loading.jsp").forward(req, resp);
			break;
		case "/algorithmTest/result.ag":
			req.getRequestDispatcher("/app/algorithm/algorithmTest/result.jsp").forward(req, resp);
			new AlgorithmController().execute(req, resp); 
			break;
		}
	}
}