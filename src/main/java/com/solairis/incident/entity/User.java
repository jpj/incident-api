/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.incident.entity;

/**
 *
 * @author JanieBear
 */
public class User {

	private String id;
	private String login;
	private String password;
	private boolean loginAllowed;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLoginAllowed() {
		return loginAllowed;
	}

	public void setLoginAllowed(boolean loginAllowed) {
		this.loginAllowed = loginAllowed;
	}

}
