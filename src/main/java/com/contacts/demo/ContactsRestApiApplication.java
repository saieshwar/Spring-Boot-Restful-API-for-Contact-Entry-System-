package com.contacts.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.contacts.demo.entity.Address;
import com.contacts.demo.entity.Contact;
import com.contacts.demo.entity.Name;
import com.contacts.demo.entity.Phone;
import com.contacts.demo.repository.AddressRepository;
import com.contacts.demo.repository.ContactRepository;
import com.contacts.demo.repository.NameRepository;
import com.contacts.demo.repository.PhoneRepository;

@SpringBootApplication
public class ContactsRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactsRestApiApplication.class, args);
	}
	
}

@Component
class DemoRunner implements CommandLineRunner{
	
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	PhoneRepository phoneRepository;
	@Autowired
	NameRepository nameRepository;
	@Autowired
	ContactRepository contactRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Name n1 = new Name("prabhakar", "Reddy", "Gaddam");
		nameRepository.save(n1);
		Address a1 = new Address("Barton", "Charlotte", "NC", "28262");
		addressRepository.save(a1);
		Phone p1 = new Phone("12345", "personal");
		phoneRepository.save(p1);
		Contact c1 = new Contact(n1, a1, Arrays.asList(p1), "gaddam@gmail.com");
		contactRepository.save(c1);
	}
	
}