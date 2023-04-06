package com.sunny.app.story.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.story.file.dto.StoryFileDTO;
import com.sunny.app.story.file.vo.StoryFileVO;

public class StoryFileDAO {

	
	public SqlSession sqlSession;
	
	
	public StoryFileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(StoryFileDTO storyfileDTO) {
		sqlSession.insert("storyFile.insert",storyfileDTO);
	}
}
