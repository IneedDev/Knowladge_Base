package com.kafka.avro.reflection;

import org.apache.avro.reflect.Nullable;

public class Customer {

    private String name;
    private String lasName;
    @Nullable
    private String firstName;

    //necessary to use reflection
    public Customer() {
    }

    public Customer(String name, String lasName, String firstName) {
        this.name = name;
        this.lasName = lasName;
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
