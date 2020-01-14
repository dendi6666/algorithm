package com.pojo;

public class Employee extends Person {
    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getFace(){
        return "employee face";
    }
}
