package com.municipality.spring.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "classe")
public class Classe {
	
	@Id
	@GeneratedValue
	private int id;
	private String classeName;
	
	
	@OneToMany(mappedBy="Classe", cascade = CascadeType.ALL )
	private List<Student>students ; 
	
	
	
	public Classe(int idClasse, String classeName, List<Student> students) {
		super();
		this.id = idClasse;
		this.classeName = classeName;
		this.students = students;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int idClasse) {
		this.id = idClasse;
	}
	public String getClasseName() {
		return classeName;
	}
	public void setClasseName(String classeName) {
		this.classeName = classeName;
	}
	public Classe() {
		super();
	}
	
	
	
	

}
