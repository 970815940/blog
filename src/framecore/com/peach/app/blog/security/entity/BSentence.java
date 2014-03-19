package com.peach.app.blog.security.entity;

/**
 * BSentence entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class BSentence implements java.io.Serializable {

	// Fields

	private String bsId;
	private String bsContent;
	private String bsImgUrl;

	// Constructors

	/** default constructor */
	public BSentence() {
	}

	/** minimal constructor */
	public BSentence(String bsId) {
		this.bsId = bsId;
	}

	/** full constructor */
	public BSentence(String bsId, String bsContent, String bsImgUrl) {
		this.bsId = bsId;
		this.bsContent = bsContent;
		this.bsImgUrl = bsImgUrl;
	}

	// Property accessors

	public String getBsId() {
		return this.bsId;
	}

	public void setBsId(String bsId) {
		this.bsId = bsId;
	}

	public String getBsContent() {
		return this.bsContent;
	}

	public void setBsContent(String bsContent) {
		this.bsContent = bsContent;
	}

	public String getBsImgUrl() {
		return this.bsImgUrl;
	}

	public void setBsImgUrl(String bsImgUrl) {
		this.bsImgUrl = bsImgUrl;
	}

}