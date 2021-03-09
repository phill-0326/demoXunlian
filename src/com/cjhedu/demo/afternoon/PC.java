package com.cjhedu.demo.afternoon;

public class PC extends Computer{
    private String brand;

    public PC(String CPU, int memory, String disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public PC() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息=");
        System.out.println(getDetail()+ " brand： " + brand);
    }
}
