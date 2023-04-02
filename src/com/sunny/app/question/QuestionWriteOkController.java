package com.sunny.app.question;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sunny.app.Execute;
import com.sunny.app.question.dao.QuestionDAO;
import com.sunny.app.question.dto.QuestionDTO;

public class QuestionWriteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	QuestionDTO questionDTO = new QuestionDTO();
	QuestionDAO questionDAO = new QuestionDAO();
	
	System.out.println("write 들어왔다!!!");
	
//	String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
//	int fileSize = 1024 * 1024 * 5; // 5MB
//	
//	MultipartRequest multipartRequest = new MultipartRequest(req, uploadPath, fileSize, new DefaultFileRenamePolicy());
	}
}
