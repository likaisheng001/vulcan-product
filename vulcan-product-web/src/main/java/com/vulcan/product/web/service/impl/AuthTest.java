package com.vulcan.product.web.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chunbo.codegenerator.SerialNumberGenerator;
import com.vulcan.common.client.AuthClient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/product/core/spring-context.xml"})
public class AuthTest {
	@Value("${user.authority.url}")
	private String userAuthorityUrl;
	@Autowired
	private SerialNumberGenerator serialNumberGenerator;
		
	@Test
	public void test001(){
		userAuthorityUrl = "http://bkauthapi.prod.chunbo.com/getUserAuthorize.html";
		AuthClient authClient=new AuthClient(userAuthorityUrl);
		Long deptIds = authClient.getDeptByUseremailAndClass("wangyansong@chunbo.com",400L);
		System.out.println("deptIds:"+deptIds);
	}
	
	@Test
	public void testId(){
		for(int i = 0; i < 10; i++){
			System.out.println(serialNumberGenerator.generateNumber(7001)); 
		}
	}
}
