package com.restfull.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfull.model.Person;
import com.restfull.service.PersonService;

@RestController
public class PersonRestController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/populatePerson")
	public void populatePerson() {
		personService.populatePersonMap();
	}	
	
	@GetMapping("/getAllPerson")
	public List<Person> getAllPerson(){
		return personService.getAllPerson();
	}
	
	@GetMapping(value="/getPerson/{id}")
	public Person getPerson(@PathVariable("id") int id) {
		return personService.getPerson(id);
	}
	
	@PostMapping("addPerson")
	public List<Person> addPerson(@RequestBody Person person){
		return personService.addPerson(person);
	}
	
	@DeleteMapping(value = "/deletePerson/{id}")
	public List<Person> removePerson(@PathVariable("id") int id){
		return personService.removePerson(id);
	}
}
