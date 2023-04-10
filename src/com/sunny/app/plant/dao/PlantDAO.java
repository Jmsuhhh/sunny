package com.sunny.app.plant.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.algorithm.dto.AlgorithmDTO;
import com.sunny.app.plant.dto.PlantDTO;

public class PlantDAO {

	
	public SqlSession sqlSession;
	
	
	public PlantDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public PlantDTO selectPlant(AlgorithmDTO algorithmDTO) {
	    return sqlSession.selectOne("plant.selectPlant", algorithmDTO);
	}
}
