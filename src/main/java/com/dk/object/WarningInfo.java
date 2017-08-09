package com.dk.object;

import java.io.Serializable;
import java.sql.Timestamp;

public class WarningInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5638319174872846535L;
	private Integer id;
	private String equipmentNum;
	private String area;
	private String type;
	private Timestamp date;
	private String description;
	public String getEquipmentNum() {
		return equipmentNum;
	}
	public void setEquipmentNum(String equipmentNum) {
		this.equipmentNum = equipmentNum;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
