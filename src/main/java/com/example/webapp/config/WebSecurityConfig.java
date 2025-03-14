package com.example.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity //@EnableWebSecurityはSpringSecurityの設定を有効にするためのアノテーション
@Configuration
public class WebSecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.formLogin(login -> login
				.loginPage("/login")// ログインページのURL
				.usernameParameter("login") // ユーザー名のパラメータ名を設定
				.defaultSuccessUrl("/menu")); //ログイン後のURL

		return http.build(); // SecurityFilterChain をビルドして返す

	}

}
