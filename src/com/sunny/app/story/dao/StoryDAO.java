package com.sunny.app.story.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.story.dto.StoryDTO;
import com.sunny.app.story.vo.StoryListVO;
import com.sunny.app.story.vo.StoryVO;

public class StoryDAO {

	public SqlSession sqlSession;

	public StoryDAO() {

		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<StoryListVO> selectAll(Map<String, Integer>pageMap) {
		return sqlSession.selectList("story.selectAll",pageMap);
	}
	
	public int getTotal() {
		return sqlSession.selectOne("story.getTotal");
	}
	
	
	public void insert(StoryDTO storyDTO) {
		sqlSession.insert("story.insert", storyDTO);
	}


	public int getSequence() {
		return sqlSession.selectOne("story.getSequence");
	}
}
