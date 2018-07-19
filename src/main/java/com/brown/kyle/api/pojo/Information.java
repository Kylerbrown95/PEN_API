package com.brown.kyle.api.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * 
 * @author Kyle Brown
 *
 */
@JsonAutoDetect
public class Information {
	
	private String apiName;
	private String apiVersion;
	private boolean apiStatus;
	private String apiDescription;
	private Date apiDate;
	
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getApiVersion() {
		return apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
	public String getApiDescription() {
		return apiDescription;
	}
	public void setApiDescription(String apiDescription) {
		this.apiDescription = apiDescription;
	}
	public Date getApiDate() {
		return apiDate;
	}
	public void setApiDate(Date apiDate) {
		this.apiDate = apiDate;
	}
	public boolean isApiStatus() {
		return apiStatus;
	}
	public void setApiStatus(boolean apiStatus) {
		this.apiStatus = apiStatus;
	}

}
