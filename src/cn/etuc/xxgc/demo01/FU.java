package cn.etuc.xxgc.demo01;

public class FU {
    public  String name;
    public int age;

    public FU() {
    }

    public FU(String name, int age) {
        this.name = name;
        this.age = age;
    }
        int num=20;
    public void method(){
        System.out.println("我是父类");
        System.out.println(name);
    }
}
