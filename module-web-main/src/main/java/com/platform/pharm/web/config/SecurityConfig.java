package com.platform.pharm.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/js/**", "/css/**");	
	}
	
	@Override 
	protected void configure(HttpSecurity http) throws Exception {
        http
			.csrf()
				.disable()
			.authorizeRequests()
            	.antMatchers("/account/login").permitAll() // 로그인 권한은 누구나, resources파일도 모든권한
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/account/login")				
				.loginProcessingUrl("/doLogin")		// failureUrl --> AuthenticationFilterAnotherParam 으로 설정위치 변경 (parkpro 2019.06.03)
				.usernameParameter("id")
				.passwordParameter("pw")
			;
	}
}
