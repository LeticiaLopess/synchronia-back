package com.synchronia.letfolio.entrypoint.rest.dto;

import com.synchronia.letfolio.core.model.Address;
import com.synchronia.letfolio.core.model.Course;
import com.synchronia.letfolio.core.model.Role;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private String username;
    private String password;
    private String mail;
    private String phoneNumber;
    private String birthDate;
    private Instant creationDate;
    private Address address;
    private List<Role> role;
    private List<Course> courses;

    public UserDTO() {
    }

    public UserDTO(String username, String password, String mail, String phoneNumber, String birthDate, Address address) {
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.address = address;
        this.role = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Role> getRole() {
        return role;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
