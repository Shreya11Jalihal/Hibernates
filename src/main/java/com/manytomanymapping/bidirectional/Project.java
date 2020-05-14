package com.manytomanymapping.bidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "PROJECT")
@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROJECT_ID")
	private long Id;

	@Column(name = "TITLE")
	private String title;

	@ManyToMany(mappedBy="projects",cascade =  {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Employee> employees= new ArrayList<Employee>();

	public Project(String title) {
		super();
		this.title = title;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	Project() {

	}

	@Override
	public String toString() {
		return "Project [Id=" + Id + ", title=" + title + "]";
	}

}
