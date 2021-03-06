package com.dk.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dk.object.MapWatchData;
import com.dk.object.Result;
import com.dk.service.MapWatchDataService;
import com.dk.util.DBUtil;

public class MapWatchDataServiceImpl implements MapWatchDataService{

	@Override
	public Result addMapDateDef(MapWatchData data) {
		// TODO Auto-generated method stub
		Result result = new Result();
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			String sql = "insert into map_watch_data_def(IMEI,Xloc,Yloc,Bat,RSSI,sos,watch_date,create_date,is_position,address,type,gps_info,bts_info) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, data.getIMEI());
			ps.setString(2, data.getYloc());
			ps.setString(3, data.getXloc());
			ps.setInt(4, data.getBat());
			ps.setInt(5, data.getRssi());
			ps.setInt(6, data.getSos());
			ps.setTimestamp(7, data.getWatchDate());
			ps.setTimestamp(8, data.getCreateDate());
			ps.setString(9, data.getIsPosition());
			ps.setString(10, data.getAddress());
			ps.setString(11, data.getType());
			
			ps.setString(12, data.getGpsInfo());
			ps.setString(13, data.getBtsInfo());
			
			ps.execute();
			result.setStatus(true);
			result.setMsg("保存成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result.setStatus(false);
			result.setMsg("操作失败");
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

	@Override
	public Result addMapDateAct(MapWatchData data) {
		// TODO Auto-generated method stub
		Result result = new Result();
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			String sql = "insert into map_watch_data_act(IMEI,Xloc,Yloc,Bat,RSSI,sos,watch_date,create_date,is_position,address,type,area) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, data.getIMEI());
			ps.setString(2, data.getYloc());
			ps.setString(3, data.getXloc());
			ps.setInt(4, data.getBat());
			ps.setInt(5, data.getRssi());
			ps.setInt(6, data.getSos());
			ps.setTimestamp(7, data.getWatchDate());
			ps.setTimestamp(8, data.getCreateDate());
			ps.setString(9, data.getIsPosition());
			ps.setString(10, data.getAddress());
			ps.setString(11, data.getType());
			ps.setString(12, data.getArea());
			
			ps.execute();
			result.setStatus(true);
			result.setMsg("保存成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result.setStatus(false);
			result.setMsg("操作失败");
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

	@Override
	public List<MapWatchData> getInfos(MapWatchData data) {
		// TODO Auto-generated method stub
		List<MapWatchData> infos = new ArrayList<MapWatchData>();
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "select * from map_watch_data_act where imei = ? and area is not null order by create_date desc limit 2";
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, data.getIMEI());
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				MapWatchData info = new MapWatchData();
				info.setIMEI(data.getIMEI());
				info.setArea(rs.getString("area"));
				infos.add(info);
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
		
		return infos;
	}

}
