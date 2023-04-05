package com.sunny.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.follow.dao.FollowDAO;
import com.sunny.app.my.page.dto.MyPageDTO;
import com.sunny.app.user.dao.UserDAO;
import com.sunny.app.user.file.dao.UserFileDAO;
import com.sunny.app.user.vo.UserVO;

public class MyPageOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("myPageOk컨트롤러진입");
		
		UserDAO userDAO = new UserDAO();
		FollowDAO followDAO = new FollowDAO();
		UserFileDAO userFileDAO = new UserFileDAO();
		
		HttpSession session = req.getSession();
		MyPageDTO myPageDTO = new MyPageDTO();
		UserVO userVO = new UserVO();
		Integer userNumber = 0;
		

//		req.getpa...userNumber==null이면 세션에서 받아와 아니면 파라미터에서받아와 -> userNumber에 저장해
		if(req.getParameter("userNumber")==null) {
			userNumber = (Integer) session.getAttribute("userNumber");
		}else {
			userNumber = Integer.parseInt(req.getParameter("userNumber"));
		}
		
		System.out.println(userNumber);
		
		myPageDTO.setUserNumber(userNumber);
		
		userVO=userDAO.getUserInfo(userNumber);

		myPageDTO.setUserComment(userVO.getUserComment());
		myPageDTO.setGradeNumber(userVO.getGradeNumber());
		myPageDTO.setUserNickname(userVO.getUserNickname());

//		프로필사진이 없으면 userFile에 기본로고를 넣어준다. > c:choose로 처리
		myPageDTO.setUserFile(userFileDAO.selectFile(userNumber));
		myPageDTO.setFollowerCnt(followDAO.selectFollowerCnt(userNumber));
		myPageDTO.setFollowingCnt(followDAO.selectFollowingCnt(userNumber));
		myPageDTO.setStoryCnt(0);
		myPageDTO.setStoryFiles(null);

//			 userNumber로 받아와야 할 것은 무엇이지?
//	         userDAO에서 등급, 닉네임, 게시물수, 팔로워수, 팔로잉수, 한줄소개코멘트, 프로필사진, 내가쓴글리스트, 내가 질문한 리스트? 식고수인경우질문리스트
		req.setAttribute("myPage", myPageDTO);
		
		req.getRequestDispatcher("/app/user/myPage.jsp").forward(req, resp);

	}

}
