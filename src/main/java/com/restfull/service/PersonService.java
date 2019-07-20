package com.restfull.service;

import java.util.List;

import com.restfull.model.Person;

public interface PersonService {
	public void populatePersonMap();
	public List<Person> addPerson(Person person);
	public List<Person> getAllPerson();
	public Person getPerson(int id);	
	public List<Person> removePerson(int id);
}
