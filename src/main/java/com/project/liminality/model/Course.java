package com.project.liminality.model;

import java.time.LocalDate;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String name;
    private String descripton;
    private Integer cost;
    private LocalDate startDate;
    private LocalDate endDate;
    private Teacher teacher;

    public Course(String id, String name, String descripton, Integer cost, LocalDate startDate, LocalDate endDate,
            Teacher teacher) {
        this.id = id;
        this.name = name;
        this.descripton = descripton;
        this.cost = cost;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacher = teacher;
    }

    public Course() {
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

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", descripton=" + descripton + ", cost=" + cost + ", startDate="
                + startDate + ", endDate=" + endDate + ", teacher=" + teacher + "]";
    }
}
