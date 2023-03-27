package com.sunny.app.gosu.apply.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class GosuApplyDAO {

	public SqlSession sqlSession;
	
	public GosuApplyDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
