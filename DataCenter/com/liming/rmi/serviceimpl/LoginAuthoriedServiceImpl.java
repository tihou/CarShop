package com.liming.rmi.serviceimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.liming.service.LoginAuthoriedService;

public class LoginAuthoriedServiceImpl implements LoginAuthoriedService {
	@Autowired
	private DataSource dataSource;
	
	@Override
	public String checkUserExist(String userid) {
		return "我爱你"+userid;
	}

	@Override
	public String checkLoginValid(String userid, String password) {
		return null;
	}

	@Override
	public  List getMember() {
		List<Member> list = new ArrayList<Member>();
		try {
			ResultSet rs = dataSource.getConnection().createStatement().executeQuery("select * from t_members");
			while (rs.next()) {
				Member member = new Member();
				member.setEmail(rs.getString("email"));
				list.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
