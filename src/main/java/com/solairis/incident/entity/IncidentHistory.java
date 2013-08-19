/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.incident.entity;

import java.util.Date;

/**
 *
 * @author josh
 */
public class IncidentHistory {

	private String id;
	private String userId;
	private String reason;
	private Date reset;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getReset() {
		return reset;
	}

	public void setReset(Date reset) {
		this.reset = reset;
	}

}
