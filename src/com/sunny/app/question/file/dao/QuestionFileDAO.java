package com.sunny.app.question.file.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class QuestionFileDAO {

	public SqlSession sqlSession;
	
	
	public QuestionFileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
