package com.sunny.app.story.file.dto;

//file_system_name varchar(300) primary key,
//file_original_name varchar(300) not null,
//story_number int unsigned not null,

public class StoryFileDTO {
	private String fileSystemName;
	private String fileOriginalName;
	private int storyNumber;
	
	public StoryFileDTO() {}

	public String getFileSystemName() {
		return fileSystemName;
	}

	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}

	public String getFileOriginalName() {
		return fileOriginalName;
	}

	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}

	public int getStoryNumber() {
		return storyNumber;
	}

	public void setStoryNumber(int storyNumber) {
		this.storyNumber = storyNumber;
	}

	@Override
	public String toString() {
		return "StoryFileDTO [fileSystemName=" + fileSystemName + ", fileOriginalName=" + fileOriginalName
				+ ", storyNumber=" + storyNumber + "]";
	}
}
