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
public class Incident {

	private String id;
	private Date startDate;
	private String label;
	private String userId;

	public Incident() {
	}

	public Incident(Date startDate, String label, String userId) {
		this.startDate = startDate;
		this.label = label;
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
