package com.sunny.app.story;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunny.app.Execute;
import com.sunny.app.story.dao.StoryDAO;

public class StoryWriteController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
<<<<<<< HEAD
	      StoryDAO storyDAO = new StoryDAO();
	      HttpSession session = req.getSession();
	      Integer userNumber = (Integer)session.getAttribute("userNumber");
	      String path = null;
	      
	      if(userNumber == null) {
	         path = "/app/user/login.jsp";
	      }else {
	         path ="/app/story/storyWrite.jsp";
	         req.setAttribute("userNick", storyDAO.getUserNick(userNumber));
	      }
	      
	      req.getRequestDispatcher(path).forward(req, resp);
=======
		req.getRequestDispatcher("/app/story/storyWrite.jsp").forward(req, resp);
>>>>>>> work/story4
	}

}
