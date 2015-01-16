package com.liming.service;

import java.util.List;

public interface LoginAuthoriedService {
	public String checkUserExist(String userid);
	public String checkLoginValid(String userid,String password);
	public List getMember();
}
