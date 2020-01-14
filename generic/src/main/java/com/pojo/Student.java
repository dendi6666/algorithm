package com.pojo;

public class Student extends Person {
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getFace(){
        return "student face";
    }

    public String getYangFace(){
        return "student yang face";
    }
}
