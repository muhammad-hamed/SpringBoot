package com.vfeg.bootappdeployable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SprintBootAppDeployableToTomcatApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootAppDeployableToTomcatApplication.class, args);
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
}
