package cn.etuc.xxgc.object;

public class Demo05Runnable  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }

    public static void main(String[] args) {
        //创建一个Runable接口的实现类对象
        Demo05Runnable dd=new Demo05Runnable();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t=new Thread(dd);
        //调用Thread类中的start方法，开启新线程
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }

        //线程的父类是Thread
        //new Demo04Thread().start;
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->" +i);
                }
            }
        }.start();

        //线程的接口Runnable
        //Runnable r=nwe Runnable();
        //Thread r=nwe Thread(r);
        Runnable rr = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        };
        new Thread(rr).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->" +i);
                }
            }
        }).start();
    }
}
