package com.sunny.app.story;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sunny.app.Execute;
import com.sunny.app.story.dao.StoryDAO;
import com.sunny.app.story.dto.StoryDTO;
import com.sunny.app.story.file.dao.StoryFileDAO;
import com.sunny.app.story.file.dto.StoryFileDTO;

public class StoryWriteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StoryDAO storyDAO = new StoryDAO();
	StoryDTO storyDTO = new StoryDTO();
	
	String uploadPath = req.getSession().getServletContext().getRealPath("/") + "storyUpload/";
	int fileSize = 1024*1024*5;
	System.out.println(uploadPath);
	
	MultipartRequest multipartRequest = new MultipartRequest(req, uploadPath, fileSize, new DefaultFileRenamePolicy());
	
	}
}
