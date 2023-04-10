package com.sunny.app.find.password.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.find.password.dto.FindPasswordDTO;
import com.sunny.app.user.dto.UserDTO;

public class FindPasswordDAO {

	public SqlSession sqlSession;
	
	
	public FindPasswordDAO() {
		
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public FindPasswordDTO findPassword(FindPasswordDTO findPasswordDTO) {
		return sqlSession.selectOne("findPassword.findPassword", findPasswordDTO);
	}
	
	public void updatePassword(UserDTO userDTO) {
		sqlSession.insert("findPassword.updatePassword", userDTO);
	}
	
	
}
