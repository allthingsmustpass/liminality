package com.project.liminality.model;

import org.hibernate.annotations.GenericGenerator;
import com.project.liminality.enums.Usertype.role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class User {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String username;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private role usertype;

    public User() {
    }

    public User(String id, String username, String password, String email, role usertype) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.usertype = usertype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public role getUsertype() {
        return usertype;
    }

    public void setUsertype(role usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
                + ", usertype=" + usertype + "]";
    }
}
