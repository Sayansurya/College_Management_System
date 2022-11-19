package com.example.demo.dao;

import com.example.demo.model.Course;
import com.example.demo.model.Student;

import java.util.List;

public interface personDao {
//    int insertPerson(UUID id, person Person );
//    default int insertPerson(person Person){
//        UUID id= UUID.randomUUID();
//        return insertPerson(id,Person);
//    }
//    List<person> SelectAllPeople();
//    Optional<person> selectPersonById(UUID id);
//    int delePersonById(UUID id);
//    int updatePersonById(UUID id, person Person);
    //int insertperson(UUID id, person Person);

    int getNoOfCourses();
    int getNoOfStudents();
    int getNoOfCollege();
    List<Course> getCollegeDetails();
    List<Course> getNoOfCollegeAccorCourses();
    List<Course> getNoOfCollegeAccorState();
    List<Course> getCollegeInfoAccorCourse(String Coursename);
    List<Course> getCollegeInfoAccorState(String Statename);

    List<Course> getCollegeDetailsSpecific(String collegename);
    List<Student> getStudentDetailsfromCollName(String collegename);


    //Student addStudent(Student student);
}
