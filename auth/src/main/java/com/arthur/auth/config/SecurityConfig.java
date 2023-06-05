package com.arthur.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	// Configurações de acesso: quais URI serão barradas e quais nao serão
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.authorizeHttpRequests(
		authorizeConfig -> {					
			authorizeConfig.requestMatchers("apiAuth/publico").permitAll();
			authorizeConfig.requestMatchers("apiAuth/logout").permitAll();
			authorizeConfig.anyRequest().authenticated();
		}).oauth2Login(Customizer.withDefaults())
				
		.build();
	}
}
