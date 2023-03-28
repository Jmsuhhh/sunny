package com.sunny.app.story;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunny.app.Execute;
import com.sunny.app.story.dao.StoryDAO;
import com.sunny.app.story.vo.StoryVO;

public class StoryListOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StoryDAO storyDAO = new StoryDAO();
		List<StoryVO> storys = storyDAO.selectAll();
		
		req.setAttribute("storyList", storys);
		
		req.getRequestDispatcher("/app/story/storyList.jsp").forward(req, resp);
	}

}
