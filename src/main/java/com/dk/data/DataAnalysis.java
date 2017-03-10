package com.dk.data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dk.object.Data;
import com.dk.object.GPS;
import com.dk.object.Result;
import com.dk.service.SocketGpsService;
import com.dk.serviceImpl.SocketGpsServiceImpl;

public class DataAnalysis {
	
//	26 26 00 9b 12 30 dd 46 37 ee 90 36 33 38 3a 38 33 3a 34 35 3a 62 66 3a 61 66 3a 61 30 2c 33 34 2d 65 63 3a 32 36 3a 63 61 3a 64 39 3a 30 63 3a 34 61 2c 34 38 2d 36 30 3a 64 38 3a 31 39 3a 64 32 3a 39 33 3a 36 34 2c 35 38 2d 38 30 3a 38 39 3a 31 37 3a 33 62 3a 38 63 3a 35 65 2c 35 38 2d 38 38 3a 32 35 3a 39 33 3a 31 31 3a 39 38 3a 38 66 2c 36 30 40 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 2d 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 b3
//	26 26 00 db 12 30 dd 46 37 ee 90 37 32 30 31 35 30 39 32 34 2c 31 30 31 39 33 30 2c 41 2c 32 32 2e 35 36 34 30 32 35 2c 4e 2c 31 31 33 2e 32 34 32 33 32 39 2c 45 2c 35 2e 32 31 2c 31 35 32 2c 31 30 30 40 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 2d 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 40 33 38 3a 38 33 3a 34 35 3a 62 66 3a 61 66 3a 61 30 2c 33 34 2d 65 63 3a 32 36 3a 63 61 3a 64 39 3a 30 63 3a 34 61 2c 34 38 2d 36 30 3a 64 38 3a 31 39 3a 64 32 3a 39 33 3a 36 34 2c 35 38 2d 38 30 3a 38 39 3a 31 37 3a 33 62 3a 38 63 3a 35 65 2c 35 38 2d 38 38 3a 32 35 3a 39 33 3a 31 31 3a 39 38 3a 38 66 2c 36 30 40 31 30 30 40 31 40 31 c6
	public static void main(String[] args) {
		List<String> lists = getListString();
		String str = analysisData(lists);
//		System.out.println(data.getLength());
//		System.out.println(data.getIMEI());
//		System.out.println(data.getType());
//		System.out.println(data.getData());
//		System.out.println(data.getCode());
//		String str = useData(data);
		System.out.println(str);
//		String str = "2626332684432426";
//		List<String> datas = sendTransf(str);
//		for(String data:datas){
//			System.out.println(data);
//		}
	}
	
	
	
	
	//发送前转义
	public static String sendTransf(String str){
		List<String> datas = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		for(int i =4;i<str.length();i++){
			sb.append(str.charAt(i));
			if(i%2!=0){
				datas.add(sb.toString());
				sb.setLength(0);
			}
		}
		
		for(int i=0;i<datas.size();i++){
			String data = datas.get(i);
			if(data.equals("24")){
				datas.add(i+1,"00");
				continue;
			}else if(data.equals("26")){
				datas.set(i, "24");
				datas.add(i+1,"02");
				continue;
			}
		}
		
		datas.add(0,"26");
		datas.add(0,"26");
		
		sb.setLength(0);
		for(String data:datas){
			sb.append(data);
		}
		
		return sb.toString();
	}
	
	
	//接收后转义
	public static List<String> getTransf(String[] strs){
		List<String> lists = new ArrayList<String>();
		if((strs[0]+strs[1]).equals("2626")){
			lists.add("26");
			lists.add("26");
			for(int i = 2;i<strs.length;i++){
				if(strs[i].equals("24")&&strs[i+1].equals("00")){
					lists.add("24");
					i += 1;
					continue;
				}else if(strs[i].equals("24")&&strs[i+1].equals("02")){
					lists.add("26");
					i += 1;
					continue;
				}else{
					lists.add(strs[i]);
				}
			}
//			for(String list:lists){
//				System.out.println(list);
//			}
		}
		return lists;
	}
	
	
	public static List<String> getListString(){
//		String str = "26 26 00 db 12 30 dd 46 37 ee 90 37 32 30 31 35 30 39 32 34 2c 31 30 31 39 33 30 2c 41 2c 32 32 2e 35 36 34 30 32 35 2c 4e 2c 31 31 33 2e 32 34 32 33 32 39 2c 45 2c 35 2e 32 31 2c 31 35 32 2c 31 30 30 40 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 2d 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 40 33 38 3a 38 33 3a 34 35 3a 62 66 3a 61 66 3a 61 30 2c 33 34 2d 65 63 3a 32 36 3a 63 61 3a 64 39 3a 30 63 3a 34 61 2c 34 38 2d 36 30 3a 64 38 3a 31 39 3a 64 32 3a 39 33 3a 36 34 2c 35 38 2d 38 30 3a 38 39 3a 31 37 3a 33 62 3a 38 63 3a 35 65 2c 35 38 2d 38 38 3a 32 35 3a 39 33 3a 31 31 3a 39 38 3a 38 66 2c 36 30 40 31 30 30 40 31 40 31 c6";
//		String str = "26 26 00 9b 12 30 dd 46 37 ee 90 36 33 38 3a 38 33 3a 34 35 3a 62 66 3a 61 66 3a 61 30 2c 33 34 2d 65 63 3a 32 36 3a 63 61 3a 64 39 3a 30 63 3a 34 61 2c 34 38 2d 36 30 3a 64 38 3a 31 39 3a 64 32 3a 39 33 3a 36 34 2c 35 38 2d 38 30 3a 38 39 3a 31 37 3a 33 62 3a 38 63 3a 35 65 2c 35 38 2d 38 38 3a 32 35 3a 39 33 3a 31 31 3a 39 38 3a 38 66 2c 36 30 40 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 2d 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 b3";
//		String str = "26 26 00 09 00 00 00 01 e2 40 90 20 13";
		String str = "26 26 00 0a 00 00 00 01 e2 40 90 20 01 12";
		String[] strs = str.split(" ");
		List<String> lists = new ArrayList<String>();
		if((strs[0]+strs[1]).equals("2626")){
			lists.add("26");
			lists.add("26");
			for(int i = 2;i<strs.length;i++){
				if(strs[i].equals("24")&&strs[i+1].equals("00")){
					lists.add("24");
					i += 1;
					continue;
				}else if(strs[i].equals("24")&&strs[i+1].equals("02")){
					lists.add("26");
					i += 1;
					continue;
				}else{
					lists.add(strs[i]);
				}
			}
//			for(String list:lists){
//				System.out.println(list);
//			}
		}
		return lists;
	}
	
