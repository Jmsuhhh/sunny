package com.sunny.app.gosu.apply.file.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.gosu.apply.file.dto.GosuApplyFileDTO;

public class GosuApplyFileDAO {

	
	public SqlSession sqlSession;
	
	
	public GosuApplyFileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(GosuApplyFileDTO gosuApplyFileDTO) {
		sqlSession.insert("gosuApplyFile.insert", gosuApplyFileDTO);
	}
}
