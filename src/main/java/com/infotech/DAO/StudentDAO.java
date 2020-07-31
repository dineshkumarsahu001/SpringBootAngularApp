package com.infotech.DAO;

import java.util.List;  

import com.infotech.model.Student;  
  
public interface StudentDAO {  
  
    public boolean saveStudent(Student student);  
    public List<Student> getStudents();  
    public boolean deleteStudent(Student student);  
    public List<Student> getStudentByID(Student student);  
    public boolean updateStudent(Student student);  
}  