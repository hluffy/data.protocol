package com.dk.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.dk.object.Warning;
import com.dk.object.WarningInfo;
import com.dk.service.WarningService;
import com.dk.util.DBUtil;

public class WarningServiceImpl implements WarningService{

	@Override
	public void add(WarningInfo info) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "insert into t_warning(equipment_num,area,type,date,description) values(?,?,?,?,?)";
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, info.getEquipmentNum());
			ps.setString(2, info.getArea());
			ps.setString(3, info.getType());
			ps.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
			ps.setString(5, info.getDescription());
			
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

	@Override
	public void addWarningInfo(Warning info) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "insert into t_warning(name,imei,warningtype,watchtime,fid,type2) values(?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, info.getName());
			ps.setString(2, info.getImei());
			ps.setString(3, info.getWarningType());
			ps.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
			ps.setLong(5, info.getFid());
			ps.setString(6, info.getType2());
			
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
					ps.execute();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
