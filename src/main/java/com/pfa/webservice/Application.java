package com.pfa.webservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application {
	
	public static final String APPLICATION_LOCATIONS = "spring.config.location="
			+ "classpath:application.yml,"
//			+ "C:\\git\\app\\config\\sws-pfa\\real-application.yml,"  /*로컬(windows)*/
			+ "/app/config/springboot-webservice/real-application.yml"; /*EC2*/

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class)
		.properties(APPLICATION_LOCATIONS)
		.run(args);
	}
}
