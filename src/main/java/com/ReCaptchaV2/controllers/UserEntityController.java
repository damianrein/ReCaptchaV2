package com.ReCaptchaV2.controllers;

import org.springframework.stereotype.Controller;

import com.ReCaptchaV2.services.UserEntityService;

@Controller
public class UserEntityController {

	private UserEntityService service;

	public UserEntityController(UserEntityService service) {
		this.service = service;
	}
	
	
}
