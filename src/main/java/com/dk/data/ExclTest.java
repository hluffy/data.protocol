package com.dk.data;

import java.util.ArrayList;
import java.util.List;


public class ExclTest {
	public static String returnString(String str){
		String returnStr = "";
		StringBuffer sb = new StringBuffer();
		List<String> lists = new ArrayList<String>();
		for(int i=0;i<str.length();i++){
			sb.append(str.charAt(i));
			if(i%2!=0){
				lists.add(sb.toString());
				sb.setLength(0);
			}
		}
		int start = Integer.parseInt(lists.get(0),16);
		int end = 0;
		for(int i =1;i<lists.size();i++){
			end = Integer.parseInt(lists.get(i),16);
			start = start^end;
		}
		returnStr = Integer.toHexString(start);
		if(returnStr.length()<2){
			returnStr = 0 + returnStr;
		}
		return returnStr;
	}
	
	public static void main(String[] args) {
//		String str = "12 30 dd 46 37 ee 90 37 32 30 31 35 30 39 32 34 2c 31 30 31 39 33 30 2c 41 2c 32 32 2e 35 36 34 30 32 35 2c 4e 2c 31 31 33 2e 32 34 32 33 32 39 2c 45 2c 35 2e 32 31 2c 31 35 32 2c 31 30 30 40 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 2d 31 30 31 33 33 2c 35 31 37 33 2c 34 36 30 2c 30 31 2c 36 36 40 33 38 3a 38 33 3a 34 35 3a 62 66 3a 61 66 3a 61 30 2c 33 34 2d 65 63 3a 32 36 3a 63 61 3a 64 39 3a 30 63 3a 34 61 2c 34 38 2d 36 30 3a 64 38 3a 31 39 3a 64 32 3a 39 33 3a 36 34 2c 35 38 2d 38 30 3a 38 39 3a 31 37 3a 33 62 3a 38 63 3a 35 65 2c 35 38 2d 38 38 3a 32 35 3a 39 33 3a 31 31 3a 39 38 3a 38 66 2c 36 30 40 31 30 30 40 31 40 31";//c6
//		String str = "00 00 00 01 e2 40 99 20 14 0c 08 1f 14 05 3a 00";//3e
//		String str = "44 45 36 d8 c3 a1 99 35 90 35 7b 74 63 70 3a 2f 2f 31 31 35 2e 32 39 2e 31 33 39 2e 31 37 31 3a 36 30 30 30 7d";//ff
		String str = "42 EA 10 4D 80 48 99 20 14 11 03 0e 0b 0d 28 00";//
		String[] strs = str.split(" ");
//		int i = 0;
		int start = Integer.parseInt(strs[0],16);
		int end = 0;
		for(int i =1;i<strs.length;i++){
			end = Integer.parseInt(strs[i],16);
			start = start^end;
		}
		System.out.println(Integer.toHexString(start));
//		while(i<strs.length-1){
//			start = Integer.parseInt(strs[i],16);
//			end = Integer.parseInt(strs[i+1],16);
//			start = start^end;
//			i++;
////			System.out.println(start);
//			System.out.println(Integer.toHexString(start));
//		}
//		System.out.println(Integer.toHexString(end));
//		Date date = new Date();
//		System.out.println(date.getTime());
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//		String str = sdf.format(date);
//		StringBuffer sb = new StringBuffer();
//		List<String> lists = new ArrayList<String>();
//		for(int i=0;i<str.length();i++){
//			sb.append(str.charAt(i));
//			if(i%2!=0){
//				lists.add(sb.toString());
//				sb.setLength(0);
//			}
//		}
//		for(String list:lists){
//			System.out.println(list);
//		}
	}
}
