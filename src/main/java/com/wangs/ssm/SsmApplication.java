package com.wangs.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.wangs.ssh.config.DruidConfig;

//开启组件扫描和 自动配置,由三个注解组成@Configuration,@ComponentScan@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(basePackages="com.wangs.ssh.mapper")//将项目中对应的mapper类的路径加进来就可以了
/**
 * SpringBoot 扫描注解的四种方式
 *
 *
 */
// way1 编写xml文件，使用xml注解注入
//@ImportResource(locations = { "classpath:applicationContext.xml"})
// way2 手动添加要引入的配置文件，不太好
// @Import(DruidConfig.class)
// @PropertySource(value = "classpath:jdbc.properties", ignoreResourceNotFound = true)
// @PropertySource(value = { "classpath:application.yml" })

// way3 组件扫面的方式
@ComponentScan(basePackages = { "com.wangs.ssh.config" }) // 为什么自动扫描没好使呢？
// way4 若以上方式全都不存在，自动扫描classpath下的application.yml/application.properties
public class SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmApplication.class, args);
	}
}
