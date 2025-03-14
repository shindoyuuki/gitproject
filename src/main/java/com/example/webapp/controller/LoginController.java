package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.webapp.form.LoginForm;

/**
 * login：コントローラー
 */
@Controller
public class LoginController {

	/**
	 * メニュー画面を表示する
	 */
	@GetMapping("/login")
	public String view(Model model, LoginForm form) {
		return "login";
	}

}