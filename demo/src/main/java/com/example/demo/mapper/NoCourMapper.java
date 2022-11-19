package com.example.demo.mapper;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import org.springframework.jdbc.core.RowMapper;
public class NoCourMapper {
    public NoCourMapper(){

    }
    public static final RowMapper<Integer> NoCourMapper1 = (rs, rowNum) -> {

//        Course course = new Course();
//        System.out.println(rs.getString("id1"));
//        course.setId((rs.getString("id1")));
//        course.setCourses(rs.getString("cour"));
//        return course;
        return rs.getInt("count");

    };
    public static final RowMapper<Course> NoCourMapper2=(rs,rowNum) -> {
        Course course = new Course();
        course.setCourses(rs.getString("cour"));
        course.setCount(rs.getInt("count1"));
        return course;
    };
    public static final RowMapper<Course> NoCourMapper3=(rs,rowNum) -> {
        Course course = new Course();
        course.setState(rs.getString("state1"));
        course.setCount(rs.getInt("count2"));
        return course;
    };
    public static final RowMapper<Course> NoCourMapper4=(rs,rowNum) -> {
        Course course = new Course();
        course.setId(rs.getString("id1"));
        course.setCourses(rs.getString("cour"));
        course.setNo_stud(rs.getInt("no_stud"));
        course.setState(rs.getString("state1"));
        course.setCollegename(rs.getString("name1"));
        //course.setCity(rs.getString("city"));
        //course.setYear(rs.getInt("year1"));
        //course.setCount(rs.getInt("count2"));
        return course;
    };

    public static final RowMapper<Course> NoCourMapper5=(rs,rowNum) -> {
        Course course = new Course();
        course.setId(rs.getString("id1"));
        //course.setCourses(rs.getString("cour"));
        course.setNo_stud(rs.getInt("no_stud"));
        course.setState(rs.getString("state1"));
        course.setCollegename(rs.getString("name1"));

        //course.setCount(rs.getInt("count2"));
        return course;
    };
    public static final RowMapper<Student> NoCourMapper6=(rs,rowNum) -> {
        Student student = new Student();

        student.setId(rs.getString("id2"));
        student.setName(rs.getString("name2"));

        //course.setCount(rs.getInt("count2"));
        return student;
    };


}
