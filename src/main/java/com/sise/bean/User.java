package com.sise.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;



public class User {
    private Long id;
    private String name;
    private Integer age;

@DateTimeFormat(pattern = "yyyy-MM-dd")
@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date bornDate;
    private String headImg;


    public User() {}

    public User(Long id, String name, Integer age, Date bornDate, String headImg) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bornDate = bornDate;
        this.headImg = headImg;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bornDate=" + bornDate +
                ", headImg='" + headImg + '\'' +
                '}';
    }
}
