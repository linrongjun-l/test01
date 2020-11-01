package cn.etuc.xxgc.object;

import java.io.File;

public class Demo07File {
    public static void main(String[] args) {
        File file=new File("D:"+File.separator+"a"+File.separator+"a.txt");
        System.out.println(file);
        File f2=new File("233.txt") ;
        System.out.println(f2.getAbsoluteFile());
        System.out.println(file.getPath());
    }
}
