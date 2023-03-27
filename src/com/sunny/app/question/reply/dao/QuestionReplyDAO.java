package com.sunny.app.question.reply.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class QuestionReplyDAO {
	
	public SqlSession sqlSession;
	
	public QuestionReplyDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}
