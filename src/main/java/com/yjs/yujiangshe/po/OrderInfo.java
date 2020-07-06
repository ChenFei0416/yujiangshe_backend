package com.yjs.yujiangshe.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class OrderInfo {
    private String type;
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date date;
    private String title;
    private String name;
    private String phone;

    @Override
    public String toString() {
        return "OrderInfo{" +
                "type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public OrderInfo(String type, Date date, String title, String name, String phone) {
        this.type = type;
        this.date = date;
        this.title = title;
        this.name = name;
        this.phone = phone;
    }

    public OrderInfo() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
