package com.example.demo.service;

import com.example.demo.dao.personDao;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final personDao persondao;
    @Autowired
    public CourseService(personDao persondao) {
        this.persondao = persondao;
    }

//
//    public int addPerson(person Person){
//        return persondao.insertPerson(Person);
//    }
//    public String getAllPeople(){
//        return persondao.SelectAllPeople();
//    }
//    public Optional<person> getPersonById(UUID id){
//        return persondao.selectPersonById(id);
//    }

    public int getNoOfCourses(){
        return persondao.getNoOfCourses();
    }
    public int getNoOfStudents(){
        return persondao.getNoOfStudents();
    }
    public int getNoOfCollege(){
        return persondao.getNoOfCollege();
    }
    public List<Course> getCollegeDetails(){
        return persondao.getCollegeDetails();
    }
    public List<Course> getNoOfCollegeAccorCourses(){
        return persondao.getNoOfCollegeAccorCourses();
    }


    public List<Course> getNoOfCollegeAccorState() {
        return persondao.getNoOfCollegeAccorState();
    }

    public List<Course> getCollegeInfoAccorCourse(String Coursename) {
        return persondao.getCollegeInfoAccorCourse(Coursename);
    }
    public List<Course> getCollegeInfoAccorState(String Statename) {
        return persondao.getCollegeInfoAccorState(Statename);
    }
    public List<Course> getCollegeDetailsSpecific(String collegename) {
        return persondao.getCollegeDetailsSpecific(collegename);
    }

    public List<Student> getStudentDetailsfromCollName(String collegename) {
        return persondao.getStudentDetailsfromCollName(collegename);
    }

//    public Student addStudent(Student student) {
//        return persondao.addStudent(student);
//    }
}
