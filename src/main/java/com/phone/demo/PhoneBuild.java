package com.phone.demo;

public class PhoneBuild {

	
	
	public PhoneBuild(Long personId, String personName, Long phoneNumber) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.phoneNumber = phoneNumber;
	}
	
	
	private Long personId;
	private String personName;
	private Long phoneNumber;
	
	
	public Long getPersonId() {
		return personId;
	}
	
	
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	
	
	public String getPersonName() {
		return personName;
	}
	
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	
	
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "PhoneBuild [personId=" + personId + ", personName=" + personName + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
