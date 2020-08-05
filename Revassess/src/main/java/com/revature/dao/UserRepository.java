package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.config.ConnectionUtil;
import com.revature.model.User;

public class UserRepository {
	public static Connection conn = ConnectionUtil.connect();
	public User saveUser(User user) throws SQLException {
		
		
		String sql = "INSERT INTO APP_USER VALUES(?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, user.getUser_id());
		ps.setString(2, user.getUsername());
		ps.setString(3, user.getPassword());
		ps.setString(4, user.getFirst_name());
		ps.setString(5, user.getLast_name());
		ps.setInt(6, user.getRole_id());
		
		ps.execute(sql);
		
		return user;
	}
	
	

}