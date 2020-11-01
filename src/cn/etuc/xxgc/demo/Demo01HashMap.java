package cn.etuc.xxgc.demo;

import java.util.HashMap;
import java.util.Scanner;

public class Demo01HashMap {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //2.创建Map集合，key是字符串中的字符，value是字符的个数
        HashMap<Character, Integer> map =new HashMap<>();
        //3.遍历字符串，获取每一个字符串
        for (char c:str.toCharArray()) {
            //4.使用获取到了字符，去判断key是否存在
            if (map.containsKey(c)) {
                //key存在
                Integer value1 = map.get(c);
                System.out.println(map.get(c)+".......");
                value1++;
                map.put(c, value1);
            } else {
                //key不存在
                map.put(c, 1);
            }
        }
            //5遍历Map集合，输出结果
            for (Character key: map.keySet()) {
                Integer values = map.get(key);
                System.out.println(key+"="+values);
            }

            new Thread(){
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            }.start();
    }

}
