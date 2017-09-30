package com.dk.object;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author: David
 * @Description:电子围栏及围栏报警设置信息
 * @Date: Created in 2017/8/22 10:34
 */
public class Fence implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5767966534925131036L;
	/**
     * 电子围栏及其设置信息id
     */
    private Long id;
    /**
     * 围栏名称
     */
    private String name;
    /**
     * 围栏坐标1点经度
     */
    private String Xloc;
    /**
     * 围栏坐标1点纬度
     */
    private String Yloc;
    /**
     * 围栏坐标2点经度
     */
    private String Xloc1;
    /**
     * 围栏坐标2点纬度
     */
    private String Yloc1;
    /**
     * 围栏坐标3点经度
     */
    private String Xloc2;
    /**
     * 围栏坐标3点纬度
     */
    private String Yloc2;
    /**
     * 围栏坐标4点经度
     */
    private String Xloc3;
    /**
     * 围栏坐标4点纬度
     */
    private String Yloc3;
    /**
     * 围栏坐标5点经度
     */
    private String Xloc4;
    /**
     * 围栏坐标5点纬度
     */
    private String Yloc4;
    /**
     * 圆形围栏半径
     */
    private String radius;
    /**
     * 围栏状态
     */
    private String state;
    /**
     * 围栏信息添加时间
     */
    private String creatDate;
    /**
     * 围栏信息修改时间
     */
    private String updateDate;
    /**
     * 围栏报警设置类型
     */
    private String warningType;
    private String warningTypeStr;
    /**
     * 围栏报警设置开启时间
     */
    private String startDate;
    /**
     * 围栏报警设置结束时间
     */
    private String endDate;
    /**
     * 围栏所属机构级别
     */
    private String grade;
    /**
     * 围栏信息及其设置信息预留字段1
     */
    private String type1;
    /**
     * 围栏信息及其设置信息预留字段2
     */
    private String type2;
    /**
     * 围栏所属上级id
     */
    private Long pid;
    
    
    private List<String> lnglat;
    private List<Long> ids;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXloc() {
        return Xloc;
    }

    public void setXloc(String xloc) {
        Xloc = xloc;
    }

    public String getYloc() {
        return Yloc;
    }

    public void setYloc(String yloc) {
        Yloc = yloc;
    }

    public String getXloc1() {
        return Xloc1;
    }

    public void setXloc1(String xloc1) {
        Xloc1 = xloc1;
    }

    public String getYloc1() {
        return Yloc1;
    }

    public void setYloc1(String yloc1) {
        Yloc1 = yloc1;
    }

    public String getXloc2() {
        return Xloc2;
    }

    public void setXloc2(String xloc2) {
        Xloc2 = xloc2;
    }

    public String getYloc2() {
        return Yloc2;
    }

    public void setYloc2(String yloc2) {
        Yloc2 = yloc2;
    }

    public String getXloc3() {
        return Xloc3;
    }

    public void setXloc3(String xloc3) {
        Xloc3 = xloc3;
    }

    public String getYloc3() {
        return Yloc3;
    }

    public void setYloc3(String yloc3) {
        Yloc3 = yloc3;
    }

    public String getXloc4() {
        return Xloc4;
    }

    public void setXloc4(String xloc4) {
        Xloc4 = xloc4;
    }

    public String getYloc4() {
        return Yloc4;
    }

    public void setYloc4(String yloc4) {
        Yloc4 = yloc4;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(String creatDate) {
        this.creatDate = creatDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getWarningType() {
        return warningType;
    }

    public void setWarningType(String warningType) {
        this.warningType = warningType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
    

    public List<String> getLnglat() {
		return lnglat;
	}

	public void setLnglat(List<String> lnglat) {
		this.lnglat = lnglat;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public String getWarningTypeStr() {
		return warningTypeStr;
	}

	public void setWarningTypeStr(String warningTypeStr) {
		this.warningTypeStr = warningTypeStr;
	}

}
