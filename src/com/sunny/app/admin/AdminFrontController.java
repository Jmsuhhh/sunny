package com.sunny.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminFrontController extends HttpServlet {

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
	
			switch(target) {
			
			 case "/app/admin/login.ad":
		         req.getRequestDispatcher("/app/admin/adminLogin.jsp").forward(req, resp);;
				 break;
			 case "/app/admin/loginOk.ad":
		         new AdminLoginController().execute(req, resp);
				 break;
//		     case "app/admin/select.ad":
//		    	  req.getRequestDispatcher("/app/admin/select.jsp").forward(req, resp);
//		          break;
//		     case "app/admin/userManage.ad":
//		    	  new AdminUserManageController().execute(req, resp);
//		    	  break;
		     case "/app/admin/logoutOk.ad":
		    	  new LogoutOkController().execute(req, resp);
		    	  break;
		      }
		
		}
	}

