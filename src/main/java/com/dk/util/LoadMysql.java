package com.dk.util;

import java.util.Properties;

import com.dk.object.MysqlEntity;


public class LoadMysql {
	public static MysqlEntity getMysql(){
		Properties prop = new Properties();
//		List<MysqlEntity> datas = new ArrayList<MysqlEntity>();
		MysqlEntity mysqlEntity = new MysqlEntity();
		try {
//			InputStream in = new BufferedInputStream(new FileInputStream("../resources/mysql.properties"));
			prop.load(LoadMysql.class.getClassLoader().getResourceAsStream("mysql.properties"));
			for(Object key:prop.keySet()){
//				System.out.println(key);
//				System.out.println(prop.get(key));
				if(key.equals("jdbc.url")){
					mysqlEntity.setUrl(prop.get(key).toString());
				}
				if(key.equals("username")){
					mysqlEntity.setUserName(prop.get(key).toString());
				}
				if(key.equals("password")){
					mysqlEntity.setPassword(prop.get(key).toString());
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mysqlEntity;
	}
	
//	public static void main(String[] args) {
//		MysqlEntity mysqlEntity = getMysql();
//		System.out.println(mysqlEntity.getUrl());
//		System.out.println(mysqlEntity.getUserName());
//		System.out.println(mysqlEntity.getPassword());
//	}

}
