package cn.etuc.xxgc.object;
/*
*   实现步骤：
*       1.创建一个thread类的子类
*       2.在thread类的子类中重写thread类中的run方法，设置线程任务
*       3.创建thread类的子类对象
*       4.调用thread类中的方法start方法，开启新的线程，执行run方法
*  */
public class Demo04Thread extends Thread  {
    public Demo04Thread() {
    }

    public Demo04Thread(String name) {
        super(name);
    }

    //2.在thread类的子类中重写thread类中的run方法，设置线程任务
    @Override

    public void run() {
        String name = getName();
        System.out.println(name);

    }

    public static void main(String[] args) {
        Demo04Thread d=new Demo04Thread();
        d.start();
        new Demo04Thread("张三").start();
        String thread = Thread.currentThread().getName();
        System.out.println(thread);

    }
}
