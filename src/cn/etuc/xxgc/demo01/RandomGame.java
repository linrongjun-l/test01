package cn.etuc.xxgc.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random random=new Random();
        int randomnum=random.nextInt(100);
        Scanner scanner=new Scanner(System.in);
        int count=1;
       while (true){

           System.out.println("请输入你猜测的数：");
           final int guessNum = scanner.nextInt();
           if (guessNum>randomnum){
               System.out.println("你猜大了！请重试"+count);

           }else if (guessNum<randomnum){
               System.out.println("你猜小了！请重试"+count);

           }else{
               System.out.println("恭喜你猜中了！"+count);

               break;
           }
           count++;

       }

    }
}
