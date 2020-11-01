package cn.etuc.xxgc.object;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo01data {

    public static void main(String[] args) throws ParseException {

        //Format()将Date日期转换为String
        /*//创建SimpleDateFormat对象，构造方法中传入指定模式
        SimpleDateFormat spl=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date =new Date();
        //调用SimpleDateFormat对象中的format()方法
        String text = spl.format(date);
        System.out.println(text);*/

        /*//parse()将指定模式转换为Date日期
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date parse = dateFormat.parse("2020年7月25日 19时55分20秒");
        System.out.println(parse);
*/
       /* Date date =new Date();
        long time = date.getTime();
        System.out.println(time);
        SimpleDateFormat sss=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sss.parse("2005-9-4 19:00:00");
        long time1 = parse.getTime();
        long time2 = (time - time1);
        Date date1=new Date(time2);
        System.out.println(time2);
        System.out.println(date1);*/

        //获取一个人出生到现在多少天

        SimpleDateFormat spf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("输入出生日期：");
        String birthed = new Scanner(System.in).next();
        Date birthedparse = spf.parse(birthed);
        long birthedtime = birthedparse.getTime();
        Date nowdate =new Date();
        long nowtime = nowdate.getTime();
        long time=(nowtime-birthedtime)/(24*60*60*1000);
        System.out.println(time);
    }
}
