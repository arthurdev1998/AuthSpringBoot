package com.arthur.auth.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@GetMapping(value="/privado")
	public String privateRoute() {
		return "soriegeton";
	}
	
		
		@GetMapping(value="/publico")
		public String Publico() {
			return "<h1>Acesso publico<h1/>";
		} 

}
