package com.bot.hiringbell;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("auth")
	public String AuthUser() {
		
		return "Login success fully";
	}
}
