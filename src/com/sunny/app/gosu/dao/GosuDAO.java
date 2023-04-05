package com.sunny.app.gosu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.user.vo.UserVO;

public class GosuDAO {

	public SqlSession sqlSession;
	
	
	public GosuDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<UserVO> selectAll() {
		return sqlSession.selectList("gosu.selectAll");
	}

}
