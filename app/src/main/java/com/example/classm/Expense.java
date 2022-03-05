package com.example.classm;

import java.io.Serializable;

public class Expense implements Serializable
{
    private String id;
    private String name;
    private String date;
    private String day;
    private Double price;
    private Integer percentage;
    private ExpenseCat category;

    public Expense(String id, String name, String date, String day, Double price, Integer percentage, ExpenseCat category) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.day = day;
        this.price = price;
        this.percentage = percentage;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public ExpenseCat getCategory() {
        return category;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public void setCategory(ExpenseCat category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", price=" + price +
                ", percentage=" + percentage +
                ", category=" + category +
                '}';
    }
}
