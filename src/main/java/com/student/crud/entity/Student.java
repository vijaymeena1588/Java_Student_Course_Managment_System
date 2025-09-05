package com.student.crud.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "course")
    private String course;

    @Column(name = "age")
    private Integer age;

    public Student() {}

    public Student(String name, String groupName, String course, Integer age) {
        this.name = name;
        this.groupName = groupName;
        this.course = course;
        this.age = age;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGroupName() { return groupName; }
    public void setGroupName(String groupName) { this.groupName = groupName; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
}
