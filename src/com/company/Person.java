package com.company;

import com.sun.jdi.connect.Transport;

public class Person {
    private String sex;
    private String id;
    private String name;
    private String age;

    public void DrivingTransport(AirTransport airTransport){
        airTransport.DrivingMethod();
    }
    public void DrivingTransport(LandTransport landTransport){
        landTransport.DrivingMethod();
    }
    public void DrivingTransport(MaritimeMeansOfTransport maritimeMeansOfTransport){
        maritimeMeansOfTransport.DrivingMethod();
    }

    public Person(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person() {
    }
}