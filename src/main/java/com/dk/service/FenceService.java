package com.dk.service;

import java.util.List;

import com.dk.object.FenceInfo;

public interface FenceService {
	List<FenceInfo> getInfos(String imei);
	
	List<FenceInfo> getInfosAsImei(String imei);

}
