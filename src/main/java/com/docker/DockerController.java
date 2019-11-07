package com.docker;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCaching
public class DockerController {
	@GetMapping("/docker")
	public String dockerHello() {
		return "Hello docker";
	}
}
