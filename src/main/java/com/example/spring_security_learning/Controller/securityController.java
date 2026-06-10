package com.example.spring_security_learning.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class securityController {

	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello Security";
	    }
}
