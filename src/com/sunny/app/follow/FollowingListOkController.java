package com.sunny.app.follow;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.follow.dao.FollowDAO;
import com.sunny.app.follow.vo.FollowVO;

public class FollowingListOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("팔로잉리스트Controller");
		FollowDAO followDAO = new FollowDAO();
//		내가 내 페이지에서 들어가는 경우 session에 있는 userNumber를 사용한다.
//		다른 사람의 페이지에서 follow로 들어가는 경우 그 사람의 userNumber를 사용한다.
//		HttpSession session = req.getSession();
//		Integer sessionNumber = (Integer)session.getAttribute("userNumber");
		Integer userNumber = 25;
		
		
//		if(sessionNumber!=userNumber) {
//			followDAO.selectFollower(userNumber);
//		}
		
		List<FollowVO> followList = followDAO.selectFollowing(userNumber);
		req.setAttribute("followList", followList);
		req.getRequestDispatcher("/app/follow/follow.jsp").forward(req, resp);

	}

}
