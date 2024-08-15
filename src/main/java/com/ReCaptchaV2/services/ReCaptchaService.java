package com.ReCaptchaV2.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReCaptchaService {

    private static final String GOOGLE_RECAPTCHA_ENDPOINT = "https://www.google.com/recaptcha/api/siteverify";

    private final String RECAPTCHA_SECRET = "6LfKJeAmAAAAAAxaZgRToYjrvj8b3Z9r09jdx6U2";
	
	public boolean validateCaptcha(String captcha) {
		RestTemplate restTemplate = new RestTemplate();
		
		
		return true;
	}
}
