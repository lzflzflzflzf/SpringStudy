package com.example.demo.POJO;

import java.io.Serializable;

public class People implements Serializable {

    private int id;
    private String name;
    private String studentID;
    private char gender;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(int id, String name, String studentID, char gender, int age) {

        this.id = id;
        this.name = name;
        this.studentID = studentID;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
//        return super.toString();
        return this.name+" "+this.studentID+" "+this.gender +" "+this.age;
    }
}
