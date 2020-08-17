package com.contacts.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.demo.entity.Contact;
import com.contacts.demo.service.ContactService;

@RestController
@RequestMapping(value = "/contact")
public class ContactsController {
	
	@Autowired
	ContactService contactService;
		
	@GetMapping
	public List<Contact> getContact(){
		return contactService.getContacts() ;
		
	}
	@GetMapping(value="/{id}")
	public Contact getContactById(@PathVariable(value="id") Long id){
		return contactService.getById(id);
		
	}
	
	@PostMapping(value = "/create")
	public @ResponseBody String createContact(@RequestBody Contact contact) {
		contactService.createContact(contact);
		return "saved";
		
	}
	
	@PutMapping(value="/{id}")
	public @ResponseBody String update(@PathVariable(value="id") Long id,@RequestBody Contact contact) {
		contactService.updateContact(id,contact);
		return "Updated";
		
	}
	
	@DeleteMapping(value="/{id}")
	public @ResponseBody String delete(@PathVariable(value="id") Long id) {
		contactService.deleteContact(id);
		return "Deleted";
		
	}
	
		
}
