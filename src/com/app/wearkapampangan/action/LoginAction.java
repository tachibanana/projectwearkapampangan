package com.app.wearkapampangan.action;

public class LoginAction {
	
	private String name;
	
	
	public String execute(){
		System.out.println(name);
		return "login";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
