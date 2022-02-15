package com.centroedu.student.service;

import java.util.List;

import com.centroedu.student.entities.Course;
import com.centroedu.student.entities.Student;


public interface StudentService {
	
	public List<Student> listAllStudents();
	
	public Student getStudent(Long id);
	
	public Student createStudent(Student alumno);
	
	public Student deleteStudent(Long id);
	
	public List<Student> findByCourse(Course id);

}
