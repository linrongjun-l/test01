package cn.etuc.xxgc.demo;

import java.io.*;

public class Demo06CopyMp3 {
    //源路径
    public static String sourse = "F:\\QQ\\1305750561\\FileRecv\\";
    //目标路径
    public static String target = "D:\\Test\\";

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Clone(sourse);
        long endTime = System.currentTimeMillis();
        System.out.println("总共用时："+(endTime-startTime));
    }

    /**
     * 遍历文件夹并复制
     * @param sourse
     * @param target
     */
    public static void Clone(String url){
        //获取目录下所有文件
        File f = new File(url);
        File[] allf = f.listFiles((new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return  pathname.isDirectory()||pathname.getName().endsWith(".mp3")|| pathname.isDirectory() ;
            }
        }));

        //遍历所有文件
        for(File fi:allf) {

                try {
                    //拼接目标位置
//                String URL = target+fi.getPath().substring(sourse.length());
                    String URL = target + fi.getName();

                    System.out.print(fi.getPath());
                    System.out.print("====");
                    System.out.println(fi.getAbsolutePath());
                    System.out.println(fi.getName());
                    //创建目录或文件
                /*if(fi.isDirectory()) {
                    Createflies(URL);
                }else {
                    fileInputOutput(fi.getAbsolutePath(),URL);
                }*/
                    if (fi.length() / 1024 / 1024 > 2) {
                        fileInputOutput(fi.getAbsolutePath(), URL);
                    }
                    //递归调用
                    if (fi.isDirectory()) {
                        Clone(fi.getAbsolutePath());
                    }

                } catch (Exception e) {
                    System.out.println("error");
                }

       }
    }

    /**
     * 复制文件
     * @param sourse
     * @param target
     */
    public static void fileInputOutput(String sourse,String target) {
        try {
            File s = new File(sourse);
            File t = new File(target);

            FileInputStream fin = new FileInputStream(s);
            FileOutputStream fout = new FileOutputStream(t);

            byte[] a = new byte[1024*1024*4];
            int b = -1;

            //边读边写
            while((b = fin.read(a))!=-1) {
                fout.write(a,0,b);
            }

            fout.close();
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建目录
     * @param name
     * @return
     */
    public static boolean Createflies(String name) {
        boolean flag=false;
        File file=new File(name);
        //创建目录
        if(file.mkdir() == true){
            //System.out.println("文件夹创建成功！");
            flag=true;
        }else {
            System.out.println("文件夹创建失败！");
            flag=false;

        }

        return flag;
    }
}
