package com.sunny.app.find.password;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.find.password.dao.FindPasswordDAO;
import com.sunny.app.user.dto.UserDTO;
import com.sunny.app.user.vo.UserVO;

public class FindPasswordOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String findQuestionNumber = req.getParameter("findQuestionNumber");
		String findPasswordAnswer = req.getParameter("findPasswordAnswer");
		String newPassword = req.getParameter("newPassword");
		
		UserVO userVO = new UserVO();
		userVO.setUserId(userId);
		userVO.setFindPasswordAnswer(findPasswordAnswer);
		userVO.setFindQuestionNumber(Integer.parseInt(findQuestionNumber));
		
		FindPasswordDAO findPasswordDAO = new FindPasswordDAO();
		
		// 입력한 정보와 일치하는 사용자가 있는지 확인
		int userNumber = findPasswordDAO.findPassword(userVO);
		
		if(userNumber == 0) {
			req.setAttribute("errorMessage", "입력하신 정보와 일치하는 사용자가 없습니다.");
			req.getRequestDispatcher("/find/findPw.fp").forward(req, resp); // 비밀번호 찾기 페이지로 포워드
		    return;
		}
		
		System.out.println(req.getParameter("userNumber"));
		System.out.println(req.getParameter("findQuestionNumber"));
		System.out.println("FindPasswordOkController 실행");
		
		// 일치하는 사용자가 있으면 새로운 비밀번호로 변경
		UserDTO userDTO = new UserDTO();
		userDTO.setUserNumber(userNumber);
		userDTO.setUserPassword(newPassword);
		findPasswordDAO.updatePassword(userDTO);
		
		req.setAttribute("message", "비밀번호가 성공적으로 변경되었습니다.");
		req.getRequestDispatcher("/user/login.us").forward(req, resp); // 로그인 페이지로 포워드
		
	}
}
