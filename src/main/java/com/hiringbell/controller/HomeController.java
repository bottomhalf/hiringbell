package com.hiringbell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
// @EnableGlobalMethodSecurity(prePostEnabled = true)
public class HomeController {

	@GetMapping("/dashboard")
	// @PreAuthorize("hasRole('NORMAL')")
	public String dashboardPage() {
		return "You are in dashboard page";
	}
}
