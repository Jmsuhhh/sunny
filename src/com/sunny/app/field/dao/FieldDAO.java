package com.sunny.app.field.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class FieldDAO {

	
	public SqlSession sqlSession;
	
	
	public FieldDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
