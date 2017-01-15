package com.app.wearkapampangan.action;

import com.app.wearkapampangan.model.User;
import com.app.wearkapampangan.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import freemarker.template.utility.StringUtil;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	
	private static final long serialVersionUID = 1L;
	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public void validate(){
		if(StringUtil.emptyToNull(user.getUsername()) == null)
			this.addFieldError("username", "Cant have a blank username");
		if(StringUtil.emptyToNull(user.getPassword()) == null)
			this.addFieldError("password", "Cant have a blank password");
	}

	@Override
	public User getModel() {
		return user;
	}
	
	@Override
	public String execute(){
		if(LoginService.isValidate(user))
			return SUCCESS;
		else
			return ERROR;
	}
}
