package com.restfull.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.restfull.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	static Map<Integer, Person> personMap = new HashMap<Integer, Person>();
	
	public void populatePersonMap() {
		Person p = new Person();
		p.setId(1);
		p.setName("A");
		p.setMobno(999999999);
		personMap.put(p.getId(), p);
		p = new Person();
		p.setId(2);
		p.setName("B");
		p.setMobno(888888888);
		personMap.put(p.getId(), p);
		System.out.println(personMap.get(1).getName());
		System.out.println(personMap.get(2).getName());
	}
	
	public List<Person> addPerson(Person person) {
		personMap.put(person.getId(), person);
		return getAllPerson();
	}

	public List<Person> getAllPerson() {
		List<Person> personList = new ArrayList<Person>();
		for(int key : personMap.keySet()) {
			personList.add(personMap.get(key));
		}
		return personList;
	}

	public Person getPerson(int id) {		
		return personMap.get(id);
	}

	public List<Person> removePerson(int id) {
		personMap.remove(id);
		return getAllPerson();
	}	

}
