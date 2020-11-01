package cn.etuc.xxgc.demo;

import java.io.File;
import java.util.Arrays;
/**
 * 遍历F:\ps下的。jpeg文件
 * */
public class Demo03Recurison {
    public static void main(String[] args) {
        File f=new File("F:\\ps");
        getAllFile(f);
    }

    private static void getAllFile(File dir) {
        System.out.println(dir);//打印被遍历的目录名
        File[] files = dir.listFiles();
       for (File d:files) {
           //对遍历得到的d对象判断是否是文件夹
            if (d.isDirectory()){
                //d是文件夹，则继续遍历这个文件夹
                //递归调用自己
                getAllFile(d);
            }else{
                //1.把File对象的d转换成String
               // String name = d.getName();
                //String path = d.getPath();
                String s = d.toString();
                //2调用String 类中的方法endWith判断字符是否以.jpg结尾
                boolean b = s.endsWith(".jpg");
                if (b) {
                    System.out.println(d);
                }
            }
        }

    }
}
