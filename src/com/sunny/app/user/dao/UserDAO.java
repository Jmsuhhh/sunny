package com.sunny.app.user.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.user.dto.UserDTO;

public class UserDAO {

	public SqlSession sqlSession;
	
	public UserDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void join(UserDTO userDTO) {
		sqlSession.insert("user.join", userDTO);
	}
	
	public int login(UserDTO userDTO) {
		return sqlSession.selectOne("user.login", userDTO);
	}
	
	public boolean checkId(String userId) {
		return (Integer)sqlSession.selectOne("user.checkId", userId) < 1;
	}
	
	public String getUserId(int userNumber) {
		return sqlSession.selectOne("user.getUserId", userNumber);
	}
	
	public void userDrop(int userNumber) {
		sqlSession.delete("user.userDrop", userNumber);
	}
}
