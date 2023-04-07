package com.sunny.app.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sunny.app.admin.dto.AdminDTO;

public class AdminDAO {

	public SqlSession sqlSession;
	
	
	public AdminDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<AdminDTO> select(AdminDTO adminDTO){
		System.out.println("select 탐");
		return sqlSession.selectList("admin.select", adminDTO);
	 }
	
	public void kill(int userNumber) {
		System.out.println("kill 메서드");
		sqlSession.delete("admin.kill", userNumber);
	}
	
	public void down(int userNumber) {
		System.out.println("down 메서드");
		sqlSession.update("admin.down", userNumber);
	}
	
	public void up(int userNumber) {
		System.out.println("up 메서드");
		sqlSession.update("admin.up", userNumber);
	}
}
