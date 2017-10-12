package com.vulcan.product.core.test;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/product/core/spring-context.xml"})
public class BaseTest {
	public Logger logger = Logger.getLogger(this.getClass());
}
