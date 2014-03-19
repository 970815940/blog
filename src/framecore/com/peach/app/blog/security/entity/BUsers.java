package com.peach.app.blog.security.entity;

import java.util.Date;

/**
 * BUsers entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class BUsers implements java.io.Serializable {

	// Fields

	private String puId;
	private String puUsername;
	private String puLoginname;
	private String puEmail;
	private String puSex;
	private Date puBirthor;
	private String puPassword;
	private String puCity;

	// Constructors

	/** default constructor */
	public BUsers() {
	}

	/** minimal constructor */
	public BUsers(String puId, String puUsername, String puLoginname,
			String puEmail) {
		this.puId = puId;
		this.puUsername = puUsername;
		this.puLoginname = puLoginname;
		this.puEmail = puEmail;
	}

	/** full constructor */
	public BUsers(String puId, String puUsername, String puLoginname,
			String puEmail, String puSex, Date puBirthor, String puPassword,
			String puCity) {
		this.puId = puId;
		this.puUsername = puUsername;
		this.puLoginname = puLoginname;
		this.puEmail = puEmail;
		this.puSex = puSex;
		this.puBirthor = puBirthor;
		this.puPassword = puPassword;
		this.puCity = puCity;
	}

	// Property accessors

	public String getPuId() {
		return this.puId;
	}

	public void setPuId(String puId) {
		this.puId = puId;
	}

	public String getPuUsername() {
		return this.puUsername;
	}

	public void setPuUsername(String puUsername) {
		this.puUsername = puUsername;
	}

	public String getPuLoginname() {
		return this.puLoginname;
	}

	public void setPuLoginname(String puLoginname) {
		this.puLoginname = puLoginname;
	}

	public String getPuEmail() {
		return this.puEmail;
	}

	public void setPuEmail(String puEmail) {
		this.puEmail = puEmail;
	}

	public String getPuSex() {
		return this.puSex;
	}

	public void setPuSex(String puSex) {
		this.puSex = puSex;
	}

	public Date getPuBirthor() {
		return this.puBirthor;
	}

	public void setPuBirthor(Date puBirthor) {
		this.puBirthor = puBirthor;
	}

	public String getPuPassword() {
		return this.puPassword;
	}

	public void setPuPassword(String puPassword) {
		this.puPassword = puPassword;
	}

	public String getPuCity() {
		return this.puCity;
	}

	public void setPuCity(String puCity) {
		this.puCity = puCity;
	}

}