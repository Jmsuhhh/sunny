package com.sunny.app.story.reply.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class StoryReplyDAO {

	
	public SqlSession sqlSession;
	
	public StoryReplyDAO() {
		
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
