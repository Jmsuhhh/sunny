package com.sunny.app.user.file.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class UserFileDAO {

	public SqlSession sqlSession;
	
	public UserFileDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
