package com.contacts.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.contacts.demo.entity.Address;

public interface AddressRepository extends CrudRepository<Address,Long> {
	
	
}
