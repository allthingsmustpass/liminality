package com.project.liminality.model;

import org.hibernate.annotations.GenericGenerator;
import com.project.liminality.enums.Usertype.role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Teacher extends User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String name;
    private String surname;
    private List<Course> ongoingcourse;

    @Enumerated(EnumType.STRING)
    private role usertype;

    public Teacher() {
    }

    public Teacher(String id, String username, String password, String email, role usertype, String id2, String name,
            String surname, Course ongoingcourse, role usertype2) {
        super(id, username, password, email, usertype);
        id = id2;
        this.name = name;
        this.surname = surname;
        this.ongoingcourse = ongoingcourse;
        usertype = usertype2;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Course getOngoingcourse() {
        return ongoingcourse;
    }

    public void setOngoingcourse(Course ongoingcourse) {
        this.ongoingcourse = ongoingcourse;
    }

    public role getUsertype() {
        return usertype;
    }

    public void setUsertype(role usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", surname=" + surname + ", ongoingcourse=" + ongoingcourse
                + ", usertype=" + usertype + "]";
    }
}