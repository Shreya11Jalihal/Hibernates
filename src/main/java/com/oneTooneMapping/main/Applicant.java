package com.oneTooneMapping.main;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Applicant")
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ApplicantId;

	@Column(name = "ApplicantName")
	private String name;

	@Column(name = "ApplicantAge")
	private int age;

	@Column(name = "city")
	private String city;

	@OneToOne(mappedBy = "applicant",cascade=CascadeType.ALL)
	private Passport passport;

	public int getApplicantId() {
		return ApplicantId;
	}
	

	public Passport getPassport() {
		return passport;
	}



	public void setPassport(Passport passport) {
		this.passport = passport;
	}



	public void setApplicantId(int applicantId) {
		ApplicantId = applicantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Applicant [ApplicantId=" + ApplicantId + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public Applicant() {

	}

	public Applicant(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

}
