package com.sunny.app.algorithm.dto;

//algorithm_result varchar(300) primary key,
//select_one tinyint(1) not null default 0,
//select_two tinyint(1) not null default 0,
//select_three tinyint(1) not null default 0,
//select_four tinyint(1) not null default 0,
//select_five tinyint(1) not null default 0

public class AlgorithmDTO {

	
	private String algorithmResult;
	private int selectOne;
	private int selectTwo;
	private int selectThree;
	private int selectFour;
	private int selectFive;
	
	public AlgorithmDTO() {	}

	public String getAlgorithmResult() {
		return algorithmResult;
	}

	public void setAlgorithmResult(String algorithmResult) {
		this.algorithmResult = algorithmResult;
	}

	public int getSelectOne() {
		return selectOne;
	}

	public void setSelectOne(int selectOne) {
		this.selectOne = selectOne;
	}

	public int getSelectTwo() {
		return selectTwo;
	}

	public void setSelectTwo(int selectTwo) {
		this.selectTwo = selectTwo;
	}

	public int getSelectThree() {
		return selectThree;
	}

	public void setSelectThree(int selectThree) {
		this.selectThree = selectThree;
	}

	public int getSelectFour() {
		return selectFour;
	}

	public void setSelectFour(int selectFour) {
		this.selectFour = selectFour;
	}

	public int getSelectFive() {
		return selectFive;
	}

	public void setSelectFive(int selectFive) {
		this.selectFive = selectFive;
	}

	@Override
	public String toString() {
		return "AlgorithmDTO [algorithmResult=" + algorithmResult + ", selectOne=" + selectOne + ", selectTwo="
				+ selectTwo + ", selectThree=" + selectThree + ", selectFour=" + selectFour + ", selectFive="
				+ selectFive + "]";
	}


	
	
	
}
