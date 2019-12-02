package com.municipality.spring.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.municipality.spring.api.model.Student;

public interface UniversityDao extends JpaRepository<Student, Integer>{

	Student findById(int id);
	List<Student> findAll();
	List<Student> deleteById(int id);
	
	@Query("select s.firstName from Student s inner join s.Classe c where c.id = s.Classe and c.classeName =:s")
	List<String> findByIdClassName(@Param("s") String s);
	
	
	
}
