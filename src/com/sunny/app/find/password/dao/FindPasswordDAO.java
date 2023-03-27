package com.sunny.app.find.password.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class FindPasswordDAO {

	public SqlSession sqlSession;
	
	
	public FindPasswordDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
