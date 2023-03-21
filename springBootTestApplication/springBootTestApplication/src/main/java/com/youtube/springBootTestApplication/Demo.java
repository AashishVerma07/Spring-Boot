package com.youtube.springBootTestApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    public int ID;
    public String name;
    public String address;
    public int phoneNumber;

    public Demo(Test test) {
        this.test = test;
    }

    @Autowired
    public Test test;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void show(){
        System.out.println("Calling from main class");
        test.show();
    }
}
