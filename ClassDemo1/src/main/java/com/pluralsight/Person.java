package com.pluralsight;

public class Person {

    //this is what were storing but since its private we cant get it.
    private String fullName;
    private int age;
    private String profession;


    //same name as class
    public Person(String fullName, int age, String profession){
        this.fullName = fullName;
        this.age = age;
        this.profession = profession;
    }

    //get the person name
    public String getFullName() {
        return this.fullName;
    }

    //change the person name
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    //get the person age
    public int getAge(){
        return this.age;
    }

    //change the person age
    public void setAge(){
        this.age =  age;
    }

    public String getProfession(){
        return this.profession;
    }

    public void setProfession(String profession){
        this.profession = profession;

    }



}
