package com.cjhedu.demo.afternoon;

/**
 * 编写 Computer 类， 包含 CPU、 内存、 硬盘等属性， getDetails 方法用于返回 Computer 的详细信息
 * 编写 PC 子类， 继承 Computer 类， 添加特有属性【品牌 brand】
 * 编写 NotePad 子类， 继承 Computer 类， 添加特有属性【color】
 * 编写 Test 类， 在 main 方法中创建 PC 和 NotePad 对象， 分别给对象中特有的属性赋值， 以及从 Computer 类继承的
 * 属性赋值， 并使用方法并打印输出信息
 * author : phil
 */
public class ExtendsExercise03 {
    public static void main(String[] args) {
//        Computer computer = new Computer();
//        computer.setCPU("AMD R9");
//        computer.setDisk("sanxing");
//        computer.setMemory(1024);
//        System.out.println(computer.getDetail());
        PC pc = new PC();
        pc.setCPU("AMD R9");
        pc.setDisk("sanxing");
        pc.setMemory(1024);
        pc.setBrand("macbook");
        pc.printInfo();
    }
}
class Computer{
    private String CPU;
    private int memory;
    private String disk;

    public Computer(String CPU, int memory, String disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public Computer() {
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
    public String getDetail(){
        return "CPU: " + getCPU() +" 内存: "+getMemory()+" 硬盘: "+getDisk();
    }
}


