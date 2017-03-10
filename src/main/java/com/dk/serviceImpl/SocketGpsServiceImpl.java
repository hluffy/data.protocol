package com.dk.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.dk.object.GPS;
import com.dk.object.Result;
import com.dk.service.SocketGpsService;
import com.dk.util.DBUtil;

public class SocketGpsServiceImpl implements SocketGpsService{

	public Result addGps(GPS gps) {
		// TODO Auto-generated method stub
		Result result = new Result();
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into socketgps(EquipmentNo,Date,Time,IsPosition,Latitude,Longitude,Speed,Direction,Altitude,BaseStation,WiFi,Elec,Gsensor,DateCreated) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, gps.getEquipmentNo());
			ps.setString(2, gps.getDate());
			ps.setString(3, gps.getTime());
			ps.setString(4, gps.getIsPosition());
			ps.setString(5, gps.getLatitude());
			ps.setString(6, gps.getLongitude());
			ps.setString(7, gps.getSpeed());
			ps.setString(8, gps.getDirection());
			ps.setString(9, gps.getAltitude());
			ps.setString(10, gps.getStation());
			ps.setString(11, gps.getWifi());
			ps.setString(12, gps.getEle());
			ps.setString(13, gps.getGsensor());
			ps.setTimestamp(14, new Timestamp(System.currentTimeMillis()));
			
			ps.execute();
			result.setData(gps);
			result.setMsg("保存成功");
			result.setStatus(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result.setMsg("保存失败");
			result.setStatus(false);
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
		return result;
	}

}
