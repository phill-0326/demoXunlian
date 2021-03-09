package com.cjhedu.demo.afternoon;

public class NotePad extends Computer{
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public NotePad(String CPU, int memory, String disk, String color) {
        super(CPU, memory, disk);
        this.color = color;

    }
    public void printInfo1(){
        System.out.println("PC信息=");
        System.out.println(getDetail()+ " color： " + color);
    }

    public NotePad() {
    }
}
