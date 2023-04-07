package com.sunny.app.question.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.question.dto.QuestionDTO;
import com.sunny.app.user.vo.UserVO;

public class QuestionDAO {

	
	public SqlSession sqlSession;
	
	
	public QuestionDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	리스트 뽑는거 
	public List<QuestionDTO> selectAll (Map<String, Integer> pageMap) {
		return sqlSession.selectList("question.selectAll", pageMap);
	}
	
	public List<QuestionDTO> selectAll2 (Map<String, Integer> pageMap) {
		return sqlSession.selectList("question.selectAll2", pageMap);
	}
	
//  페이징처리..였던것
	public int getTotal() {
		return sqlSession.selectOne("question.getTotal");
	}
	
//	질문쓰기 
	public void insert(QuestionDTO questionDTO) {
		sqlSession.insert("question.insert", questionDTO);
	}
	
//  닉네임 뽑을거임
	public void selectNickName (int gosuNumber) {
		sqlSession.selectOne("question.selectNickName", gosuNumber);
	}
	
}
