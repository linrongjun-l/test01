package cn.etuc.xxgc.jk;

import java.time.Year;
import java.util.Random;

public class Out {
    public  int  num=10;
    public  class In{
        public  int num=20;
        public void mothed1(){
            System.out.println("内部 "+this.num);
            System.out.println("内部 "+Out.this.num);

        }
    }


    public void mothed(){
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int nu =r.nextInt(100-30+1)+30;
            if (i%5==0) {
                System.out.println(nu + " ");
            }else {
                System.out.print(nu + " ");
            }
        }

    }
    void mothed1(){
        String str="350783199904118512";
        String substring = str.substring(6, 10);

        System.out.println(substring);
    }


    public static void main(String[] args) {
        Out.In s=new Out().new In();
        s.mothed1();
        Out o=new Out();
        //o.mothed();
        o.mothed1();
    }
}
