package com.probase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;


@Controller
//@RestController
//@RequestMapping("/user")
public class ResourceController {
	
	@RequestMapping
	public String home() {
		
		return "home.jsp";
	}

	@RequestMapping("/login")
	public String loginPage() {
		
		return "login.jsp";
	}
	@RequestMapping("/logout-success")
	public String logoutPage() {
		
		return "logout.jsp";
	}
}
