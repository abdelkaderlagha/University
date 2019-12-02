package com.municipality.spring.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastname;
	private int age;
	
	@ManyToOne
	@JoinColumn
	private Classe Classe;
	
	
	
	
	public Classe getClasse() {
		return Classe;
	}
	public void setClasse(Classe classe) {
		Classe = classe;
	}
	public Student() {
		super();
	}
	public Student(int id, String firstName, String lastname, int age,Classe classe) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
		Classe = classe;
	}
	public int getId() {
		return id;
	}
	public void setId(int idStudent) {
		this.id = idStudent;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
