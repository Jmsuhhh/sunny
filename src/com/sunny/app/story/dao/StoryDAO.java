package com.sunny.app.story.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.story.vo.StoryVO;

public class StoryDAO {

	public SqlSession sqlSession;
	
	
	public StoryDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<StoryVO> selectAll() {
		return sqlSession.selectList("story.selectAll");
	}
}
