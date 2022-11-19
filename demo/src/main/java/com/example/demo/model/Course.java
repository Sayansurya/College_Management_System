package com.example.demo.model;

public class Course {
    private  String id;
    private  String courses;
    private String state;
    private int no_stud;
    private String Collegename;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    private String City;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;



    public String getCollegename() {
        return Collegename;
    }

    public void setCollegename(String collegename) {
        Collegename = collegename;
    }

    public void setNo_stud(int no_stud) {
        this.no_stud = no_stud;
    }

    public int getNo_stud() {
        return no_stud;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    private int count;

    public void setId(String id) {
        this.id = id;

    }
    public void setCourses(String courses) {
        this.courses = courses;
    }

    public Course(){}

    public String getId() {
        return id;
    }

    public  String getCourses() {
        return courses;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