	public static String analysisData(List<String> strs){
		String returnStr = "";//返回值
		Data data = new Data();
//		getListString();
		List<String> lists = getListString();
//		String str = analysisData(lists);
		String str = lists.get(2)+lists.get(3);
		int length = Integer.parseInt(str,16);
		data.setLength(length);
		System.out.println("length:"+length);
		StringBuffer sb = new StringBuffer();
		StringBuffer imei = new StringBuffer();
		for(int i = 4;i<=9;i++){
			imei.append(lists.get(i));
			sb.append(Integer.parseInt(lists.get(i),16));
		}
		System.out.println("IMEI:"+imei.toString());
		data.setEquipNo(imei.toString());
		String IMEIConv = sb.toString();
		System.out.println("IEMIConv:"+IMEIConv);
		data.setIMEI(IMEIConv);
		sb.setLength(0);
		String type = lists.get(10)+lists.get(11);
		System.out.println("type:"+type);
		data.setType(type);
		switch (type) {
		case "9037":
			returnStr = handle9037(lists, data);
			break;
			
//		case "9036":
//			returnStr = handle9036(lists,data);
//			break;
			
		case "9020":
			returnStr = handle9020(lists,data);
			break;

		default:
			break;
		}
		
		
		
		return returnStr;
	}
	
