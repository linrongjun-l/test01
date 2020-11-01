package cn.etuc.xxgc.object;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo09Properties {
    public static void main(String[] args) throws IOException {
        //demo01();//使用properties集合写文件
        demo02();//使用properties集合读文件
    }

    private static void demo02() throws IOException {
        //1. 创建Properties集合对象
        Properties pro=new Properties();
        //2.使用Properties集合对象load（）方法
        pro.load(new FileReader("D:\\b.txt"));
        //3. 遍历properties结合
        Set<String> strings = pro.stringPropertyNames();
        for (String key:strings) {
            String value = pro.getProperty(key);
            System.out.println(key+"="+value);
        }
    }

    private static void demo01() throws IOException {
         //1.创建Properties集合对象，添加数据
        Properties prop=new Properties();
        prop.setProperty("迪丽热巴","170");
        prop.setProperty("于文文","175");
        prop.setProperty("古力娜扎","160");

        // 2.创建字节/字符输出流对象
        FileWriter fw=new FileWriter("D:\\b.txt");

        // 3.使用Properties集合中的方法store，把集合中得到临时数据写入硬盘
        prop.store(fw,"save data");

        //4.释放资源
        fw.close();


    }
}
