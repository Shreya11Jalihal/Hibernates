package com.onetoone.unidirectionalmapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "CUSTOMER")
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	@Column(name = "CUSTOMER_NAME")
	private String name;

	@Column(name = "CUSTOMER_AGE")
	private int age;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="HOMEADDRESS_ID")
	private Address address;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Customer() {

	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
