package com.sunny.app.gosu.field.dto;

//*tbl_gosu_field (식고수선택분야)
//gosu_field_number (pk) // int unsigned auto_increment 
//field_number (fk) // int
//gosu_number (fk) // int

public class GosuFieldDTO {
	
	private int gosuFieldNumber;
	private int filedNumber;
	private int gosuNumber;

	public GosuFieldDTO() {
	}

	public int getGosuFieldNumber() {
		return gosuFieldNumber;
	}

	public void setGosuFieldNumber(int gosuFieldNumber) {
		this.gosuFieldNumber = gosuFieldNumber;
	}

	public int getFiledNumber() {
		return filedNumber;
	}

	public void setFiledNumber(int filedNumber) {
		this.filedNumber = filedNumber;
	}

	public int getGosuNumber() {
		return gosuNumber;
	}

	public void setGosuNumber(int gosuNumber) {
		this.gosuNumber = gosuNumber;
	}

	@Override
	public String toString() {
		return "GosuFieldDTO [gosuFieldNumber=" + gosuFieldNumber + ", filedNumber=" + filedNumber + ", gosuNumber="
				+ gosuNumber + "]";
	}
	
	
}
