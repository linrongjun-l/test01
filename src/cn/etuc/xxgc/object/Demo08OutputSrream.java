package cn.etuc.xxgc.object;

import java.io.*;
import java.util.Arrays;

public class Demo08OutputSrream {

    public static void main(String[] args) throws IOException {
        File dir=new File("E:"+File.separator+"a.txt");
        FileOutputStream out=new FileOutputStream(dir,true);
        //out.write(98);
        /*
        * 写入字符的方法：可以使用String类中的方法把字符串转换为字节数组
        * byte[] getBytes()把字符串转换为字节数组
        * */
        for (int i=0;i<=5;i++){
        byte[] bytes="你好，世界".getBytes();
        //System.out.println(Arrays.toString(bytes));//[-28, -67, -96, -27, -91, -67, -17, -68, -116, -28, -72, -106, -25, -107, -116]
        out.write(bytes);
        out.write("\r\n".getBytes());
        }
        out.close();

        FileInputStream in=new FileInputStream(dir);
        byte[] bytes1=new byte[1024];
        while ((in.read(bytes1))!=-1){
            System.out.println(new String(bytes1));
        }
        in.close();

        /*
        * 使用try_catch-finally处理流中的异常
        *
        * */

        //提高变量fw的作用域，让finally可以使用
        //变量在定义的时候，可以没有值，但是使用的时候必须有值
        FileWriter fw = null;
        try {
            fw=new FileWriter("E\\a.txt");
            for (int i = 0; i < 10; i++) {
                fw.write("Hello");
            }
        }catch (IOException e){
            //异常的处理逻辑
            System.out.println();
        }finally {
            //创建对象失败，fw默认就是null,null是不能调用方法的，
            //会报空指针异常
            if (fw!=null){
                try {
                    //fw.close方法声明抛出了IoException异常
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}


