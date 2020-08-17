
package com.contacts.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contact implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Name name;
	//to get rid of this error "Value too long for column "ADDRESS VARBINARY(255)":" we should use this below Annotation
	@Column(name="address",columnDefinition = "LONGTEXT")
	private Address address;
	
	// to get rid of this error "Could not determine type for: java.util.List, at table: contact, for columns: [org.hibernate.mapping.Column(phones)]"
	// we should use below annotation
	@OneToMany
	private List<Phone> phones;
	private String email;
	
	
	public Contact() {
		
	}
	public Contact( Name name, Address address, List<Phone> phones, String email) {
		
		
		this.name = name;
		this.address = address;
		this.phones = phones;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
