package com.sunny.app.plant.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class PlantDAO {

	
	public SqlSession sqlSession;
	
	
	public PlantDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
