package com.dk.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.dk.object.Cdma;
import com.dk.object.FenceInfo;
import com.dk.object.UrlParam;
import com.dk.service.FenceService;
import com.dk.serviceImpl.FenceServiceImpl;
import com.dk.url.UrlConnection;

//import org.apache.log4j.Logger;


public class Test {
//	private static Logger logger = Logger.getLogger(Test.class);
//	public static void main(String[] args) {
//		logger.debug("this debug");
//		logger.info("this info");
//		logger.error("this error");
//		logger.error("add error");
		
//	}
	public static void main(String[] args) {
//		String url = "http://apilocate.amap.com/position";
//		UrlParam param = new UrlParam();
//		Cdma cdmaParam1 = new Cdma();
////		3653,9711,460,00,35
//		cdmaParam1.setCellid(3653);
//		cdmaParam1.setLac(9711);
//		cdmaParam1.setMcc(460);
//		cdmaParam1.setMnc(00);
//		cdmaParam1.setSignal(35);
////		3653,9711,460,00,32
//		Cdma cdmaParam2 = new Cdma();
//		cdmaParam2.setCellid(3653);
//		cdmaParam2.setLac(9711);
//		cdmaParam2.setMcc(460);
//		cdmaParam2.setMnc(00);
//		cdmaParam2.setSignal(32);
//		param.setKey("1636237f66e5b31aeb50fd05130d4dc8");
//		param.setAccesstype(0);
//		param.setImei("355048040010449");
//		param.setCdma(0);
//		param.setNetwork("GPRS");
//		param.setBts(cdmaParam1.toString());
//		param.setNearbts(cdmaParam2.toString());
//		param.setOutput("json");
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("key", param.getKey());
//		map.put("accesstype", param.getAccesstype());
//		map.put("imei", param.getImei());
//		map.put("cdma", 0);
//		map.put("network", "GPRS");
//		map.put("bts", param.getBts());
//		map.put("nearbts", param.getNearbts());
//		map.put("output", param.getOutput());
//		
//		String result = UrlConnection.sendGet(url, map);
//		System.out.println(result);
		
		FenceService server = new FenceServiceImpl();
		String imei = "355048040008195";
//		List<FenceInfo> infos = server.getInfos();
//		for (FenceInfo info : infos) {
//			System.out.println(info.getLatitude());
//			System.out.println(info.getLongitude());
//			System.out.println(info.getRadius());
//		}
		List<FenceInfo> infos = server.getInfosAsImei(imei);
		for (FenceInfo info : infos) {
			System.out.println(info.getSettingInfo().getState());
			System.out.println(info.getName());
		}
		
	}
//	public static void main(String[] args) {
//		String str = "aaaaa";
//		String[] strs = str.split(":");
//		for(int i =0;i<strs.length;i++){
//			System.out.println(strs[i]);
//		}
//	}

}
