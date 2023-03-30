package com.sunny.app.question.dto;

import java.util.Date;

//question_number //int unsigned auto_increment 
//gosu_number (fk) //int
//user_number (fk) //int
//question_title //varchar(300)
//question_content //varchar(3000)
//question_date //datetime
//question_viewcnt //int
//question_status //tinyint(1) 0/1
//last_update //datetime

public class QuestionDTO {
	private int questionNumber;
	private int gosuNumber;
	private int userNumber;
	private String qustionTitle;
	private String questionContent;
	private Date questionDate;
	private int questionViewCnt;
	private int questionStatus;
	private Date lastUpdate;
	
	public QuestionDTO() {
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}

	public int getGosuNumber() {
		return gosuNumber;
	}

	public void setGosuNumber(int gosuNumber) {
		this.gosuNumber = gosuNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getQustionTitle() {
		return qustionTitle;
	}

	public void setQustionTitle(String qustionTitle) {
		this.qustionTitle = qustionTitle;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public Date getQuestionDate() {
		return questionDate;
	}

	public void setQuestionDate(Date questionDate) {
		this.questionDate = questionDate;
	}

	public int getQuestionViewCnt() {
		return questionViewCnt;
	}

	public void setQuestionViewCnt(int questionViewCnt) {
		this.questionViewCnt = questionViewCnt;
	}

	public int getQuestionStatus() {
		return questionStatus;
	}

	public void setQuestionStatus(int questionStatus) {
		this.questionStatus = questionStatus;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "QuestionDTO [questionNumber=" + questionNumber + ", gosuNumber=" + gosuNumber + ", userNumber="
				+ userNumber + ", qustionTitle=" + qustionTitle + ", questionContent=" + questionContent
				+ ", questionDate=" + questionDate + ", questionViewCnt=" + questionViewCnt + ", questionStatus="
				+ questionStatus + ", lastUpdate=" + lastUpdate + "]";
	}
	
	
}




