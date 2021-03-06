package com.dk.object;

import java.io.Serializable;
import java.sql.Timestamp;

public class MapWatchData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3441271979679748495L;
	private long id;
	private String IMEI;
	private String xloc;
	private String yloc;
	private int bat;
	private int rssi;
	private int sos;
	private Timestamp watchDate;
	private Timestamp createDate;
	private String isPosition;
	private String address;
	private String type;
	
	private String gpsInfo;
	private String btsInfo;
	
	private String area;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	public String getXloc() {
		return xloc;
	}
	public void setXloc(String xloc) {
		this.xloc = xloc;
	}
	public String getYloc() {
		return yloc;
	}
	public void setYloc(String yloc) {
		this.yloc = yloc;
	}
	public int getBat() {
		return bat;
	}
	public void setBat(int bat) {
		this.bat = bat;
	}
	public int getRssi() {
		return rssi;
	}
	public void setRssi(int rssi) {
		this.rssi = rssi;
	}
	public Timestamp getWatchDate() {
		return watchDate;
	}
	public void setWatchDate(Timestamp watchDate) {
		this.watchDate = watchDate;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getIsPosition() {
		return isPosition;
	}
	public void setIsPosition(String isPosition) {
		this.isPosition = isPosition;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSos() {
		return sos;
	}
	public void setSos(int sos) {
		this.sos = sos;
	}
	public String getGpsInfo() {
		return gpsInfo;
	}
	public void setGpsInfo(String gpsInfo) {
		this.gpsInfo = gpsInfo;
	}
	public String getBtsInfo() {
		return btsInfo;
	}
	public void setBtsInfo(String btsInfo) {
		this.btsInfo = btsInfo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	

}
