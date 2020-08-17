package com.contacts.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.contacts.demo.entity.Address;
import com.contacts.demo.entity.Name;

public interface NameRepository extends CrudRepository<Name,Long> {
	
	
}
