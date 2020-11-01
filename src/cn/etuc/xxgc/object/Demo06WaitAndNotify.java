package cn.etuc.xxgc.object;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 等待唤醒案例：
*   创建一个消费者：调用wait方法，放弃CPU的执行，进入到waiting（无限等待）
*   创建一个生产者：调用notify方法，唤醒顾客
*
* 注意：
*   消费者和生产者必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
*   同步使用的锁对象必须保证唯一
*   只有锁对象才能调用wait和notify方法
*
* Object类中的方法
*   void wait（） 表示线程一直在等待，直到其它线程通知
*   void wait(Long timeout)线程等待指定的毫秒时间
*   void notify（） 唤醒在此对象监视器上等待的其中一个线程，选择是任意性的
*   void notifyAll() 唤醒在此对象监视器上所有等待的线程
*
* */
public class Demo06WaitAndNotify {
    public static void main(String[] args) {
        /*//创建锁对象，保证唯一
        Object obj =new Object();
        //创建一个消费者
        new Thread(){
            @Override
            public void run() {
                while(true){
                    //保证等待和唤醒只能有一个在执行
                    synchronized (obj){
                        System.out.println("告知老板我要吃包子");
                        //调用wait方法，放弃CPU执行
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后
                        System.out.println("开吃包子");
                        System.out.println("============");
                    }
                }
            }
        }.start();

        //创建一个生产者
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //创建锁对象，保证唯一


                    //保证等待和唤醒只能有一个在执行
                    synchronized (obj){
                        System.out.println("包子做好了");
                        //调用notify方法，放弃CPU执行
                        obj.notify();
                    }
                }
            }


        }.start();*/

        /*//1. 使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService se = Executors.newFixedThreadPool(2);

        //3. 调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程，执行run方法
        se.submit(new Demo05Runnable());
        se.submit(new Demo05Runnable());*/

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"三生三世");
            }
        }).start();


            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"十里桃花");
            }).start();
    }
}
