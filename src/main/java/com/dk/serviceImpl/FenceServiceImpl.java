package com.dk.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dk.object.Fence;
import com.dk.object.FenceInfo;
import com.dk.object.SettingInfo;
import com.dk.service.FenceService;
import com.dk.util.DBUtil;

public class FenceServiceImpl implements FenceService{

	@Override
	public List<FenceInfo> getInfos(String imei) {
		// TODO Auto-generated method stub
		List<FenceInfo> infos = new ArrayList<FenceInfo>();
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "select * from pmfence where id in (select fenceId from t_fence_admin where adminId in(select admin_id from t_user_admin where pmequipment_id in(select id from pmequipment where imei=?)))";
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, imei);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				FenceInfo info = new FenceInfo();
				info.setId(rs.getInt("id"));
				info.setName(rs.getString("name"));
				info.setLatitude(rs.getDouble("latitude1"));
				info.setLongitude(rs.getDouble("longitude1"));
				info.setRadius(rs.getInt("radius"));
				info.setDateCreated(rs.getTimestamp("DateCreated"));
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

	@Override
	public List<FenceInfo> getInfosAsImei(String imei) {
		// TODO Auto-generated method stub
		List<FenceInfo> infos = new ArrayList<FenceInfo>();
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "select * from pmfence as p LEFT JOIN t_setting as s on(p.id = s.pfid) where p.id in (select fenceId from t_fence_admin where adminId in(select admin_id from t_user_admin where pmequipment_id in(select id from pmequipment where imei=?))) ";
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, imei);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				FenceInfo fInfo = new FenceInfo();
				SettingInfo sInfo = new SettingInfo();
				fInfo.setId(rs.getInt("id"));
				fInfo.setName(rs.getString("name"));
				fInfo.setLatitude(rs.getDouble("latitude1"));
				fInfo.setLongitude(rs.getDouble("longitude1"));
				fInfo.setRadius(rs.getInt("radius"));
				fInfo.setDateCreated(rs.getTimestamp("DateCreated"));
				
//				sInfo.setId(rs.getInt("id1"));
				sInfo.setPfid(rs.getInt("pfid"));
				sInfo.setStartDate(rs.getTimestamp("startDate"));
				sInfo.setEndDate(rs.getTimestamp("endDate"));
				sInfo.setType(rs.getString("type"));
				sInfo.setState(rs.getString("state"));
				
				fInfo.setSettingInfo(sInfo);
				
				infos.add(fInfo);
				
				
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

	@Override
	public Fence getFenceInfo(Long pid) {
		// TODO Auto-generated method stub
		Fence info = new Fence();
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select * from t_fence where pid = ?";
			ps = conn.prepareStatement(sql);
			ps.setLong(1, pid);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				info.setId(rs.getLong("id"));
				info.setName(rs.getString("name"));
				info.setXloc(rs.getString("Xloc"));
				info.setYloc(rs.getString("Yloc"));
				info.setXloc1(rs.getString("Xloc1"));
				info.setYloc1(rs.getString("Yloc1"));
				info.setXloc2(rs.getString("Xloc2"));
				info.setYloc2(rs.getString("Yloc2"));
				info.setXloc3(rs.getString("Xloc3"));
				info.setYloc3(rs.getString("Yloc3"));
				info.setXloc4(rs.getString("Xloc4"));
				info.setYloc4(rs.getString("Yloc4"));
				info.setState(rs.getString("state"));
				info.setWarningType(rs.getString("warningtype"));
				info.setStartDate(rs.getString("startdate"));
				info.setEndDate(rs.getString("enddate"));
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

}
