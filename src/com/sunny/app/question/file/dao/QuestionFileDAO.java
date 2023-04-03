package com.sunny.app.question.file.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.question.file.dto.QuestionFileDTO;

public class QuestionFileDAO {

	public SqlSession sqlSession;
	
	
	public QuestionFileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(QuestionFileDTO questionFileDTO) {
		sqlSession.insert("questionfile.insert", questionFileDTO);
	}
}
