package com.sunny.app.user.vo;

public class UserVO {
	private int userNumber;
	private String userId;
	private String userPassword;
	private String userName;
	private String userNickname;
	private String userPhone;
	private String userEmail;
	private String userComment;
	private int gradeNumber;
	private String findPasswordAnswer;
	private int findQuestionNumber;
	private String gosuFields;
	private int gosuNumber;
	
	public UserVO() {}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserComment() {
		return userComment;
	}

	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}

	public int getGradeNumber() {
		return gradeNumber;
	}

	public void setGradeNumber(int gradeNumber) {
		this.gradeNumber = gradeNumber;
	}

	public String getFindPasswordAnswer() {
		return findPasswordAnswer;
	}

	public void setFindPasswordAnswer(String findPasswordAnswer) {
		this.findPasswordAnswer = findPasswordAnswer;
	}

	public int getFindQuestionNumber() {
		return findQuestionNumber;
	}

	public void setFindQuestionNumber(int findQuestionNumber) {
		this.findQuestionNumber = findQuestionNumber;
	}

	public String getGosuFields() {
		return gosuFields;
	}

	public void setGosuFields(String gosuFields) {
		this.gosuFields = gosuFields;
	}

	public int getGosuNumber() {
		return gosuNumber;
	}

	public void setGosuNumber(int gosuNumber) {
		this.gosuNumber = gosuNumber;
	}

	@Override
	public String toString() {
		return "UserVO [userNumber=" + userNumber + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userNickname=" + userNickname + ", userPhone=" + userPhone
				+ ", userEmail=" + userEmail + ", userComment=" + userComment + ", gradeNumber=" + gradeNumber
				+ ", findPasswordAnswer=" + findPasswordAnswer + ", findQuestionNumber=" + findQuestionNumber
				+ ", gosuFields=" + gosuFields + ", gosuNumber=" + gosuNumber + ", getUserNumber()=" + getUserNumber()
				+ ", getUserId()=" + getUserId() + ", getUserPassword()=" + getUserPassword() + ", getUserName()="
				+ getUserName() + ", getUserNickname()=" + getUserNickname() + ", getUserPhone()=" + getUserPhone()
				+ ", getUserEmail()=" + getUserEmail() + ", getUserComment()=" + getUserComment()
				+ ", getGradeNumber()=" + getGradeNumber() + ", getFindPasswordAnswer()=" + getFindPasswordAnswer()
				+ ", getFindQuestionNumber()=" + getFindQuestionNumber() + ", getGosuFields()=" + getGosuFields()
				+ ", getGosuNumber()=" + getGosuNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
