package com.dk.object;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class UserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6175233045321713805L;
	private Long id;
	private String userName;
	private String password;
	private String sex;
	private String role;
	private String phonenumber;
	private String email;
	private String name;
	private String creatdate;
	private Long rid;
	private String equipnumber;
	private int equipstate;
	private int equiptype;
	private int worktype;
	private String type2;
	private Integer isin;
	private String getdate;
	
	
	private String param;
	
	/**
     * 开始时间
     */
    private String startdate;
    /**
     * 结束时间
     */
    private String enddate;
	
	
	
	private List<Long> ids;//当前用户管理的下级组织id
	private Long grade;
	private String equipTypeStr;
	private String equipStateStr;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatdate() {
		return creatdate;
	}
	public void setCreatdate(String creatdate) {
		this.creatdate = creatdate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Long> getIds() {
		return ids;
	}
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}
	public Long getGrade() {
		return grade;
	}
	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getRid() {
		return rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getEquipnumber() {
		return equipnumber;
	}
	public void setEquipnumber(String equipnumber) {
		this.equipnumber = equipnumber;
	}
	public int getEquipstate() {
		return equipstate;
	}
	public void setEquipstate(int equipstate) {
		this.equipstate = equipstate;
	}
	public int getEquiptype() {
		return equiptype;
	}
	public void setEquiptype(int equiptype) {
		this.equiptype = equiptype;
	}
	public int getWorktype() {
		return worktype;
	}
	public void setWorktype(int worktype) {
		this.worktype = worktype;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	public Integer getIsin() {
		return isin;
	}
	public void setIsin(Integer isin) {
		this.isin = isin;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getGetdate() {
		return getdate;
	}
	public void setGetdate(String getdate) {
		this.getdate = getdate;
	}
	public String getEquipTypeStr() {
		return equipTypeStr;
	}
	public void setEquipTypeStr(String equipTypeStr) {
		this.equipTypeStr = equipTypeStr;
	}
	public String getEquipStateStr() {
		return equipStateStr;
	}
	public void setEquipStateStr(String equipStateStr) {
		this.equipStateStr = equipStateStr;
	}
	

}
