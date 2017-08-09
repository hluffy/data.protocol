package com.dk.object;

import java.io.Serializable;
import java.sql.Timestamp;

public class SettingInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4767210135631564794L;
	private Integer id;
	private Integer pfid;
	private Timestamp startDate;
	private Timestamp endDate;
	private String type;
	private String state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPfid() {
		return pfid;
	}
	public void setPfid(Integer pfid) {
		this.pfid = pfid;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
