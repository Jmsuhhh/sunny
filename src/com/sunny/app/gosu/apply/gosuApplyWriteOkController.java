package com.sunny.app.gosu.apply;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import com.mysql.cj.protocol.a.MultiPacketReader;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FilePart;
import com.sunny.app.Execute;
import com.sunny.app.gosu.apply.dao.GosuApplyDAO;
import com.sunny.app.gosu.apply.dto.GosuApplyDTO;
import com.sunny.app.gosu.apply.file.dao.GosuApplyFileDAO;
import com.sunny.app.gosu.apply.file.dto.GosuApplyFileDTO;
import com.sunny.app.gosu.dao.GosuDAO;
import com.sunny.app.gosu.dto.GosuDTO;
import com.sunny.app.gosu.field.dao.GosuFieldDAO;
import com.sunny.app.gosu.field.dto.GosuFieldDTO;

public class gosuApplyWriteOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			req.setCharacterEncoding("UTF-8");

			GosuDAO gosuDAO = new GosuDAO();
			GosuDTO gosuDTO = new GosuDTO();
			GosuFieldDAO gosuFieldDAO = new GosuFieldDAO();
			GosuFieldDTO gosuFieldDTO = new GosuFieldDTO();
			GosuApplyDAO gosuApplyDAO = new GosuApplyDAO();
			GosuApplyDTO gosuApplyDTO = new GosuApplyDTO();
			GosuApplyFileDAO gosuApplyFileDAO = new GosuApplyFileDAO();
			GosuApplyFileDTO gosuApplyFileDTO = new GosuApplyFileDTO();
			
			List<GosuApplyFileDTO> fileList = new ArrayList<>();
			req.get
			
			int maxSize = 1024*1024*30;
			
			String path = req.getSession().getServletContext().getRealPath("/assets/img");
			System.out.println("파일 저장 위치 = " + path);

			// MultipartRequest request = new MultipartRequest(req, path, maxSize, "UTF-8", new DefaultFileRenamePolicy());
			
			MultipartRequest multi = new MultipartRequest(req, path, maxSize, "UTF-8", new DefaultFileRenamePolicy());
			
			Enumeration<String> files = multi.getFileNames();
			
			
			
			
			
			
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);

			factory.setSizeThreshold(10);
			factory.setRepository(new File(path));

			upload.setFileSizeMax(maxSize);
			upload.setSizeMax(maxSize);

			List<FileItem> fileItems = upload.parseRequest(new ServletRequestContext(req));

//			System.out.println(request.getParameter("applyTitle"));
//			System.out.println(request.getParameter("applyContent"));
//			gosuApplyDTO.setApplyTitle(request.getParameter("applyTitle"));
//			gosuApplyDTO.setApplyContent(request.getParameter("applyContent"));
//			gosuApplyDTO.setUserNumber((Integer)req.getSession().getAttribute("userNumber"));
//			gosuApplyDAO.insert(gosuApplyDTO);
			
			// applyNumber 가져오기
			int applyNumber = gosuApplyDAO.getSequence();
			
			// 파일 DB 저장
//			for (FileItem fileItem : fileItems) {
//				System.out.println("============ here");
//				if (!fileItem.isFormField()) {
//					File file = new File(String.format("%s\\%s", path, fileItem.getName()));
//					if (fileItem.getContentType().contains("image")) {
//						String filePath = file.getPath();
//						System.out.println("=================");
//						System.out.println("filePath" + filePath);
//						String fileSystemName = fileItem.getName();
//						System.out.println("fileSystemName = " + fileSystemName);
//						System.out.println("=================");
//						
//						GosuApplyFileDTO applyFileDTO = new GosuApplyFileDTO();
//						applyFileDTO.setFileOriginalName(filePath);
//						applyFileDTO.setFileSystemName(fileSystemName);
//						applyFileDTO.setApplyNumber(applyNumber);
//						gosuApplyFileDAO.insert(applyFileDTO);
//						fileList.add(applyFileDTO);
//						fileItem.write(file);	
//					}
//				}
//			}
			
			fileList.stream().forEach(t -> System.out.println(t.getFileOriginalName()));
			fileList.stream().forEach(t -> System.out.println(t.getFileSystemName()));

		} catch (Exception e) {
			e.printStackTrace();
			// todo 다시 글쓰기 페이지로 이동 : 게시글 작성에 실패하였습니다. 알리기
		}

		resp.sendRedirect("/user/myPageOk.us");
	}

	private MultiPacketReader MultipartRequest(HttpServletRequest req, String path, int maxSize, String string,
			DefaultFileRenamePolicy defaultFileRenamePolicy) {
		// TODO Auto-generated method stub
		return null;
	}

}
