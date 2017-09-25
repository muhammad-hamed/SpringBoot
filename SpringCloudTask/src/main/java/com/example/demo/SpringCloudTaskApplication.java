package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}

	@Bean
	public SampleCloudTask getSampleCloudTask() {
		return new SampleCloudTask();
	}

	public class SampleCloudTask implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {
			
			Arrays.asList(args).stream().forEach(str-> System.out.println(str));
	
		}

	}
}
