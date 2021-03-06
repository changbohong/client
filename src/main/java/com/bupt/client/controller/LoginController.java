package com.bupt.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bupt.client.entity.User;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return LOGIN;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user) {
		System.out.println(user);
		return "redirect:/index";
	}

	private static final String LOGIN = "login";
}
