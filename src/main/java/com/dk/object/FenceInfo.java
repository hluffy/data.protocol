package com.dk.object;

import java.io.Serializable;
import java.sql.Timestamp;

public class FenceInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7336828657578398703L;
	private Integer id;
	private String name;
	private Double latitude;
	private Double longitude;
	private Integer radius;
	private Timestamp dateCreated;
	
	private SettingInfo settingInfo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Integer getRadius() {
		return radius;
	}
	public void setRadius(Integer radius) {
		this.radius = radius;
	}
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	public SettingInfo getSettingInfo() {
		return settingInfo;
	}
	public void setSettingInfo(SettingInfo settingInfo) {
		this.settingInfo = settingInfo;
	}
	

}
