package com.ngh.checkstyle_pmd.model;

public class Data {

	private String username;
	private String emailID;
	private long mobileNo;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Data [username=" + username + ", emailID=" + emailID + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
