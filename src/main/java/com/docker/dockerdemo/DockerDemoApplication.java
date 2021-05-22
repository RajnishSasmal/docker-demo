package com.docker.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {
	
	@GetMapping("/message")
	public String getMessage(){
		System.out.println("HEY Dockerrrrrrrrrrrrrrrrrrrr");
		return "Hello Mr Docker11111111111111111111\\\\\\222222222222222222222!!!!!";
	}

	@GetMapping("/man")
	public String getMan(){
		System.out.println("HEY Man");
		return "Hey Man";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
