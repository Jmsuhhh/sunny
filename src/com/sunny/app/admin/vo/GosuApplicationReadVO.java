package com.sunny.app.admin.vo;

public class GosuApplicationReadVO {
	
	private int userNumber;
	private int applyNumber;
	private String userNickname;
	private String applyTitle;
	private String applyDate;
	private String applyContent;
	private String gosuFieldNames;
	
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public int getApplyNumber() {
		return applyNumber;
	}
	public void setApplyNumber(int applyNumber) {
		this.applyNumber = applyNumber;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getApplyTitle() {
		return applyTitle;
	}
	public void setApplyTitle(String applyTitle) {
		this.applyTitle = applyTitle;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getApplyContent() {
		return applyContent;
	}
	public void setApplyContent(String applyContent) {
		this.applyContent = applyContent;
	}
	public String getGosuFieldNames() {
		return gosuFieldNames;
	}
	public void setGosuFieldNames(String gosuFieldNames) {
		this.gosuFieldNames = gosuFieldNames;
	}
	@Override
	public String toString() {
		return "GosuApplicationReadVO [userNumber=" + userNumber + ", applyNumber=" + applyNumber + ", userNickname="
				+ userNickname + ", applyTitle=" + applyTitle + ", applyDate=" + applyDate + ", applyContent="
				+ applyContent + ", gosuFieldNames=" + gosuFieldNames + "]";
	}
	
	
	
	
	
	

}
