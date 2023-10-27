package com.ssn.modal;

public class Citizen {

	private String name;
	private String dob;
	private String gender;
	private String ssn;
	private String state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", dob=" + dob + ", gender=" + gender + ", ssn=" + ssn + ", state=" + state
				+ "]";
	}

}
