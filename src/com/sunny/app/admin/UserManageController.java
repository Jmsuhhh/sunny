package com.sunny.app.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.admin.dao.UserManageDAO;
import com.sunny.app.admin.vo.UserManageVO;
import com.sunny.app.util.AdminUtils;

public class UserManageController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String searchWord = req.getParameter("searchWord");
		System.out.println("=====================");
		System.out.println(searchWord);
		System.out.println("=====================");
		
		UserManageDAO userManageDAO = new UserManageDAO();
		int total = userManageDAO.getTotal();
		System.out.println(total);

		// 세션체크
		if (!AdminUtils.sessionCheck(req)) {
			resp.sendRedirect("/admin/login.ad?login=noInfo");
		}

		String temp = req.getParameter("page");

		int page = temp == null ? 1 : Integer.parseInt(temp);

		int rowCount = 10;
		int pageCount = 5;

		int startRow = (page - 1) * rowCount;

		int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount);

		int startPage = endPage - (pageCount - 1);

		int realEndPage = (int) Math.ceil(total / (double) rowCount);

		endPage = endPage > realEndPage ? realEndPage : endPage;

		boolean prev = startPage > 1;
		boolean next = endPage != realEndPage;
		
		Map<String, Object> pageMap = new HashMap<>();
		pageMap.put("startRow", startRow);		
		pageMap.put("rowCount", rowCount);
		pageMap.put("searchWord", searchWord == null ? "" : searchWord); 
		List<UserManageVO> users = userManageDAO.userInfo(pageMap);
		
		req.setAttribute("userList", users);
		req.setAttribute("page", page);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		req.setAttribute("prev", prev);
		req.setAttribute("next", next);
		
		req.setAttribute("userList", users);
		req.getRequestDispatcher("/app/admin/userManage.jsp").forward(req, resp);
//
//		// 전체 회원 정보 가져오기
//
//		// 페이지 이동

	}
}
