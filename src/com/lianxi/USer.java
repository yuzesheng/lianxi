package com.lianxi;

/**
 * @author yuzs
 * @date 2022-06-2022/6/2-11:14
 */
public class USer {
    private int year;
    private String name;
    private String work;
    private double salary;

    public USer() {
    }

    public USer(int year, String name, String work, double salary) {
        this.year = year;
        this.name = name;
        this.work = work;
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
