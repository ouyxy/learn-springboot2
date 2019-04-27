package com.abin.springboot.configuration;

import com.abin.springboot.configuration.properties.StudentProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	private static final Log log = LogFactory.getLog(ApplicationTests.class);
	@Autowired
	private StudentProperties studentProperties;

	@Test
	public void testProperties() throws Exception {
		log.info("id: " + studentProperties.getId());
		log.info("name: " + studentProperties.getName());
		log.info("age: " + studentProperties.getAge());

		log.info("随机数测试输出：");
		log.info("随机字符串 : " + studentProperties.getValue());
		log.info("随机int : " + studentProperties.getNumber());
		log.info("随机long : " + studentProperties.getBignumber());
		log.info("随机10以下 : " + studentProperties.getTest1());
		log.info("随机10-20 : " + studentProperties.getTest2());

		log.info("获取当前环境的server port: " + studentProperties.getServerPort());
	}

	@Test
	public void contextLoads() {
	}

}
