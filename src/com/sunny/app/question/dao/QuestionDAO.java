package com.sunny.app.question.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.question.dto.QuestionDTO;

public class QuestionDAO {

	
	public SqlSession sqlSession;
	
	
	public QuestionDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<QuestionDTO> selectAll (Map<String, Integer> pageMap) {
		return sqlSession.selectList("question.selectAll", pageMap);
	}
	
	public int getTotal() {
		return sqlSession.selectOne("question.getTotal");
	}
	
	
	public void insert(QuestionDTO questionDTO) {
		sqlSession.insert("question.insert", questionDTO);
	}
	
	public int getSequence() {
		return sqlSession.selectOne("quetion.getSequence");
	}
	
}
