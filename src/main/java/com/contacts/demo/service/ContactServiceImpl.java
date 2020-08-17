package com.contacts.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.demo.entity.Contact;
import com.contacts.demo.entity.Phone;
import com.contacts.demo.repository.AddressRepository;
import com.contacts.demo.repository.ContactRepository;
import com.contacts.demo.repository.NameRepository;
import com.contacts.demo.repository.PhoneRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public List<Contact> getContacts() {

		return contactRepository.findAll();
	}

	@Override
	public Contact getById(Long id) {
		// TODO Auto-generated method stub

		return contactRepository.findById(id).get();
	}

	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private PhoneRepository phoneRepository;
	@Autowired
	private NameRepository nameRepository;

	@Override
	public void createContact(Contact contact) {
		nameRepository.save(contact.getName());
		phoneRepository.saveAll(contact.getPhones());
		addressRepository.save(contact.getAddress());
		contactRepository.save(contact);

	}

	@Override
	public void updateContact(Long id, Contact contact) {
		Contact fetchedContact = contactRepository.findById(id).get();
		//System.out.println("contact " + fetchedContact.getId());
		fetchedContact.setAddress(addressRepository.save(contact.getAddress()));
		fetchedContact.setEmail(contact.getEmail());
		fetchedContact.setPhones((List<Phone>) phoneRepository.saveAll(contact.getPhones()));
		fetchedContact.setName(nameRepository.save(contact.getName()));
		contactRepository.save(fetchedContact);

	}

	@Override
	public void deleteContact(Long id) {
		// TODO Auto-generated method stub
		contactRepository.delete(contactRepository.findById(id).get());

	}

}
