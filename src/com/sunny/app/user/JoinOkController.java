package com.sunny.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.find.password.dto.FindPasswordDTO;
import com.sunny.app.user.dao.UserDAO;
import com.sunny.app.user.dto.UserDTO;
import com.sunny.app.user.vo.UserVO;

public class JoinOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		UserVO userVO = new UserVO();
		FindPasswordDTO findPasswordDTO = new FindPasswordDTO();
		
		req.setCharacterEncoding("utf-8");
		
//		<insert id="join" parameterType="MemberDTO">
//		insert into tbl_user(user_id, user_password, user_name, user_nickname, user_phone, user_email, user_date)
//		values(#{userId}, #{userPassword}, #{userName}, #{userNickname}, #{userPhone}, #{userEmail}, now())
//		</insert>
//		System.out.println(req.getParameter("userPhone"));
		
		userDTO.setUserId(req.getParameter("userId"));
		userDTO.setUserPassword(req.getParameter("userPassword"));
		userDTO.setUserName(req.getParameter("userName"));
		userDTO.setUserNickname(req.getParameter("userNickname"));
		userDTO.setUserPhone(req.getParameter("userPhone"));
		userDTO.setUserEmail(req.getParameter("userEmail"));
		userDTO.setUserDate(req.getParameter("userDate"));
		
		
		findPasswordDTO.setFindQuestionNumber(Integer.valueOf(req.getParameter("findQuestionNumber"))); 
		findPasswordDTO.setFindPasswordAnswer(req.getParameter("findPasswordAnswer")); 
		userVO.setFindQuestionNumber(Integer.valueOf(req.getParameter("findQuestionNumber")));
		userVO.setFindPasswordAnswer(req.getParameter("findPasswordAnswer"));

		userDAO.join(userDTO);
		userDAO.insertFindPassword(userVO);
		
		req.setAttribute("userId", userDTO.getUserId());
		
		resp.sendRedirect("/user/joinOk.us");
		
	}
}
