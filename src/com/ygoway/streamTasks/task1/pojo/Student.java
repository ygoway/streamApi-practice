package com.ygoway.streamTasks.task1.pojo;

public class Student {
    protected String firstName;
    protected int age;
    protected int avgMark;

    public Student(String firstName, int age, int avgMark) {
        this.firstName = firstName;
        this.age = age;
        this.avgMark = avgMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(int avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", avgMark=" + avgMark +
                '}';
    }
}
