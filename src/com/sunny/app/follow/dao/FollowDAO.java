package com.sunny.app.follow.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.follow.vo.FollowVO;

public class FollowDAO {

	
	public SqlSession sqlSession;
	
	
	public FollowDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
//	나를 팔로우하는 사람 리스트
	public List<FollowVO> selectFollower(int userNumber) {
		return sqlSession.selectList("follow.selectFollower", userNumber);
	}
	
//	내가 팔로우하는 사람 리스트
	public List<FollowVO> selectFollowing(int userNumber) {
		return sqlSession.selectList("follow.selectFollowing", userNumber);
	}
	
//	팔로워, 팔로잉 수 > 마이페이지 로딩할때 사용
	public int selectFollowerCnt(int userNumber) {
		return sqlSession.selectOne("follow.selectFollowerCnt", userNumber);
	}
	public int selectFollowingCnt(int userNumber) {
		return sqlSession.selectOne("follow.selectFollowingCnt", userNumber);
	}
	
}
