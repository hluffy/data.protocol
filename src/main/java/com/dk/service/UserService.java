package com.dk.service;

import com.dk.object.UserInfo;

public interface UserService {
	UserInfo getUserInfo(String imei);
	void updateUserInfo(int isin,String equipnumber);

}
