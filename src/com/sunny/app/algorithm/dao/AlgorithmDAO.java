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

	public List<PlantDTO> selectPlantsByAlgorithmInput(AlgorithmDTO algorithmDTO) {
	    // SqlSession 객체를 생성합니다.
//	    SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);

	    // plant_name과 plant_content를 찾아오기 위해 AlgorithmMapper.xml의 select문을 실행합니다.
//	    List<PlantDTO> plants = sqlSession.selectList("AlgorithmMapper.selectPlantsByAlgorithmInput", algorithmDTO);
	    
	    // SqlSession 객체를 닫습니다.
//	    sqlSession.close();

	    // 찾아온 결과를 반환합니다.
//	    return plants;
	    return sqlSession.selectList("Algorithm.selectPlantsByAlgorithmInput",algorithmDTO);
	}
	
	    
}