package com.liming.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liming.rmi.serviceimpl.Member;
import com.liming.service.LoginAuthoriedService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:RMIService.xml" })
public class RmiClientTest {

	@Autowired
	private LoginAuthoriedService loginAuthoriedServiceTest;

	/**
	 * 连通性测试
	 */
	@Test
	public void connectionTestCase() {
		 loginAuthoriedServiceTest.checkUserExist("dgfahghad");
		List<Member> list = loginAuthoriedServiceTest.getMember();
		for (Member meber : list) {
			System.out.println(meber.getEmail());
		}
	}
}
