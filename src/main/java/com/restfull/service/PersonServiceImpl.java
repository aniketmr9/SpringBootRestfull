package com.restfull.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfull.dao.PersonDAO;
import com.restfull.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDAO personDAO;
	public void populatePersonMap() {
		personDAO.populatePersonMap();
	}
	
	public List<Person> addPerson(Person person) {		
		return personDAO.addPerson(person);
	}

	public List<Person> getAllPerson() {
		return personDAO.getAllPerson();
	}

	public Person getPerson(int id) {
		return personDAO.getPerson(id);
	}

	public List<Person> removePerson(int id) {
		return personDAO.removePerson(id);
	}

}
