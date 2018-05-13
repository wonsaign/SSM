package com.wangs.ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ImportResource(locations = { "classpath:applicationContext.xml"})
public class SsmApplicationTests {

	@Test
	public void contextLoads() {
	}

}
