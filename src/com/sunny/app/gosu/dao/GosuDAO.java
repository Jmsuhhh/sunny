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

}
