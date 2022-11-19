package com.example.demo.dao;

//import com.example.demo.model.person;

import com.example.demo.mapper.NoCourMapper;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("fakeDao")
public class fakepersonDataAcessService implements personDao {
//    private static List<person> DB=new ArrayList<>();

    @Autowired
    public JdbcTemplate jdbc;
//    @Override
//    public int insertPerson(UUID id, person Person) {
//        DB.add(new person(id, Person.getName()));
//        return 1;
//    }
//
//    @Override
//    public List<person> SelectAllPeople() {
//        return DB;
//    }
//
//    @Override
//    public Optional<person> selectPersonById(UUID id) {
//        return DB.stream()
//                .filter(person -> person.getId().equals(id))
//                .findFirst();
//    }
//
//    @Override
//    public int delePersonById(UUID id) {
//        Optional<person> personMaybe= selectPersonById(id);
//        if(personMaybe.isEmpty()){
//            return 0;
//        }
//        DB.remove(personMaybe.get());
//        return 1;
//    }
//
//    @Override
//    public int updatePersonById(UUID id, person update) {
//        return selectPersonById(id)
//                .map(Person ->{
//                    int indexOfPersonToUpdate =DB.indexOf(Person);
//                    if(indexOfPersonToUpdate>=0){
//                        DB.set(indexOfPersonToUpdate,new person(id,update.getName()));
//                        return 1;
//                    }
//                    return 0;
//                })
//                .orElse(0);
//    }

    @Override
    public int getNoOfCourses() {
        return jdbc.query("select count(distinct cour) as count from course", NoCourMapper.NoCourMapper1).get(0);
    }
    public int getNoOfStudents() {
        return jdbc.query("select count(*) as count from student", NoCourMapper.NoCourMapper1).get(0);
    }
    public int getNoOfCollege() {
        return jdbc.query("select count(*) as count from college", NoCourMapper.NoCourMapper1).get(0);
    }
    public List<Course> getCollegeDetails(){
        return jdbc.query("select college.id1 as id1, college.name1 as name1, college.no_stud as no_stud, college.state1 as state1 from college", NoCourMapper.NoCourMapper5);
    }
    public List<Course> getNoOfCollegeAccorCourses(){
        return jdbc.query("select cour,count(*) as count1 from course group by cour", NoCourMapper.NoCourMapper2);
    }

    public List<Course> getNoOfCollegeAccorState(){
        return jdbc.query("select state1 as state1,count(*) as count2 from college group by state1", NoCourMapper.NoCourMapper3);
    }

    //public List<Course> getCollegeInfoAccorCourse(){
      //  return jdbc.query("select distinct college.id1 as id1, college.name1 as name1, college.no_stud as no_stud, college.state1 as state1 from college,course group by cour, college.id3", NoCourMapper.NoCourMapper4);
    //}
    public List<Course> getCollegeInfoAccorCourse(String Coursename){
        return jdbc.query("select cour, state1 as state1, name1 as name1, col.id1 as id1, no_stud as no_stud from course co, college col where co.id1 = col.id3 and cour = ?", NoCourMapper.NoCourMapper4,Coursename);
    }
    public List<Course> getCollegeInfoAccorState(String Statename){
        return jdbc.query("select distinct state1, name1, col.id1 as id1, no_stud from course co, college col where co.id1 = col.id3 and state1=?", NoCourMapper.NoCourMapper5,Statename);
    }

    public List<Course> getCollegeDetailsSpecific(String collegeId){
        return jdbc.query("select * from college,course where college.id1=? and college.id3 = course.id1", NoCourMapper.NoCourMapper4,collegeId);
    }

    public List<Student> getStudentDetailsfromCollName(String collegename){
        return jdbc.query("select student.name1 as name2, student.id1 as id2 from student,college where student.cid=college.id3 and college.name1=?", NoCourMapper.NoCourMapper6,collegename);
    }

//    @Override
//    public Student addStudent(Student student) {
//        jdbc.update("". student.name1(), student.getEmail(), student.getDateOfJoining());
//        return student;
//        //return null;
//    }


}
