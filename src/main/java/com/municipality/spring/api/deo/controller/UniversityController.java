package com.municipality.spring.api.deo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.municipality.spring.api.dao.UniversityDao;
import com.municipality.spring.api.model.Student;



@RestController
public class UniversityController {
	
	@Autowired
	private UniversityDao universitydao;
	
	
	@GetMapping(value="/student")
	public List<Student> afficherTout(){
		return universitydao.findAll();
				}
	@GetMapping(value="/student/{id")
	public Student afficherEtudientParId(@PathVariable int id) {
		return universitydao.findById(id);
	}
	
	@DeleteMapping(value="/student")
	public void effacerTout() {
		 universitydao.deleteAll();
	}
	
	@DeleteMapping(value = "/student/{id}")
	public List<Student>effacerParId(@PathVariable int id){
		return universitydao.deleteById(id);
	}
	
	@PostMapping(value = "/student")
	public String ajouterEtudiant(@RequestBody Student s) {
		universitydao.save(s);
		return("etudiant ajouter avec id"+s.getId());
	}
	
	
	@GetMapping(value="/student/{s}")
	public List<String> afficheTest(@PathVariable String s){
		return universitydao.findByIdClassName(s);
	}
}
