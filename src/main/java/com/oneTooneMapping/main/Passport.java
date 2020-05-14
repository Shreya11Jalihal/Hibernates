
package com.oneTooneMapping.main;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "Passport")
public class Passport {

	@Column(name = "PassportId")
	@Id
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",  
            value="applicant"))
	//passportId is the primary key and the generator strategy as “foreign”.
	
	private int passportId;

	@Column(name = "passportNumber")
	private String passportNumber;

	@Column(name = "issued_Date")
	private Date issuedDate;

	@Column(name = "expiry_Date")
	private Date expiryDate;

	//Specifies a primary key column that is used as a foreign key to join to another table
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn 
	private Applicant applicant;
	
	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

     Passport()
     {
    	 
     }
	
	public Passport(String passportNumber, Date issuedDate, Date expiryDate) {
		super();
		this.passportNumber = passportNumber;
		this.issuedDate = issuedDate;
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", issuedDate="
				+ issuedDate + ", expiryDate=" + expiryDate + "]";
	}

}
