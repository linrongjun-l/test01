package cn.etuc.xxgc.demo;

import java.io.File;
import java.io.FileFilter;

/**
 * 遍历F:\ps下的。jpeg文件
 * */
public class Demo04Filter {
    public static void main(String[] args) {
        File f=new File("F:\\ps");
        getAllFile(f);

    }

    private static void getAllFile(File dir) {
        System.out.println(dir);//打印被遍历的目录名

        //实现过滤器接口抽象方法重写（使用匿名内部类实现）
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                /*
                 * 过滤的规则：判断File对象是否是.jpg结尾
                 * 是就返回true
                 * 不是就返回false
                 * */

                //如果pathname是一个文件夹，返回true
                if (pathname.isDirectory()) {
                    return true;
                }
                return pathname.getName().toLowerCase().endsWith(".png");
            }
        };

        //获取指定路径下所有文件或目录，并增加过滤器
        /*File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".png");
            }
        });*/

        //使用Lamada法则
        File[] files = dir.listFiles(( pathname)->  pathname.getName().toLowerCase().endsWith(".png")
        );


        for (File d:files) {
           //对遍历得到的d对象判断是否是文件夹
            if (d.isDirectory()){
                //d是文件夹，则继续遍历这个文件夹
                //递归调用自己
                getAllFile(d);
            }else{

                    System.out.println(d);
            }
       }
    }

}

