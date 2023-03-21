package com.youtube.springBootTestApplication;

import org.springframework.stereotype.Component;

@Component
public class Test {
    public int id;
    public String fullName;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void show(){
        System.out.println("calling form Demo class");
    }
}
