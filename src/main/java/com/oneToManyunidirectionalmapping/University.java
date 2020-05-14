package com.oneToManyunidirectionalmapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="UNIVERSITY")
public class University {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="UNIVERSITY_ID")
	private long Id;
	
	@Column(name="UNIVERSITY_NAME")
	private String name;
	
	@Column(name="COUNTRY")
	private String country;
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * public Collection<Student> getStudents() { return students; }
	 * 
	 * public void setStudents(List<Student> students) { this.students = students; }
	 */
	
	public University()
	{
		
	}
	

	public University( String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "University [Id=" + Id + ", name=" + name + ", country=" + country+"]";
	}
	
	
	
	

}
