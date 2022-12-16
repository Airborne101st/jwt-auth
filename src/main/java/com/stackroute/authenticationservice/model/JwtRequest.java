package com.stackroute.authenticationservice.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;

	private String username;
	private String password;

	private String lender_id;

	private String borrower_id;

	//default constructor for JSON Parsing
	public JwtRequest()
	{
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
		this.setLender_id(lender_id);
		this.setBorrower_id(borrower_id);

	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLender_id() {
		return lender_id;
	}

	public void setLender_id(String lender_id) {
		this.lender_id = lender_id;
	}

	public String getBorrower_id() {
		return borrower_id;
	}

	public void setBorrower_id(String borrower_id) {
		this.borrower_id = borrower_id;
	}
}