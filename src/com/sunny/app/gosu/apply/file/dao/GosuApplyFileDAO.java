package com.sunny.app.gosu.apply.file.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class GosuApplyFileDAO {

	
	public SqlSession sqlSession;
	
	
	public GosuApplyFileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
