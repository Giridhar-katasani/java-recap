package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDao  {
	
	@Autowired
	private EntityManager entityManager;
	
	public StudentDao() {
		
	}
	
	@Transactional
	public void saveStudent() {
		Student student = new Student();
		student.setDepartment("MSDA");
		student.setName("cally");
		entityManager.persist(student);
		System.out.println("saved the student");
	}
	
	public void readStudentById(int id) {
		System.out.println(entityManager.find(Student.class, id));
	}
	
	@Transactional	
	public void updateStudentById(int id) {
		String jql = "Update Student s SET s.Name = :newName WHERE s.id = :studentId";
	    entityManager.createQuery(jql)
        .setParameter("newName", "Tom")  // Replace with the new name value
        .setParameter("studentId", id)   // Use the same parameter name as in the query
        .executeUpdate();
		}
	
	@Transactional
	public void deleteById(int studentId) {
		entityManager.createQuery("DELETE Student s Where s.id =: studentId").setParameter("studentId", studentId).executeUpdate();
	}
}
