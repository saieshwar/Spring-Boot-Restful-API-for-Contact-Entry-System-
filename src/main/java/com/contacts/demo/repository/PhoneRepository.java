package com.contacts.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.contacts.demo.entity.Address;
import com.contacts.demo.entity.Phone;

public interface PhoneRepository extends CrudRepository<Phone,Long> {
	
	
}
