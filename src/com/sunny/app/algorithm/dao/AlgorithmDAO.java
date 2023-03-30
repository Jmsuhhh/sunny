package com.sunny.app.algorithm.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class AlgorithmDAO {

	
	public SqlSession sqlSession;
	
	public AlgorithmDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
		
		
		
	}
}
