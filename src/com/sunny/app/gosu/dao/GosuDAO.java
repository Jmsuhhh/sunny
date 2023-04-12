package com.sunny.app.gosu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.gosu.dto.GosuDTO;
import com.sunny.app.user.vo.UserVO;

public class GosuDAO {

	public SqlSession sqlSession;
	
	
	public GosuDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<UserVO> selectAll(Map<String, Integer> pageMap) {
		return sqlSession.selectList("gosu.selectAll", pageMap);
	}
	
	public List<UserVO> search(){
		return sqlSession.selectList("gosu.selectAll");
	}
	
	public int getTotal() {
		return sqlSession.selectOne("gosu.getTotal");
	}
	
	public void insert(GosuDTO gosuDTO) {
		sqlSession.insert("gosu.insert", gosuDTO);
	}
	

}
