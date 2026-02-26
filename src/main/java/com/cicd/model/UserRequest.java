package com.cicd.model;


public class UserRequest {

    private String name;
    private String contact;

    public UserRequest() {
    }

    public UserRequest(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}