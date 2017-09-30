package com.dk.object;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: David
 * @Description: 报警信息Correlation
 * @Date: Created in 2017/8/23 10:32
 */
public class Warning implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8155325926937005463L;
	/**
     * 设备报警信息id
     */
    private int id;
    /**
     * 设备报警围栏名称
     */
    private String name;
    /**
     * 报警设备编号
     */
    private String imei;
    /**
     * 报警类型
     */
    private String warningType;
    private String warningTypeStr;
    /**
     * 报警时间
     */
    private String watchTime;
    /**
     * 围栏id
     */
    private Long fid;
    /**
     * 报警信息预留字段2
     */
    private String type2;
    
    private UserInfo user;
    private Fence fence;
    
    private String startDate;
    private String endDate;
    
    private int page;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getWarningType() {
        return warningType;
    }

    public void setWarningType(String warningType) {
        this.warningType = warningType;
    }

    public String getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(String watchTime) {
        this.watchTime = watchTime;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public Fence getFence() {
		return fence;
	}

	public void setFence(Fence fence) {
		this.fence = fence;
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

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getWarningTypeStr() {
		return warningTypeStr;
	}

	public void setWarningTypeStr(String warningTypeStr) {
		this.warningTypeStr = warningTypeStr;
	}


}
