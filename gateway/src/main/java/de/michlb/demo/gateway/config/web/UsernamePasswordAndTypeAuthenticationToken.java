package de.michlb.demo.gateway.config.web;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class UsernamePasswordAndTypeAuthenticationToken extends UsernamePasswordAuthenticationToken {

	private static final long serialVersionUID = 1L;

	private String type;

	public UsernamePasswordAndTypeAuthenticationToken(Object principal, Object credentials, String type) {
		super(principal, credentials);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

}
