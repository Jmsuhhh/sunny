package com.sunny.app.user.file;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sunny.app.Execute;
import com.sunny.app.user.file.dao.UserFileDAO;
import com.sunny.app.user.file.dto.UserFileDTO;

public class UserFileOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("프로필사진등록 컨트롤러 들어옴!");

		UserFileDTO userFileDTO = new UserFileDTO();
		UserFileDAO userFileDAO = new UserFileDAO();
		HttpSession session = req.getSession();
		Integer userNumber = (Integer)session.getAttribute("userNumber");
		
		userFileDTO.setUserNumber(userNumber);
		
	      String uploadPath = req.getSession().getServletContext().getRealPath("/") + "uploadProfile/";
	      int fileSize = 1024 * 1024 * 5; //5MB
	      System.out.println(uploadPath);
	      
	      MultipartRequest multipartRequest = new MultipartRequest(req, uploadPath, fileSize, "utf-8", new DefaultFileRenamePolicy());
	      
	     userFileDTO.setUserNumber((Integer)req.getSession().getAttribute("userNumber"));


	      Enumeration<String> fileNames = multipartRequest.getFileNames();
	      while(fileNames.hasMoreElements()) {
	         String name = fileNames.nextElement();
	         
	         String fileSystemName = multipartRequest.getFilesystemName(name);
	         String fileOriginalName = multipartRequest.getOriginalFileName(name);
	         
	         if(fileSystemName == null) {continue;}
	         
	         userFileDTO.setFileSystemName(fileSystemName);
	         userFileDTO.setFileOriginalName(fileOriginalName);
	         
	         if(userFileDAO.select(userNumber)>0) {
	        	 userFileDAO.update(userFileDTO);
	         }else {
	 			userFileDAO.insert(userFileDTO);
	 		}
		    
	      }
	      
//	      resp.sendRedirect("/board/boardListOk.bo");
	}

}
