package cn.etuc.xxgc.demo01;

import cn.etuc.xxgc.demo01.FU;

public class Zi extends FU {

    int num;
    public Zi() {
        //super();//访问父类构造
        this(123);
    }

    public Zi(int num) {
        this.num = num;
    }

    public void methodzi(){
        int num=12;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类成员变量
        System.out.println(super.num);//父类中成员变量

        this.method();//访问本类另一个成员方法
        super.method();//访问父类成员方法
    }




    @Override
    public void method() {
        super.method();//
        System.out.println("我是子类");
    }

    public static void main(String[] args) {
        System.out.println("=====");
        System.out.println(1-(275109/298149));
    }
    /*298149  275109*/
}
