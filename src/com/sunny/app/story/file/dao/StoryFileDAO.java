package com.sunny.app.story.file.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class StoryFileDAO {

	
	public SqlSession sqlSession;
	
	
	public StoryFileDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
