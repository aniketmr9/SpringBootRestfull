package com.restfull.dao;

import java.util.List;

import com.restfull.model.Person;

public interface PersonDAO {
	public void populatePersonMap();
	public List<Person> addPerson(Person person);
	public List<Person> getAllPerson();
	public Person getPerson(int id);	
	public List<Person> removePerson(int id);
}
