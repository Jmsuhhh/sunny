package com.sunny.app.story.dto;

//story_number int unsigned auto_increment primary key,
//story_title varchar(300) not null,
//story_content varchar(3000) not null,
//story_viewcnt int unsigned,
//story_date datetime,
//last_update datetime,
//user_number int unsigned not null,


public class StoryDTO {
	private int storyNumber;
	private String storyTitle;
	private String storyContent;
	private int stotyViewcnt;
	private String storyDate;
	private String lastUpdate;
	private int userNumber;
	
	public StoryDTO() {}

	public int getStoryNumber() {
		return storyNumber;
	}

	public void setStoryNumber(int storyNumber) {
		this.storyNumber = storyNumber;
	}

	public String getStoryTitle() {
		return storyTitle;
	}

	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}

	public String getStoryContent() {
		return storyContent;
	}

	public void setStoryContent(String storyContent) {
		this.storyContent = storyContent;
	}

	public int getStotyViewcnt() {
		return stotyViewcnt;
	}

	public void setStotyViewcnt(int stotyViewcnt) {
		this.stotyViewcnt = stotyViewcnt;
	}

	public String getStoryDate() {
		return storyDate;
	}

	public void setStoryDate(String storyDate) {
		this.storyDate = storyDate;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "StoryDTO [storyNumber=" + storyNumber + ", storyTitle=" + storyTitle + ", storyContent=" + storyContent
				+ ", stotyViewcnt=" + stotyViewcnt + ", storyDate=" + storyDate + ", lastUpdate=" + lastUpdate
				+ ", userNumber=" + userNumber + "]";
	}	
}
