package com.sunny.app.algorithm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.algorithm.dto.AlgorithmDTO;
import com.sunny.app.plant.dto.PlantDTO;

public class AlgorithmDAO {

	public SqlSession sqlSession;

	public AlgorithmDAO() {

		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);

	}

	public PlantDTO algorithmResult(int algorithmResult) {

		return sqlSession.selectOne("algorithmResult", algorithmResult);
	}

	public void close() {
		sqlSession.close();
	}
}
