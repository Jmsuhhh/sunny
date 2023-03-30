package com.sunny.app.question.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.question.dto.QuestionDTO;

public class QuestionDAO {

	
	public SqlSession sqlSession;
	
	
	public QuestionDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(QuestionDTO questionDTO) {
		sqlSession.insert("question.insert", questionDTO);
	}
	
}
