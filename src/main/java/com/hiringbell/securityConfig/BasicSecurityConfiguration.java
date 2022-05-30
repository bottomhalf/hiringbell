package com.hiringbell.securityConfig;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configurable
@EnableWebSecurity
public class BasicSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests(auth -> 
			auth.antMatchers("/home/**").hasRole("NORMAL")
			.anyRequest()
					.authenticated()
		)
				.httpBasic();
		
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailService() {
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("istiyak")
				.password("istiyak")
				.roles("ADMIN")
				.build();
		
		UserDetails nuser = User.withDefaultPasswordEncoder()
				.username("rohit")
				.password("test")
				.roles("NORMAL")
				.build();
		
		var userList = new ArrayList<UserDetails>();
		userList.add(nuser);
		userList.add(user);
		
		return new InMemoryUserDetailsManager(userList);
	}
	
//	@Bean
//	public PasswordEncoder encodePassword() {
//		return new BCryptPasswordEncoder(10);
//	}
} 
