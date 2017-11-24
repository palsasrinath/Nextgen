package com.mankraft.nextgen.form;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class Admission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final Logger LOGGER = Logger.getLogger(Admission.class);

	private String sno;
	private String regNo;
	private String admToCls;
	private String dateOfAdm;
	private String gender;
	private String photo;
	private String fname;
	private String lname;
	private String dob;
	private String nationality;
	private String mothertng;
	private String place;
	private String state;
	private String domicle;
	private String relationship;
	private String parentFName;
	private String parentLName;
	private String mobile;
	private String email;
	private String fatherEduQualification;
	private String motherEduQualification;
	private String guardian;
	private String address;
	private String transportRequirement;
	private String dayCare;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDomicle() {
		return domicle;
	}

	public void setDomicle(String domicle) {
		this.domicle = domicle;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getParentFName() {
		return parentFName;
	}

	public void setParentFName(String parentFName) {
		this.parentFName = parentFName;
	}

	public String getParentLName() {
		return parentLName;
	}

	public void setParentLName(String parentLName) {
		this.parentLName = parentLName;
	}

	public String getFatherEduQualification() {
		return fatherEduQualification;
	}

	public void setFatherEduQualification(String fatherEduQualification) {
		this.fatherEduQualification = fatherEduQualification;
	}

	public String getMotherEduQualification() {
		return motherEduQualification;
	}

	public void setMotherEduQualification(String motherEduQualification) {
		this.motherEduQualification = motherEduQualification;
	}

	public String getGuardian() {
		return guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}

	public String getTransportRequirement() {
		return transportRequirement;
	}

	public void setTransportRequirement(String transportRequirement) {
		this.transportRequirement = transportRequirement;
	}

	public String getDayCare() {
		return dayCare;
	}

	public void setDayCare(String dayCare) {
		this.dayCare = dayCare;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRegNo() {
		return regNo;
	}

	public String getAdmToCls() {
		return admToCls;
	}

	public void setAdmToCls(String admToCls) {
		this.admToCls = admToCls;
	}

	public String getDateOfAdm() {
		return dateOfAdm;
	}

	public void setDateOfAdm(String dateOfAdm) {
		this.dateOfAdm = dateOfAdm;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMothertng() {
		return mothertng;
	}

	public void setMothertng(String mothertng) {
		this.mothertng = mothertng;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
