package com.sunny.app.gosu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.gosu.vo.GosuVO;

public class GosuDAO {

	public SqlSession sqlSession;
	
	
	public GosuDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	고수목록
	public List<GosuVO> selectAll(Map<String, Integer> pageMap) {
		return sqlSession.selectList("gosu.selectAll", pageMap);
	}
//	페이징처리
	public int getTotal() {
		return sqlSession.selectOne("gosu.getTotal");
	}

//	마이페이지에서 필요한 고수Number뽑아오기
	public int getGosuNumber(int userNumber) {
		return sqlSession.selectOne("gosu.getGosuNumber", userNumber);
	}
}
