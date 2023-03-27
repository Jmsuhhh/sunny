package com.sunny.app.gosu.field.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class GosuFieldDAO {

	
	
	public SqlSession sqlSession;
	
	
	public GosuFieldDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
