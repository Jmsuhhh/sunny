package com.sunny.app.story.reply.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.story.reply.vo.StoryReplyVO;

public class StoryReplyDAO {

	
	public SqlSession sqlSession;
	
	public StoryReplyDAO() {
		
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<StoryReplyVO> selectAll(int storyNumber) {
		return sqlSession.selectList("storyReply.selectAll", storyNumber);
	}
}
