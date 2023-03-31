package com.sunny.app.algorithm.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.algorithm.dto.AlgorithmDTO;

public class AlgorithmDAO {

	
	public SqlSession sqlSession;
	
	public AlgorithmDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
		
	}
	
	public int algorithmResult(AlgorithmDTO algorithmDTO) {
		
		return sqlSession.selectOne("algorithm" , algorithmDTO );
	}
}
