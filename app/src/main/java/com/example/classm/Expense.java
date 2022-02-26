package com.example.classm;

public class Expense
{
    int id;
    String name;
    String receiverName;
    String date;
    String day;
    double price;
    int percentage;

    public Expense(int id, String name, String receiverName, String date, String day, double price, int percentage)
    {
        this.id = id;
        this.name = name;
        this.receiverName = receiverName;
        this.date = date;
        this.day = day;
        this.price = price;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public double getPrice() {
        return price;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", price=" + price +
                ", percentage=" + percentage +
                '}';
    }
}
