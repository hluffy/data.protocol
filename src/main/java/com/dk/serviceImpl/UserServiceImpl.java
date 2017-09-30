package com.dk.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dk.object.UserInfo;
import com.dk.service.UserService;
import com.dk.util.DBUtil;

public class UserServiceImpl implements UserService{

	@Override
	public UserInfo getUserInfo(String imei) {
		// TODO Auto-generated method stub
		UserInfo info = new UserInfo();
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select * from t_user where equipnumber = ? and equiptype = 1";
			ps = conn.prepareStatement(sql);
			ps.setString(1, imei);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				info.setUserName(rs.getString("userName"));
				info.setName(rs.getString("name"));
				info.setEquipstate(rs.getInt("equipstate"));
				info.setRid(rs.getLong("rid"));
				info.setRole(rs.getString("role"));
			}else{
				info = null;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps!=null){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return info;
	}

	@Override
	public void updateUserInfo(int isin,String equipnumber) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "update t_user set isin = ? where equipnumber = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, isin);
			ps.setString(2, equipnumber);
			ps.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps!=null){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
