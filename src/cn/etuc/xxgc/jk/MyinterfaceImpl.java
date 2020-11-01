package cn.etuc.xxgc.jk;

public class MyinterfaceImpl implements MyintefaceA,MyintefaceB {


    @Override
    public void mothedA() {
        System.out.println("覆盖从写了接口A");

    }



    @Override
    public void mothedB() {
        System.out.println("覆盖从写了接口B");

    }

    @Override
    public void mothedAbs() {
        System.out.println("覆盖从写了AB都有的抽象方法");
    }
}
