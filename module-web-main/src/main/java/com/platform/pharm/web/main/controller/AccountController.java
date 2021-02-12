package com.platform.pharm.web.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/account")
@Controller
public class AccountController {

	@GetMapping("/login")
	public String goLoginPage(Model model) {
		return "/account/loginPage";
	}
}
