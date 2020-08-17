package com.contacts.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.contacts.demo.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact,Long> {
	 List<Contact> findAll();
}
