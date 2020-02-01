package com.its.webservice.client.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tuannx - itshare
 *
 */

@SpringBootApplication
@ComponentScan("com.its.*")
@EnableAutoConfiguration
public class ITSWebserviceCxfClientBootApp {
	public static void main(String[] args) {
		SpringApplication.run(ITSWebserviceCxfClientBootApp.class, "");
	}
}
