package com.cjhedu.demo;

/**
 * 编写一个包装类按要求修改年龄姓名和薪水
 * author：phil
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(123);
        p.setName("张三");
        System.out.println(p.info());
    }
}

class Person {
    String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);

    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("您输入的名字有误，请改正！！！将使用默认名字  无名氏");
            this.name = "无名氏";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("您输入的年龄有误！！！！将使用默认年龄18");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "name: " + getName() + " age: " + getAge() + " salary: " + getSalary();
    }
}
