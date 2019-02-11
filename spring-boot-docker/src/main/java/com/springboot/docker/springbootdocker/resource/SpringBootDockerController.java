package com.springboot.docker.springbootdocker.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootDockerController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello Docker";
	}

}
