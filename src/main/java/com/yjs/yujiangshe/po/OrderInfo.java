package com.yjs.yujiangshe.po;

import java.sql.Date;

public class OrderInfo {
    private String type;
    private String date;
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

    public OrderInfo(String type, String date, String title, String name, String phone) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
