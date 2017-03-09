package com.dk.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.dk.object.MysqlEntity;


public class MysqlUtil {
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
	public static Connection getConnection(){
		Connection conn = null;
		MysqlEntity mysqlEntity = new MysqlEntity();
		mysqlEntity = LoadMysql.getMysql();
		String url = mysqlEntity.getUrl();
		String userName = mysqlEntity.getUserName();
		String password = mysqlEntity.getPassword();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			

//			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.51:3306/gps?useUnicode=true&characterEncoding=UTF-8","root","hanxiao");
			conn = DriverManager.getConnection(url,userName,password);
//			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.214:3306/welleplus?useSSL=true&useUnicode=true&characterEncoding=UTF-8","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
