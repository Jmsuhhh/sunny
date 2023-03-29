package com.sunny.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.util.AdminUtils;

public class AdminUserManageController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//세션체크
		if (!AdminUtils.sessionCheck(req)) {
			resp.sendRedirect("app/admin/login/jsp?login=noInfo");
		}
		
		// 전체 회원 정보 가져오기
		
		//페이지 이동
		
		
	}

}
