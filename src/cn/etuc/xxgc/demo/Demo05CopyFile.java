package cn.etuc.xxgc.demo;

import java.io.*;
import java.util.Arrays;

public class Demo05CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("E:\\a.txt");
        //FileOutputStream out = new FileOutputStream("E:\\a.txt");
    byte[] buf=new byte[1024];
    while ((in.read(buf))!=-1){
        System.out.println(new String(buf));

    }

       /* long len = 0;
        while ((len = in.read()) != -1) {
            System.out.println((char) len);
        }*/
        in.close();
    }
}

