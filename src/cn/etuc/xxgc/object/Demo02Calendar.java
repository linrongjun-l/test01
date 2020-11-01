package cn.etuc.xxgc.object;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        //demo01();
        //demo02();
        //demo03();
        demo04();
    }

    private static void demo04() {
        StringBuilder bu1=new StringBuilder();
        //append方法返回的是this，调用方法的对象是bu1
        //使用append 方法无需接收返回值
        bu1.append("迪丽热巴").append("古力娜扎");
        System.out.println(bu1);

        String str="100";
        System.out.println(str+100);//100100
        int i=Integer.parseInt(str);
        System.out.println(i+100);//200
        
        double d = Double.parseDouble(str);
        System.out.println(d);//100.0
    }



    /*private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year=c.get(Calendar.YEAR);//年
        System.out.println(year);

        int month=c.get(Calendar.MONTH);
        System.out.println(month+1);//月

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);//日

    }*/

    /*private static void demo02() {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,1999);

        int year=c.get(Calendar.YEAR);//年
        System.out.println(year);

        int month=c.get(Calendar.MONTH);
        System.out.println(month+1);//月

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);//日
    }*/

   /* private static void demo03() {

        Calendar c = Calendar.getInstance();
        //把年增加1年
        c.add(Calendar.YEAR,1);
        //把月减少3月
        c.add(Calendar.MONTH,-3);

        int year=c.get(Calendar.YEAR);//年
        System.out.println(year);

        int month=c.get(Calendar.MONTH);
        System.out.println(month+1);//月

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);//,日
    }*/




}
