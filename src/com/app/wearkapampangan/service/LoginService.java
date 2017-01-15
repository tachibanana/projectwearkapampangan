package com.app.wearkapampangan.service;

import com.app.wearkapampangan.model.User;

public class LoginService {
	public static boolean isValidate(User user){
		try{
			if(user.getUsername().equals("rafael") && user.getPassword().equals("admin")){
				return true;
			}
			return false;
		}catch(NullPointerException e){
			e.printStackTrace();
			return false;
		}
	}
}
