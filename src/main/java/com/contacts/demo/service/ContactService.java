package com.contacts.demo.service;

import java.util.List;

import com.contacts.demo.entity.Contact;

public interface ContactService {
	List<Contact> getContacts();

	Contact getById(Long id);
	
	void createContact(Contact contact);
	void updateContact(Long id,Contact contact);
	void deleteContact(Long id);
}
