package com.iyang.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project : spring-boot-build
 * @auhtor : luohong
 * @since : 2021/4/18
 */

@RestController
@RequestMapping("/hello")
public class HelloController {


	@GetMapping("/hello")
	public String hello(){
		return "this is hello world.";
	}

}