	//9020
	public static String handle9020(List<String> lists,Data data){
		StringBuffer sb = new StringBuffer();
		if(lists.size()==13||lists.size()==14&&Integer.parseInt(lists.get(lists.size()-2))==0){
			data.setData("0");
			data.setCode(lists.get(lists.size()-1));
		}else if(lists.size()==14){
			data.setData("1");
			data.setCode(lists.get(lists.size()-1));
		}else{
			try {
				throw new Exception("数据格式错误");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//返回
		sb.append(2626);
		sb.append("0011");
		sb.append(data.getEquipNo());
		sb.append(9920);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		if(data.getData().equals("0")){
			System.out.println(0);
			long utcTime = date.getTime();
//			long utcTime = 1344686758109L;
			String utc = Long.toHexString(utcTime);
			for(int i=utc.length();i<16;i++){
				utc = 0 + utc;
			}
			sb.append(utc);
			sb.append(data.getCode());
		}
		if(data.getData().equals("1")){
			System.out.println(1);
			StringBuffer stringBuffer = new StringBuffer();
			List<String> times = new ArrayList<String>();
			String utcTime = sdf.format(date);
			for(int i =0;i<utcTime.length();i++){
				stringBuffer.append(utcTime.charAt(i));
				if(i%2!=0){
					times.add(stringBuffer.toString());
					stringBuffer.setLength(0);
				}
			}
			for(String time:times){
				int intTime = Integer.parseInt(time);
				String strTime = Integer.toHexString(intTime);
				if(strTime.length()<2){
					strTime = 0 + strTime;
				}
				sb.append(strTime);
			}
			sb.append("00");
			sb.append(data.getCode());
			System.out.println("end");
		}
		
		return sendTransf(sb.toString());
//		return sb.toString();
	}
	
	//9036
	public static String handle9036(List<String> lists,Data data){
		StringBuffer sb = new StringBuffer();
		for(int i =12;i<lists.size()-1;i++){
			int num = Integer.parseInt(lists.get(i),16);
			sb.append((char)num);
		}
		String dataStr = sb.toString();
//		String[] datas = dataStr.split("@");
//		for(int i =0;i<datas.length;i++){
//			System.out.println(datas[i]);
//		}
		data.setData(dataStr);
		data.setCode(lists.get(lists.size()-1));
		
		//处理data
		
		sb.setLength(0);
		sb.append(2626);
		sb.append("001d");
		sb.append(data.getEquipNo());
		sb.append(9936);
		sb.append(9036);
		
		//报文体
		
		sb.append(data.getCode());
		
		return sendTransf(sb.toString());
	}
	
	//9037
	public static String handle9037(List<String> lists,Data data){
		StringBuffer sb = new StringBuffer();
		for(int i = 12;i<lists.size()-1;i++){
			int num = Integer.parseInt(lists.get(i),16);
			sb.append((char)num);
		}
		String datadata = sb.toString();
		String[] datas = datadata.split("@");
		for(int i = 0;i<datas.length;i++){
			System.out.println(datas[i]);
		}
		System.out.println("data:"+datadata);
		data.setData(datadata);
		String code = lists.get(lists.size()-1);
		System.out.println("code:"+code);
		data.setCode(code);
		
		
		useData9037(data);
		
		sb.setLength(0);
		sb.append(2626);
		sb.append("0012");
		sb.append(data.getEquipNo());
		sb.append(9937);
		sb.append(9037);
		sb.append(30);//第三个字节
		sb.append(30);//第四个字节
		sb.append(30);//第五个字节
		sb.append(30);//第六个字节
		
		
		return sendTransf(sb.toString());
	}
	
	public static String useData9037(Data data){
		SocketGpsService gpsService = new SocketGpsServiceImpl();
		GPS gps = new GPS();
		String dataStr = data.getData();
		String[] strs = dataStr.split("@");
		String gpsStr = strs[0];
		String stationStr = strs[1];
		String wifiStr = strs[2];
		String eleStr = strs[3];
		String gsensor = strs[4];
		String acc = strs[5];
//		System.out.println(gpsStr);
//		System.out.println(stationStr);
//		System.out.println(wifiStr);
//		System.out.println(eleStr);
//		System.out.println(gsensor);
//		System.out.println(acc);
		String[] gpsData  = gpsStr.split(",");
//		for(int i = 0;i<gpsData.length;i++){
//			System.out.println(gpsData[i]);
//		}
		gps.setDate(gpsData[0]);
		gps.setTime(gpsData[1]);
		gps.setIsPosition(gpsData[2]);
		gps.setLatitude(gpsData[3]);
		gps.setLongitude(gpsData[5]);
		gps.setSpeed(gpsData[7]);
		gps.setDirection(gpsData[8]);
		gps.setAltitude(gpsData[9]);
		gps.setEquipmentNo(data.getIMEI());
		gps.setStation(stationStr);
		gps.setWifi(wifiStr);
		gps.setEle(eleStr);
		gps.setGsensor(gsensor);
		gps.setAcc(acc);
		System.out.println("gps-----------------");
		System.out.println(gps.getDate());
		System.out.println(gps.getTime());
		System.out.println(gps.getIsPosition());
		System.out.println(gps.getLatitude());
		System.out.println(gps.getLongitude());
		System.out.println(gps.getSpeed());
		System.out.println(gps.getDirection());
		System.out.println(gps.getAltitude());
		
		
		//保存数据
		Result result = gpsService.addGps(gps);
		return result.getMsg();
		
//		return null;
	}

}
