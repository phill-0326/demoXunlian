package com.cjhedu.demo;

/**
 * 定义两个类设置好封装，姓名必须2-4位，余额大于20，密码必须是6位。
 * author：phil
 */
public class EncapsulationPractice {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("张飞");
        account.setBalance(555555);
        account.setPassword("006234");
        System.out.println(account.info());
    }
}

class Account {
    String name;
    double balance;
    String password;

    public Account(String name, double balance, String password) {
//        this.name = name;
//        this.balance = balance;
//        this.password = password;
        //调用的是setXxx避免有参构造造成的问题

        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字输入有误！！！");
            this.name = "无名氏";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("输入的余额有问题！");
            this.balance = 0.0;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()==6) {
            this.password = password;
        } else {
            System.out.println("你输入的密码有问题！！！");
            this.password = "000000";
        }
    }

    public String info() {
        return "name: " + getName() + " Balance: " + getBalance() + " passWord: " + getPassword();
    }
}