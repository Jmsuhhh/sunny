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
		
		QuestionDAO questionDAO = new QuestionDAO();
		QuestionDTO questionDTO = new QuestionDTO();
	
		
		System.out.println("writeOk컨트롤러 들어왔다");
		System.out.println(req.getParameter("questionTitle"));
		
		String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
		int fileSize = 1024 * 1024 * 100; 
		
		MultipartRequest multipartRequest = new MultipartRequest(req, uploadPath, fileSize, new DefaultFileRenamePolicy());
		
		System.out.println(uploadPath);
		
//		 MultipartRequest multipartRequest = new MultipartRequest(req, uploadPath, fileSize, "utf-8", new DefaultFileRenamePolicy());
//	      
//	      questionDTO.setQuestionTitle(multipartRequest.getParameter("questionTitle"));
//	      questionDTO.setQuestionContent(multipartRequest.getParameter("questionContent"));
//	      questionDTO.setUserNumber((Integer)req.getSession().getAttribute("userNumber"));
//	      questionDTO.setGosuNumber((Integer)req.getSession().getAttribute("gosuNumber"));
//	      
//	      questionDAO.insert(questionDTO);
//	      questionNumber = questionDAO.getSequence();
//	      
//	      System.out.println(boardNumber);
	      
//	      getFileNames는 input태그의 name속성을 의미한다.
//	      Enumeration은 이터레이터와 비슷하다고 생각하면 된다.
//	      이터레이터가 나오기 이전에 사용되던 인터페이스이다.
//	      Enumeration<String> fileNames = multipartRequest.getFileNames();
//	      
//	      	while(fileNames.hasMoreElements()) {
//	         String name = fileNames.nextElement();
//	         
//	         String fileSystemName = multipartRequest.getFilesystemName(name);
//	         String fileOriginalName = multipartRequest.getOriginalFileName(name);
//	         
//	         if(fileSystemName == null) {continue;}
//	         
//	         fileDTO.setFileSystemName(fileSystemName);
//	         fileDTO.setFileOriginalName(fileOriginalName);
//	         fileDTO.setBoardNumber(boardNumber);
//	         
//	         System.out.println(fileDTO);
//	         fileDAO.insert(fileDTO);
	    resp.sendRedirect("/question/questionListOk.qs");
	}
}
