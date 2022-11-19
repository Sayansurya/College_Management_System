package com.example.demo.api;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person")
@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class PersonController {

    @Autowired
    private CourseService courseService;

//    public PersonController(PersonService personService) {
//        this.personService = personService;
//    }
   // @PostMapping
 //   public void addPerson(@RequestBody person Person){
   //     personService.addPerson(Person);
 //   }
//    @PostMapping("/addStudent")
//    public Student addCourse(@RequestBody Student student){
//        return courseService.addStudent(student);
//    }



    @GetMapping("/getNoOfCourses")
    public int getNoOfCourses(){
        //System.out.println("Hi");
        return courseService.getNoOfCourses();
    }
    @GetMapping("/getNoOfStudents")
    public int getNoOfStudents(){
        //System.out.println("Hi");
        return courseService.getNoOfStudents();
    }
    @GetMapping("/getNoOfCollege")
    @CrossOrigin(origins="http://localhost:3000/")
    public int getNoOfCollege(){
        //System.out.println("Hi");
        return courseService.getNoOfCollege();
    }
    @GetMapping("/getNoOfCollegeAccorCourses")
    public List<Course> getNoOfCollegeAccorCourses(){
        //System.out.println("Hi");
        return courseService.getNoOfCollegeAccorCourses();
    }
    @GetMapping("/getNoOfCollegeAccorState")
    public List<Course> getNoOfCollegeAccorState(){
        //System.out.println("Hi");
        return courseService.getNoOfCollegeAccorState();
    }
    @GetMapping("/getCollegeDetails")
    public List<Course> getCollegeDetails(){
        //System.out.println("Hi");
        return courseService.getCollegeDetails();
    }

    @GetMapping("/getCollegeInfoAccorCourse/{Coursename}")
    public List<Course> getCollegeInfoAccorCourse(@PathVariable String Coursename){
        //System.out.println("Hi");
        return courseService.getCollegeInfoAccorCourse(Coursename);
    }
    @GetMapping("/getCollegeInfoAccorState/{Statename}")
    public List<Course> getCollegeInfoAccorState(@PathVariable String Statename){
        //System.out.println("Hi");
        return courseService.getCollegeInfoAccorState(Statename);
    }
    @GetMapping("/getCollegeDetailsSpecific/{collegename}")
    public List<Course> getCollegeDetails(@PathVariable String collegename){
        //System.out.println("Hi");
        return courseService.getCollegeDetailsSpecific(collegename);
    }

    @GetMapping("/getStudentDetailsfromCollName/{collegename}")
    public List<Student> getStudentDetailsfromCollName(@PathVariable String collegename){
        //System.out.println("Hi");
        return courseService.getStudentDetailsfromCollName(collegename);
    }


    // @GetMapping(path = "{id}")
    //public Course getPersonById(@PathVariable("id") UUID id){
      //  return personService.getPersonById(id)
        //        .orElse(null);
    //}

}
