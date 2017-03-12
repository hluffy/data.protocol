package com.dk.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class UrlConnection {
	public static String sendGet(String url,Map<String,Object> paramMap){
		StringBuffer params = new StringBuffer();
		for(Object key:paramMap.keySet()){
			params.append(key+"="+paramMap.get(key));
			params.append("&");
		}
		String result = "";
		StringBuffer sb = new StringBuffer();
		
		String activeUrl = url + "?" + params.toString().substring(0,params.toString().length()-1);
		System.out.println("activeUrl:"+activeUrl);
		String line;
		BufferedReader in = null;
		try {
			URL getUrl = new URL(activeUrl);
			URLConnection urlConnection = getUrl.openConnection();
			
			//设置请求参数
			urlConnection.setRequestProperty("Accept", "*/*");
			urlConnection.setRequestProperty("Accept-Encoding", "gzip, deflate, sdch");
			urlConnection.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.8");
			urlConnection.setRequestProperty("Connection", "keep-alive");
			urlConnection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36");
			
			//实际连接
			urlConnection.connect();
			
			//获取所有响应头字段
			Map<String,List<String>> map = urlConnection.getHeaderFields();
			
			for(String key:map.keySet()){
				System.out.println(key+"-----"+map.get(key));
			}
			in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			while((line=in.readLine()) != null){
				sb.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return sb.toString();
	}

}
